package Libro1.Ese619;

import java.util.Scanner;

public class ProvaQuadrato {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quadrato prova = new Quadrato();
        
        System.out.print("Inserisci lato: ");
        prova.setLato(input.nextInt());
        
        System.out.print("Inserisci carattere: ");
        prova.setCarattere(input.next().charAt(0));
        
        prova.stampaQuadrato(prova.getLato(),prova.getCarattere());
    }
}
