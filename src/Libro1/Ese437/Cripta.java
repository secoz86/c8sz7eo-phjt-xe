package Libro1.Ese437;

import java.util.Scanner;

public class Cripta {
    private int numero, cif1, cif2, cif3, cif4, cifCrip;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Inserisci il numero da criptare (4 cifre): ");
        numero=input.nextInt();
    }
    
    public void cripta(){
        cif1=(numero/1000+7)%10;
        cif2=(numero%1000/100+7)%10;
        cif3=(numero%100/10+7)%10;
        cif4=(numero%10+7)%10;
        
        cifCrip=cif1*10+cif2+cif3*1000+cif4*100;;   
    }
    
    public void stampa(){
        System.out.printf("Numero Criptato: %d\n",cifCrip);
    }
            
}
