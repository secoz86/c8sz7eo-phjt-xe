
package Libro1.Ese429;

import java.util.Scanner;

public class StampaQuadrato {
   private int lato,riga=1,colonna=1;
   Scanner input = new Scanner(System.in);
   
   public void visualizza(){
       System.out.print("Inserisci lato quadrato: ");
       lato=input.nextInt();
       
       while(riga<=lato){
           while(colonna<=lato){
               if(riga==1)
                   System.out.print("*");
               else if (riga==lato)
                   System.out.print("*");
               else if (colonna==1)
                   System.out.print("*");
               else if (colonna==lato)
                   System.out.print("*");
               else System.out.print(" ");
           
               colonna++;
           }
           System.out.print("\n");
           colonna=1;
           riga++;
                   
      
           
       }
   }
}
