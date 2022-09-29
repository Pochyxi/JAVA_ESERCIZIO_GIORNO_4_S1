package Dipendente;

import static Dipendente.Livello.*;

public class Dipendente {
    private static double stipendioBase = 1000;
    private int matricola;
    private  String nome;
    private  double stipendio;
    private double importoOrarioStraordinario;
    private  Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String _nome, int _matricola, Dipartimento _dipartimento) {
        matricola = _matricola;
        nome = _nome;
        dipartimento = _dipartimento;
        setStipendio ();
        importoOrarioStraordinario = 30;
        livello = Livello.OPERAIO;
    }

    public Dipendente( String _nome, int _matricola, Livello _livello, Dipartimento _dipartimento ) {
        nome = _nome;
        matricola = _matricola;
        setStipendio ();
        importoOrarioStraordinario = 30;
        livello = _livello;
        dipartimento = _dipartimento;
    }

    // CALCOLA AUTOMATICAMENTE LO STIPENDIO IN BASE AL LIVELLO
    private void setStipendio() {
        double newStipendio = 0;

        if (livello == IMPIEGATO) {
            newStipendio = stipendioBase * 1.2;
        } else if ( livello == QUADRO) {
            newStipendio = stipendioBase * 1.5;
        } else if ( livello == DIRIGENTE) {
            newStipendio = stipendioBase * 2;
        } else {
            newStipendio = stipendioBase;
        }
        stipendio = newStipendio;
    }
    public double getStipendio() {

        return stipendio;
    }
    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public void stampaDipendente() {
        System.out.println("Nome: " + nome + "\nLivello: " + livello + "\nDipartimento: " + dipartimento + "\nStipendio: "
                + stipendio);
    }

    public Livello promotion(){
        if(livello == DIRIGENTE){
            System.out.println("Non puoi salire di livello");
        } else if (livello == QUADRO) {
            livello = DIRIGENTE;
        }else if (livello == IMPIEGATO) {
            livello = QUADRO;
        }else {livello = IMPIEGATO;}

        setStipendio();

        return livello;
    }

}

