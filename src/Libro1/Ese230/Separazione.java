package Libro1.Ese230;

import java.util.Scanner;

public class Separazione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        System.out.print("Inserisci il numero: ");
        numero=input.nextInt();
        
        System.out.printf("%d   ", ((numero%100000))/10000);
        System.out.printf("%d   ", ((numero%10000))/1000);
        System.out.printf("%d   ", ((numero%1000))/100);
        System.out.printf("%d   ", ((numero%100))/10);
        System.out.printf("%d   ", ((numero%10))/1);
        
    }
}
