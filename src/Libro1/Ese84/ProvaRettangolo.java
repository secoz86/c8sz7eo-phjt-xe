package Libro1.Ese84;

import java.util.Scanner;

public class ProvaRettangolo {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int scelta;
        Rettangolo test = new Rettangolo();
        
        scelta=menu();
        
        while(scelta!=3){
            switch(scelta){
                case 1:
                    System.out.print("Inserisci Larghezza: ");
                    test.setLarghezza(input.nextDouble());
                    break;
                    
                case 2:
                    System.out.print("Inserisci Altezza: ");
                    test.setAltezza(input.nextDouble());
                    break;
            }
            System.out.print(test.ToString());
            scelta=menu();
        }       
    }
    
    public static int menu(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Inserisci Larghezza\n");
        System.out.print("2. Inserisci Altezza\n");
        System.out.print("3. Esci\n");
        System.out.print("Scelta: ");
        
        return input.nextInt();  
    }
}