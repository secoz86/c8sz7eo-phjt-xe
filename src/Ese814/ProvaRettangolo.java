/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese814;

/**
 *
 * @author Daniele
 */
import java.util.Scanner;

public class ProvaRettangolo {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

       double x1, y1;
       double x2, y2;
       double x3, y3;
       double x4, y4;
       
       System.out.println("Inserisci coordinate del rettangolo.");
       
       System.out.print("x1: ");
       x1=input.nextDouble();
       
       System.out.print("y1: ");
       y1=input.nextDouble();
       
       System.out.print("x2: ");
       x2=input.nextDouble();
       
       System.out.print("y2: ");
       y2=input.nextDouble();
       
       System.out.print("x3: ");
       x3=input.nextDouble();
       
       System.out.print("y3: ");
       y3=input.nextDouble();
       
       System.out.print("x4: ");
       x4=input.nextDouble();
       
       System.out.print("y4: ");
       y4=input.nextDouble();
       
       Rettangolo prova = new Rettangolo(x1,y1,x2,y2,x3,y3,x4,y4);
       
       prova.verificaQuadrato();
            
       prova.verificaRettangolo();
            
       System.out.printf("%s",prova.toString());
            
        
       
       
    }
}
