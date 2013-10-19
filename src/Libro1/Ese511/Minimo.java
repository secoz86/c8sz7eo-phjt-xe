package Libro1.Ese511;

import java.util.Scanner;

public class Minimo {
    private int numeri, intero, minimo, contatore;
    Scanner input = new Scanner(System.in);
    
    public void immissioneNumeri(){
        System.out.print("Inserisci il numero di interi da considerare: ");
        numeri=input.nextInt();
    }
    
    public void minimo(){
        for(contatore=0;contatore<numeri;contatore++){
            System.out.print("Inserisci numero intero: ");
            intero=input.nextInt();
            
            if(contatore==0)
                minimo=intero;
            else
                if(intero<minimo)
                    minimo=intero;
            
        }
    }
    
    public void stampa(){
        System.out.printf("Il numero piu' piccolo e' %d.\n",minimo);
    }
}
