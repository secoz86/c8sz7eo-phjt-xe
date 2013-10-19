package Libro1.Ese438;

public class ProvaFattoriale {

    public static void main(String[] args) {
        
        //FORSE C'E' QUALCHE ERRORE NEL PUNTOB E C
        PuntoA prova = new PuntoA();
        PuntoB provab = new PuntoB();
        PuntoC provac = new PuntoC();
        
        prova.immissioneNumero();
        prova.fattoriale();
        prova.stampa();
        
        provab.immissioneNumero();
        provab.calcolaE();
        provab.stampa();
        
        provac.immissioneNumero();
        provac.calcolaE();
        provac.stampa();
        
    }
}
