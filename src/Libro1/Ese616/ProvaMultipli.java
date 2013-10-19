package Libro1.Ese616;

import java.util.Scanner;

public class ProvaMultipli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Multipli prova = new Multipli();
        
        System.out.print("Inserisci primo numero: ");
        prova.num1=input.nextInt();
        
        System.out.print("Inserisci secondo numero: ");
        prova.num2=input.nextInt();
        
        if(prova.verificaMultipli(prova.num1, prova.num2))
            System.out.print("I due numeri sono multipli\n");
        else
            System.out.print("I due numeri non sono multipli\n");
        
    }
}
