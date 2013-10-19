package Libro1.Ese421;
import java.util.Scanner;
public class ProvaMax {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Max massimo = new Max();
        int contatore=0, numero;
        
        while(contatore<10){
            System.out.print("Inserisci numero: "); 
            massimo.salvaMax(numero=input.nextInt());
            
            contatore++;
        }
        massimo.stampa();
    }
}
