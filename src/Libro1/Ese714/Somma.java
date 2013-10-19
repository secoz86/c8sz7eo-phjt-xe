package Libro1.Ese714;

public class Somma {
    public int numeri (int... numeri){
        int prodotto=1;
        
        for(int numero : numeri)
            prodotto*=numero;
        
        return prodotto;    
    }
}
