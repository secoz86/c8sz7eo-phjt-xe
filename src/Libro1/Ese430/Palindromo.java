package Libro1.Ese430;

import java.util.Scanner;

public class Palindromo {
    private int num1,num2,num4,num5,numero;
    Scanner input = new Scanner(System.in);

    public void inserimentoNumero(){
        System.out.print("Inserisci numero da verificare: ");
        numero = input.nextInt();
        
        while(numero>=100000 || numero<=9999){
            System.out.print("Numero inserito non corretto. Inserire uno a 5 cifre!\n");
            System.out.print("Inserisci numero da verificare: ");
            numero = input.nextInt();
        }
    }
    
    public void verificaPalindromo(){
        num1=numero/10000;
        num2=numero%10000/1000;    
        num4=numero%10000%1000%100/10;    
        num5=numero%10000%1000%100%10; 
        
        if(num1==num5){
            if(num2==num4){
                System.out.print("Il numero e' palindromo!\n");
            }
            else{
                System.out.print("Il numero non e' palindromo!\n");
            }
        }
        else{
                System.out.print("Il numero non e' palindromo!\n");
            }
    }
}
