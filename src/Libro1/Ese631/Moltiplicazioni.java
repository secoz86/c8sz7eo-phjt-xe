package Libro1.Ese631;

import java.util.Random;
import java.util.Scanner;

public class Moltiplicazioni {
    private Random numeroRandom = new Random();
    private Random fraseCasuale = new Random();
    private Scanner input = new Scanner(System.in);
    private int num1, num2, risultato, scelta, frase;
    
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
            fraseCasualeNegativa();
            stampaMoltiplicazione();
            immissioneRisultato();
        }
        fraseCasualePositiva();      
    }
    
    public void fraseCasualePositiva(){
        frase=fraseCasuale.nextInt(3);
        
        switch(frase){
            case 0:
                System.out.printf("Molto Bene!\n\n");
                break;
            
            case 1:
                System.out.printf("Eccellente!\n\n");
                break;
                
            case 2:
                System.out.printf("Ottimo lavoro!\n\n");
                break;
            
            case 3:
                System.out.printf("Continua cosi'!\n\n");
                break;
        }
    }
    
    public void fraseCasualeNegativa(){
        frase=fraseCasuale.nextInt(3);
        
        switch(frase){
            case 0:
                System.out.printf("No, ritenta ancora.\n\n");
                break;
            
            case 1:
                System.out.printf("Sbagliato. Riprova.\n\n");
                break;
                
            case 2:
                System.out.printf("Non arrenderti!\n\n");
                break;
            
            case 3:
                System.out.printf("No, continua a provare.\n\n");
                break;
        }
    }      
}