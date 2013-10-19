package Libro1.Ese517;
import java.util.Scanner;

public class Vendite {
    private int prodotto, quantita;
    private double pro1=0.0,pro2=0.0,pro3=0.0,pro4=0.0,pro5=0.0;
    private Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Inserisci il numero del prodotto (1-5), 0 per terminare: ");
        prodotto=input.nextInt();
        
        while(prodotto!=0){
            if(prodotto>=1 && prodotto<=5){
                System.out.print("Inserisci la quantita': ");
                quantita=input.nextInt();
                                
                switch(prodotto){
                    case 1:
                        pro1+=(quantita*2.98);
                        break;
                        
                    case 2:
                        pro2+=(quantita*4.50);
                        break;
                        
                    case 3:
                        pro3+=(quantita*9.98);
                        break;
                        
                    case 4:
                        pro4+=(quantita*4.49);
                        break;
                        
                    case 5:
                        pro5+=(quantita*6.87);
                        break;      
                }
            }
            else{
                System.out.print("Numero del prodotto immesso errato!\n");
            }
            
            System.out.print("Inserisci il numero del prodotto (1-5), 0 per terminare: ");
            prodotto=input.nextInt();    
        }
    }
    
    public void stampa(){
        System.out.printf("Prodotto 1: $%.2f\nProdotto 2: $%.2f\nProdotto 3: $%.2f\nProdotto 4: $%.2f\nProdotto 5: $%.2f\n", pro1,pro2,pro3,pro4,pro5);
    }
}
