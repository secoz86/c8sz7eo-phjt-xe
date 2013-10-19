package Libro1.Ese717;

import java.util.Random;

public class DadiAlternativa {
        
    private int dado1=0; //PRIMO DADO
    private int dado2=0; //SECONDO DADO
    int array[] = new int[13]; //ARRAY PER CONTARE LE OCCORRENZE DELLA SOMMA DEI DADI
    Random rnd = new Random();
    
    public void inizio(){
        
        //SIMULA IL LANCIO DI DUE DADI 36000 VOLTE
        for(int contatore = 0; contatore<36000; contatore++){
           dado1=1+rnd.nextInt(6); //1+ PERCHE' GENERA VALORI TRA 0 E 6 E IL DADO NON HA LA FACCIA 0
           dado2=1+rnd.nextInt(6);
           array[dado1+dado2]++;
        }
    
        //STAMPA LA TABELLA
        System.out.printf( "%5s%12s%12s\n", "Somma", "Frequenza", "Percentuale" );
         for(int contatore = 2; contatore<array.length; contatore++)
             System.out.printf("%5d%12d%12d\n", contatore, array[contatore],
                     (array[contatore]/(36000/100)));
    }
}
