package Libro1.Ese215;

import java.util.Scanner;

public class provaOperazioni{
    public static void main (String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1=input.nextInt();
        
        System.out.print("Inserisci il secondo numero: ");
        n2=input.nextInt();
        
        System.out.printf("Somma di %d e %d: %d\nProdotto di %d e %d: %d\nDifferenza di %d e %d: %d\nQuoziente di %d e %d: %d\n", n1, n2,(n1+n2),n1,n2,(n1*n2),n1,n2,(n1-n2),n1,n2,(n1/n2));
    }
}