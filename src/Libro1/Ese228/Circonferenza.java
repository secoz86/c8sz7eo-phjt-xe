package Libro1.Ese228;

import java.util.Scanner;

public class Circonferenza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raggio;
        
        System.out.print("Inserisci il raggio: ");
        raggio=input.nextInt();
        
        System.out.printf("\nDiametro: %d\nCirconferenza: %f\nArea: %f\n", (2*raggio),(2*Math.PI*raggio),(Math.PI*(raggio*raggio)));
    }
}
