package Libro1.Ese419;

import java.util.Scanner;

public class Guadagno {
    int articolo=1, vendite=0;
    double tot=0.0;
    public void guadagno(){
        Scanner input = new Scanner(System.in);
        
        while(articolo<=4){
            System.out.printf("Inserisci le vendite di articolo %d: ",articolo);
            vendite=input.nextInt();
            switch(articolo){
                case 1:
                    tot+=vendite*239.99;
                    break;
                
                case 2:
                    tot+=vendite*129.75;
                    break;
                    
                case 3:
                    tot+=vendite*99.95;
                    break;
                
                case 4:
                    tot+=vendite*350.89;
                    break;         
            }
            articolo++;
        }
        
        System.out.printf("Guadagno Totale: %.2f", ((tot*9)/100)+200);
    }
}
