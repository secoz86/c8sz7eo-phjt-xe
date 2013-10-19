package Libro1.Ese631;

public class ProvaMoltiplicazioni {

    public static void main(String[] args) {
       Moltiplicazioni prova = new Moltiplicazioni();
       
       prova.immissione();
       
       while(prova.getScelta()!=-1){
           prova.generaMoltiplicazione();
           prova.stampaMoltiplicazione();
           prova.immissioneRisultato();
           prova.verifica();
           prova.immissione();
       }
    }
}
