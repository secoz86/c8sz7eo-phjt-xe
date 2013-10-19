package Libro1.Ese620;

import java.util.Scanner;

public class Area {
    private Scanner input = new Scanner(System.in);
    private double raggio;
    
    public void immissione(){
        System.out.print("Inserisci raggio: ");
        raggio=input.nextDouble();
    }
    
    public double areaCerchio(){
        return Math.PI * Math.pow(raggio, 2);
    }
    
    public void stampa(){
        System.out.printf("Area: %f\n", areaCerchio());
    }
}
