package Libro1.Ese630;

import java.util.Random;
import java.util.Scanner;

public class Moltiplicazioni {
    private Random numeroRandom = new Random();
    private Scanner input = new Scanner(System.in);
    private int num1, num2, risultato, scelta;
    
    public void immissione(){
        System.out.print("Premi 1 per continuare | Premi -1 per terminare: ");
        scelta=input.nextInt();
    }
    
    public int getScelta(){
        return scelta;
    }
    
    public void setScelta(int sce){
        scelta=sce;
    }
    
    public void generaMoltiplicazione(){
        num1=numeroRandom.nextInt(9);
        num2=numeroRandom.nextInt(9);
    }
    
    public void stampaMoltiplicazione(){
        System.out.printf("Quanto fa %d per %d?: ",num1,num2);
    }
    
    public void immissioneRisultato(){
        risultato=input.nextInt();
    }
    
    public void verifica(){
        while((num1*num2)!=risultato){
            System.out.print("No, ritenta ancora\n\n");
            stampaMoltiplicazione();
            immissioneRisultato();
        }
        System.out.print("Molto bene!\n\n");      
    }           
}