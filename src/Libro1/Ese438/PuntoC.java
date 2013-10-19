
package Libro1.Ese438;

import java.util.Scanner;

public class PuntoC {
    Scanner input = new Scanner(System.in);
    private int precisione, esponente, fattoriale=1;
            double ecost=1.0, espo=1.0;
    
    public void immissioneNumero(){
        System.out.print("Inserisci esponente: ");
        esponente=input.nextInt();
        System.out.print("Inserisci precisione di e: ");
        precisione=input.nextInt();
    }
    
    public void calcolaE(){
       while(precisione>0){  
           espo*=Math.pow((double)esponente,(double)precisione); 
           ecost+=espo/(fattoriale(precisione));
           precisione--;
           fattoriale=1;
           espo=1.0;
       } 
    }

    public int fattoriale(int pre){
        if(pre==0)
            fattoriale=1;
        
        if(pre==1)
            fattoriale=1;
        
        if(pre>1){
            fattoriale*=pre;
            while(pre>1){
                fattoriale*=(pre-1);
                pre--;
            }
        }
       return fattoriale; 
    }
    
    
    public void stampa(){
        System.out.print("E: ");
        System.out.println(ecost);
    }
}
