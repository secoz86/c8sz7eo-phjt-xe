package Libro1.Ese516;
import java.util.Scanner;

public class Istogrammi {
    private int num1, num2, num3, num4, num5, contatore, numero, asterischi;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        for(contatore=1;contatore<=5;contatore++){
            System.out.print("Inserisci numero intero: ");
            numero=input.nextInt();
            
            switch(contatore){
                case 1:
                    num1=numero;
                    break;
                
                case 2:
                    num2=numero;
                    break;
                
                case 3:
                    num3=numero;
                    break;
                
                case 4:
                    num4=numero;
                    break;
                
                case 5:
                    num5=numero;
                    break;    
            }
        }
    }
    
    public void stampa(){
        for(contatore=1;contatore<=5;contatore++){
            
            switch(contatore){
                case 1:
                    asterischi=num1;
                    break;
                
                case 2:
                    asterischi=num2;
                    break;
                
                case 3:
                    asterischi=num3;
                    break;
                
                case 4:
                    asterischi=num4;
                    break;
                
                case 5:
                    asterischi=num5;
                    break;    
            }
            
            while(asterischi>0){
                System.out.print("*");
                asterischi--;
            }
                   System.out.print("\n");
        }
    }
}
