package Libro1.Ese623;

import java.util.Scanner;

public class Minimo {
    private double num1, num2, num3;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("inserisci primo numero: ");
        num1=input.nextDouble();
        
        System.out.print("inserisci secondo numero: ");
        num2=input.nextDouble();
        
        System.out.print("inserisci terzo numero: ");
        num3=input.nextDouble();      
    }
    
    public double minimo(){
        return Math.min(Math.min(num1, num2), num3);
    }
    
    public void stampa(){
        System.out.printf("Minimo: %f\n",minimo());
    }
}
