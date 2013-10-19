package Libro1.Ese437;

public class ProvaCriptaDecripta {

    public static void main(String[] args) {
        Cripta numero = new Cripta();
        Decripta numero2 = new Decripta();
        
        numero.immissione();
        numero.cripta();
        numero.stampa();
        
        numero2.immissione();
        numero2.decripta();
        numero2.stampa();
    }
}
