package Libro1.Ese520;

import java.util.Scanner;

public class PI {
    private int precisione, contatore;
    private double pi=0.0, denominatore=1.0;
    private Scanner input = new Scanner(System.in);
    
    public void calcolaEStampa(){
        System.out.print("Inserisci la precisione: ");
        precisione=input.nextInt();
        
        System.out.print("Precisione          PI\n");
        for(contatore=1;contatore<=precisione;contatore++){
            if(contatore%2!=0)
                pi+=4.0/denominatore;
            else
                pi-=4.0/denominatore;
            
            System.out.printf("%10d           %.20f\n",contatore,pi);
            denominatore+=2.0;
        }
            
            
            
           
           
         }
}

