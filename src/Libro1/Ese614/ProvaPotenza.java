package Libro1.Ese614;

import java.util.Scanner;

public class ProvaPotenza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Potenza potenza= new Potenza();
                
        System.out.print("Inserisci base: ");
        potenza.setBase(input.nextInt());
        
        System.out.print("Inserisci esponente: ");
        potenza.setEsponente(input.nextInt());
        
        System.out.printf("Potenza: %d\n",potenza.potenzaIntera(potenza.getBase(), potenza.getEsponente()));
    }
}
