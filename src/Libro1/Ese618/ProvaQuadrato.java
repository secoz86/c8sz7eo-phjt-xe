package Libro1.Ese618;

import java.util.Scanner;

public class ProvaQuadrato {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quadrato prova = new Quadrato();
        
        System.out.print("Inserisci lato: ");
        prova.setLato(input.nextInt());
        
        prova.stampaQuadrato(prova.getLato());
    }
}
