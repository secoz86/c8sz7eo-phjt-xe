
package Libro1.Ese431;

import java.util.Scanner;

public class Conversione {
    private int binario, decimale, bit=1;
    Scanner input = new Scanner(System.in);
    
    public void immissioneBinario(){
        System.out.print("Inserisci numero binario: ");
        binario=input.nextInt();
    }
    
    public void conversione(){
        while(binario!=0){
            decimale+=binario%10*bit;
            binario/=10;
            bit*=2;
        }
    }
    
    public void stampa(){
        System.out.printf("Valore decimale: %d\n",decimale);
    }
}
