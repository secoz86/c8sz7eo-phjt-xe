package Libro1.Ese225;

import java.util.Scanner;

public class PariDispari{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1;
        
        System.out.print("Inserisci il numero da verificare: ");
        n1=input.nextInt();
        
        if((n1%2)==0)
            System.out.println("Il numero è pari");
        
        if((n1%2)!=0)
            System.out.println("Il numero è dispari");
    }
}