package Libro1.Ese626;

import java.util.Scanner;

public class Inversione {
    private int numero;
    Scanner input = new Scanner(System.in);
    
    public void immissione(){
        System.out.print("Immetti numero: ");
        numero=input.nextInt();
    }
    
    public String converti(){
        int oldPlace, newPlace=1, temp, valore;
        String convertito = "";

        // create largest required devisor
        for(valore=1; valore<=numero; valore*=10);
            valore/=10;

        oldPlace=valore;

        for(int count=valore; count>0; count/=10){
            temp=numero/oldPlace;
            convertito=temp+convertito;
            numero%=oldPlace;
            oldPlace/=10;
            newPlace*=10;
        }
        return convertito;
    }
    
    public void stampa(){
        System.out.printf("Numero invertito: %s\n",converti());
}
    
    
}
