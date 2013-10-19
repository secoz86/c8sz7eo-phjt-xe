package Libro1.Ese712;

// CI SONO DEGLI ERRORI!!!!!!
import java.util.Scanner;

public class ProvaDuplicati {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int array[] = new int[5];
       int numero;
       
       for(int contatore=0; contatore<array.length; contatore++){
           System.out.printf("Inserisci numero %d: ",(contatore+1));
           numero=input.nextInt();
           
           for(int conta=0; conta<array.length ;conta++){
               if(numero==array[conta]){
                   break;
               }
                              
               array[contatore]=numero;
           }
           
           for(int conta2=0; conta2<array.length;conta2++){
               if(array[conta2]==0)
                   continue;
               else
                   System.out.printf("%d ", array[conta2]);
           }
           System.out.println();
           
       }
       
       
    }
}
