package Libro1.Ese437;

import java.util.Scanner;

public class Decripta {
    private int numero, cif1, cif2, cif3, cif4, cifDecrip;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Inserisci il numero da decriptare (4 cifre): ");
        numero=input.nextInt();
    }
    
    public void decripta(){
        cif1=(numero/1000+3)%10;
        cif2=(numero%1000/100+3)%10;
        cif3=(numero%100/10+3)%10;
        cif4=(numero%10+3)%10;
        
        cifDecrip=cif1*10+cif2+cif3*1000+cif4*100;;   
    }
    
    public void stampa(){
        System.out.printf("Numero Decriptato: %d\n",cifDecrip);
    }
}
