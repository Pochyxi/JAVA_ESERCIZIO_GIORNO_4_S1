package it.AdienerEpicode.core;


import Dipendente.Dipendente;

import static Dipendente.Dipartimento.*;

import static Dipendente.Livello.*;

public class Main {

    public static void main ( String[] args ) {
      Dipendente d1 = new Dipendente ( "Franco", 23, PRODUZIONE );
      Dipendente d2 = new Dipendente ( "Maria", 24, PRODUZIONE );
      Dipendente d3 = new Dipendente ( "Flavio", 22, DIRIGENTE, VENDITE );
      Dipendente d4 = new Dipendente ( "Luca", 21, IMPIEGATO,  AMMINISTRAZIONE );

      d1.stampaDipendente ();
      d2.stampaDipendente ();
      d3.stampaDipendente ();
      d4.stampaDipendente ();

      System.out.println ("Calcolo dello stipendio compreso di tasse: " + CalcolaPagaConStraordinario(d4, 11) );

    }

    static double CalcolaPagaConStraordinario(Dipendente dip, double ore) {
        return dip.getStipendio ( ) + (dip.getImportoOrarioStraordinario ( ) * ore);
    }
}
