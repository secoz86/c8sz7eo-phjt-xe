package Libro1.Ese512;

public class Prodotto {
    private int prodotto=1, contatore;
    
    public void calcola(){
        for(contatore=1;contatore<=15;contatore++){
            if(contatore%2!=0)
                prodotto*=contatore;   
        }
    }
    
    public void stampa(){
        System.out.printf("Il prodotto e' uguale a %d\n", prodotto);
    }
}
