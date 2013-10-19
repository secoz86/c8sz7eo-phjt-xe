package Libro1.Ese634;

import java.util.Random;
import java.util.Scanner;

public class Indovina {
    private Scanner input = new Scanner(System.in);
    private Random numero = new Random();  
    private int numeroCasuale, numeroInput, contatore=0;
    private boolean fine=false;
    
    public boolean getFine(){
        return fine;
    }
    public void generaNumero(){
        numeroCasuale=1+numero.nextInt(999);
    }
    
    public void immissione(){
        System.out.print("Indovina il numero fra 1 e 1000: ");
        numeroInput=input.nextInt();
    }
    
    public void verifica(){
        if(numeroInput<numeroCasuale){
            System.out.print("Troppo basso, prova ancora\n\n");
            fine=false;
            contatore++;
        }
        else if(numeroInput>numeroCasuale){
                 System.out.print("Troppo alto, prova ancora\n\n");
                 fine=false;
                 contatore++;
             }
        else{
            System.out.print("Congratulazioni, hai indovinato il numero!\n");
            fine=true;
            if(contatore<10)
                System.out.print("O conoscevi il segreto oppure sei fortunato!\n");
            else
                System.out.print("Puoi fare di meglio! Perche' non provi a metterci meno di 10 tentativi?\n");
            
            }
    
    
}
}
