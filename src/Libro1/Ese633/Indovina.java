package Libro1.Ese633;

import java.util.Random;
import java.util.Scanner;

public class Indovina {
    private Scanner input = new Scanner(System.in);
    private Random numero = new Random();  
    private int numeroCasuale, numeroInput;
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
        }
        else if(numeroInput>numeroCasuale){
                 System.out.print("Troppo alto, prova ancora\n\n");
                 fine=false;
             }
        else{
            System.out.print("Congratulazioni, hai indovinato il numero!\n\n");
            fine=true;
            }
    
    
}
}
