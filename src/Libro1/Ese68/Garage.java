package Libro1.Ese68;

import java.util.Scanner;

public class Garage {
    private double ore, totale=0.0, totalec=0.0;
    private Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Inserisci le ore, -1 per terminare: ");
        ore=input.nextDouble();
    }
    
    public void stampa(){
      totale=2.0;
      
     while(ore!=-1){
      if(ore>3.0)
          totale=2.0+0.5*Math.ceil(ore-3.0);
      
      if(totale>10)
          totale=10.0;
      
      totalec+=totale;
      
      System.out.printf("Ore: %.2f\t\tTotale Parziale: $%.2f\t\tTotale Complessivo: $%.2f\n",ore,totale,totalec);
      System.out.print("Inserisci le ore, -1 per terminare: ");
      ore=input.nextDouble();
      }
    }
}