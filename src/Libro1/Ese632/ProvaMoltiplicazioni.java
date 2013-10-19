package Libro1.Ese632;

public class ProvaMoltiplicazioni {

    public static void main(String[] args) {
       Moltiplicazioni prova = new Moltiplicazioni();
       
       while(prova.getContatore()<10){
           prova.generaMoltiplicazione();
           prova.stampaMoltiplicazione();
           prova.immissioneRisultato();
           prova.verifica();
           prova.incrementaContatore();
       }
           prova.stampaRisultato();   
    }
}
