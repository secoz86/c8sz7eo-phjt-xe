package Libro1.Ese226;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Inserisci il primo numero: ");
        n1=input.nextInt();
        
        System.out.print("Inserisci il secondo numero: ");
        n2=input.nextInt();
        
        if((n1%n2)==0)
            System.out.printf("%d e' multiplo di %d", n1,n2);
        
        if((n1%n2)!=0)
            System.out.printf("%d non e' multiplo di %d", n1,n2);
    }
}
