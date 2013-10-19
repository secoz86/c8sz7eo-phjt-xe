package Libro1.Ese632;

import java.util.Random;
import java.util.Scanner;

public class Moltiplicazioni {
    private Random numeroRandom = new Random();
    private Scanner input = new Scanner(System.in);
    private int num1, num2, risultato, contatore=0;
    private int contaPos=0, contaNeg=0;
    
    public int getContatore(){
        return contatore;
    }
    
    public void incrementaContatore(){
        contatore++;
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
        if((num1*num2)!=risultato)
            contaNeg++;
        else
            contaPos++;
    }
    
    public void stampaRisultato(){
        if(((contaPos/10)*100)-((contaNeg/10)*100)<=75)
            System.out.print("Per favore chiedi ulteriori spiegazioni all'insegnate");
        else
            System.out.print("Bravo!");
    }  
}