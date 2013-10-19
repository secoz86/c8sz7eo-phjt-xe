package Libro1.Ese438;

import java.util.Scanner;

public class PuntoA {
    Scanner input = new Scanner(System.in);
    private int numero, fattoriale=1;
    
    public void immissioneNumero(){
        System.out.print("Inserisci numero non negativo: ");
        numero=input.nextInt();
    }
    
    public void fattoriale(){
        if(numero==0)
            fattoriale=1;
        
        if(numero==1)
            fattoriale=1;
        
        if(numero>1){
            fattoriale*=numero;
            while(numero>1){
                fattoriale*=(numero-1);
                numero--;
            }
        }
        
    }
    
    public void stampa(){
        System.out.printf("Fattoriale: %d\n\n", fattoriale);
    }
    
}
