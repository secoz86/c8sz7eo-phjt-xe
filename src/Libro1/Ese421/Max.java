package Libro1.Ese421;

public class Max {
    private int max=-1000;
    
     public void salvaMax(int numero){
        if(numero>max)
            max=numero;
     }
     
     public void stampa(){
        System.out.printf("Il massimo e' %d\n", max);
     }
}
