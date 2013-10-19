package Libro1.Ese629;

import java.util.Random;
import java.util.Scanner;

public class Moneta {
    private Random moneta = new Random();
    private Scanner input = new Scanner(System.in);
    private int scelta, testa=0, croce=0;
    
    public int getScelta(){
        return scelta;
    }
    
    public void setScelta(int sce){
        scelta=sce;
    }
    
    public int getTesta(){
        return testa;
    }
    
    public int getCroce(){
        return croce;
    }
    
    public void conta(){
        if(lancio()==true)
            testa++;
        else
            croce++;
    }
    
    public void immissione(){
        System.out.print("Premi 0 per terminare, 1 per lanciare la moneta: ");
        scelta=input.nextInt();
    }
    
    public boolean lancio(){
        int faccia = moneta.nextInt(2);
        
        if(faccia==1)
            return true;
        else
            return false;
    }
    
    public void stampa(){
        System.out.printf("Testa: %d     Croce: %d\n", getTesta(), getCroce());
    }
}
