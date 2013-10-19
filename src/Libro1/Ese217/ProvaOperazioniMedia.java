package Libro1.Ese217;

import java.util.Scanner;

public class ProvaOperazioniMedia{
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, somma, media, prodotto, min=0, max=0;
        
        System.out.print("Inserisci il primo numero: ");
        n1=input.nextInt();
        
        System.out.print("Inserisci il secondo numero: ");
        n2=input.nextInt();
        
        System.out.print("Inserisci il terzo numero: ");
        n3=input.nextInt();
        
        somma=n1+n2+n3;
        media=(n1+n2+n3)/3;
        prodotto=n1*n2*n3;
        
        //Trova il minimo
        if(n1<n2)
            min=n1;
        
        if(n1>n2)
            min=n2;
        
        if(min>n3)
            min=n3;
        
        //Trova il massimo
        if(n1<n2)
           max=n2;
        
        if(n1>n2)
            max=n1;
        
        if(max<n3)
            max=n3;
        
        //Stampa a schermo
        System.out.printf("\nSomma: %d\nMedia: %d\nProdotto: %d\nMinimo: %d\nMassimo: %d\n", somma,media,prodotto,min,max);      
    }
}