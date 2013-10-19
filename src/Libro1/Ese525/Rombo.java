package Libro1.Ese525;
import java.util.Scanner;

public class Rombo {
    public static void main(String[] args) {
        int righe, conta, spazi1, spazi2, asterischi, dimensione;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci un numero dispari di righe (da 1 a 19): ");
        dimensione=input.nextInt();
        
        while((dimensione>19)||(dimensione<0)||(dimensione%2==0)){
            System.out.print("Numero immesso errato!\n");
            System.out.print("Inserisci un numero dispari di righe (da 1 a 19): ");
            dimensione=input.nextInt();
        }
        
        //parte superiore
        for(righe=1;righe<=(dimensione/2);righe++){
                spazi1=spazi2=dimensione/(righe+1);
                asterischi=dimensione-(spazi1+spazi2);
                
                //stampa i primi spazi
                while(spazi1!=0){
                    System.out.print(' ');
                    spazi1--;
                }
                
                //stampa gli asterischi
                while(asterischi!=0){
                    System.out.print('*');
                    asterischi--;
                }
                
                // stampa i secondi spazi
                while(spazi2!=0){
                    System.out.print(' ');
                    spazi2--;
                }
                System.out.print('\n');
            }
        
        //parte centrale
        conta=dimensione;
        while(conta>0){
            System.out.print("*");
            conta--;
        }
        System.out.print('\n');
        
        //parte inferiore
        righe--;
        while(righe>0){
            spazi1=spazi2=dimensione/(righe+1);
                asterischi=dimensione-(spazi1+spazi2);
                
                while(spazi1!=0){
                    System.out.print(' ');
                    spazi1--;
                }
                
                while(asterischi!=0){
                    System.out.print('*');
                    asterischi--;
                }
                
                while(spazi2!=0){
                    System.out.print(' ');
                    spazi2--;
                }
                System.out.print('\n');
                --righe;     
        } 
    }
}