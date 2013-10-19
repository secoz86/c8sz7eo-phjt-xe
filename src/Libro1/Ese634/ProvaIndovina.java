package Libro1.Ese634;

public class ProvaIndovina {

    public static void main(String[] args) {
        Indovina prova = new Indovina();
        
        prova.generaNumero();
        while(prova.getFine()==false){
            prova.immissione();
            prova.verifica();            
        }
    }
}
