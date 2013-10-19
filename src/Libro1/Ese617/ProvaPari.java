package Libro1.Ese617;

import java.util.Scanner;

public class ProvaPari {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Pari prova = new Pari();
        
        System.out.print("Inserisci numero, -1 per terminare: ");
        prova.setNumero(input.nextInt());
        
        while(prova.getNumero()!=-1){
            if(prova.verificaPari(prova.getNumero()))
                System.out.print("Il numero e' pari\n\n");
            else
                System.out.print("Il numero non e' pari\n\n");
            
            System.out.print("Inserisci numero, -1 per terminare: ");
            prova.setNumero(input.nextInt());
        }    
    }
}
