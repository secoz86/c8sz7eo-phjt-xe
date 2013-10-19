package Libro1.Ese69;

import java.util.Scanner;

public class ProvaArrotondamento {
    public static void main(String[] args) {
        double numero;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci un numero decimale, -1 ESCI: ");
        numero=input.nextDouble();
            
        while(numero!=-1){
            System.out.printf("Numero originale: %f    Numero arrotondato: %f\n",numero,Math.floor(numero+0.5));
            System.out.print("Inserisci un numero decimale, -1 ESCI: ");
            numero=input.nextDouble();
        }    
    }
}
