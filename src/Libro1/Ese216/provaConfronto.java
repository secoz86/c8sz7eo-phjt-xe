package Libro1.Ese216;

import java.util.Scanner;

public class provaConfronto{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1=input.nextInt();
        
        System.out.print("Inserisci il secondo numero: ");
        n2=input.nextInt();
        
        if(n1==n2)
            System.out.print("I due numeri sono uguali.\n");
        
        if(n1>n2)
            System.out.printf("%d e' il numero piu' grande.\n", n1);
        
        if(n1<n2)
            System.out.printf("%d e' il numero piu' grande.\n", n2);       
    }
}