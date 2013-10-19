package Libro1.Ese629;

public class ProvaMoneta {

    public static void main(String[] args) {
        Moneta prova = new Moneta();
        
        prova.immissione();
        
        while(prova.getScelta()==1){
            prova.lancio();
            prova.conta();
            prova.stampa();
            
            prova.immissione();            
        }
    }
}
