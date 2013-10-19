package Libro1.Ese417;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Calcoli calcoli = new Calcoli(0,0,0,0,0.0,0.0);
        
        System.out.print("Inserire i chilometri (-1 per terminare): ");
        calcoli.setChilometri(input.nextInt());
        
        
        
        while(calcoli.getChilometri()>0){
            System.out.print("Inserisci i litri: ");
            calcoli.setLitri(input.nextInt());
            calcoli.setKmlparz((double)calcoli.getChilometri()/(double)calcoli.getLitri());
            calcoli.setTotChilometri(calcoli.getTotChilometri()+calcoli.getChilometri());
            calcoli.setTotLitri(calcoli.getTotLitri()+calcoli.getLitri());
            calcoli.setKmltot((double)calcoli.getTotChilometri()/(double)calcoli.getTotLitri());

            System.out.printf("Km/l parziali: %.2f\n", calcoli.getKmlparz());
            System.out.printf("Km/l totali: %.2f\n\n", calcoli.getKmltot());
            
            System.out.print("Inserire i chilometri (-1 per terminare): ");
            calcoli.setChilometri(input.nextInt());
        }
        
        //PROGRAMMA SENZA CLASSE CALCOLI
         /* int litri=0, chilometri=0, totlitri=0, totchilometri=0;
          * double kmlparz=0.0, kmltot=0.0;
          * Scanner input = new Scanner(System.in);
          * 
          * System.out.print("Inserire i chilometri (-1 per terminare): ");
          * chilometri=input.nextInt();
          * 
          * while(calcolichilometri>0){
          *     System.out.print("Inserisci i litri: ");
          *     litri=input.nextInt();
          *     kmlparz=(double)chilometri/litri;
          *     totchilometri+=chilometri;
          *     totlitri+=litri;
          *     kmltot=(double)totchilometri/totlitri;
          *     System.out.printf("Km/l parziali: %.2f\n", kmlparz);
          *     System.out.printf("Km/l totali: %.2f\n\n", kmltot);
          * 
          *     System.out.print("Inserire i chilometri (-1 per terminare): ");
          *     chilometri=input.nextInt();
          * }
          */
     }
}
