package Libro1.Ese420;

import java.util.Scanner;

public class Reddito {
    int oreLavorate, cifraOraria;
    double stipendio;
    
    public void calcola(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci ore settimanali: ");
        oreLavorate=input.nextInt();
        
        System.out.print("Inserisci stipendio/ora: ");
        cifraOraria = input.nextInt();
        
        if(oreLavorate<=40){
            stipendio=oreLavorate*cifraOraria;
        }
        else{
            oreLavorate-=40;
            stipendio=((cifraOraria*1.5)*oreLavorate)+(cifraOraria*40);
        }
        
        System.out.printf("Stipendio: %.2f\n",stipendio);
    }
}
