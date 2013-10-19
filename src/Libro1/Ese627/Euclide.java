package Libro1.Ese627;

import java.util.Scanner;

public class Euclide {
    private Scanner input = new Scanner(System.in);
    private int num1, num2;
    
    public void immissione(){
        System.out.print("Inserisci primo numero: ");
        num1=input.nextInt();
        
        System.out.print("Inserisci secondo numero: ");
        num2=input.nextInt();
    }
    
    public int calcola(int a, int b){
        int r;
        r = a % b;             // operazione modulo //
        while(r != 0){          // ciclo di iterazione //
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    
    public void stampa(){
        System.out.printf("MCD di %d e %d: %d",num1,num2,calcola(num1,num2));
    }
}