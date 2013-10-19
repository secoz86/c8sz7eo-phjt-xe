package Libro1.Ese435;

import java.util.Scanner;

public class Triangolo {
    private int lato1, lato2, lato3;
    boolean triangolo=false;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Inserisci lato 1: ");
        lato1=input.nextInt();
        
        System.out.print("Inserisci lato 2: ");
        lato2=input.nextInt();
        
        System.out.print("Inserisci lato 3: ");
        lato3=input.nextInt();
    }
    
    public void verifica(){
        if((lato1+lato2)>lato3){
            if((lato1+lato3)>lato2){
                if((lato2+lato3)>lato1){
                    triangolo=true;
                }
            }
        }
    }
    
    public void stampa(){
        if(triangolo==true)
            System.out.print("E' un triangolo!\n");
        else
            System.out.print("Non e' un triangolo!\n");
    }
}
