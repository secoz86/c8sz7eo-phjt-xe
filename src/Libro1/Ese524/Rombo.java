package Libro1.Ese524;

public class Rombo {
    public static void main(String[] args) {
        int righe, conta, spazi1, spazi2, asterischi;
        
        //parte superiore
        for(righe=1;righe<=(9/2);righe++){
                spazi1=spazi2=9/(righe+1);
                asterischi=9-(spazi1+spazi2);
                
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
        conta=9;
        while(conta>0){
            System.out.print("*");
            conta--;
        }
        System.out.print('\n');
        
        //parte inferiore
        do{
            spazi1=spazi2=9/(righe+1);
                asterischi=9-(spazi1+spazi2);
                
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
                righe--;
            
        } while(righe>0);
    }
}