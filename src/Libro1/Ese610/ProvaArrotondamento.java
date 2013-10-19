package Libro1.Ese610;

import java.util.Scanner;

public class ProvaArrotondamento {
    public static void main(String[] args) {
        Arrotondamento prova = new Arrotondamento();
        Scanner input=new Scanner(System.in);
        
        System.out.print("Inserisci numero decimale: ");
        prova.setNumero(input.nextDouble());
        
        System.out.printf("Numero arrotondato all'intero: %d\n", prova.arrotondaAllIntero(prova.getNumero()));
        System.out.printf("Numero arrotondato ai decimi: %.1f\n", prova.arrotondaAiDecimi(prova.getNumero()));
        System.out.printf("Numero arrotondato ai centesimi: %.2f\n", prova.arrotondaAiCentesimi(prova.getNumero()));
        System.out.printf("Numero arrotondato ai millesimi: %.3f\n", prova.arrotondaAiMillesimi(prova.getNumero()));
    }
}
