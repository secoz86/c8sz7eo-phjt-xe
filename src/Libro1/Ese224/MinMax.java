package Libro1.Ese224;

import java.util.Scanner;

public class MinMax{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,n5,min=0,max=0;
        
        System.out.print("Inserisci numero 1: ");
        n1=input.nextInt();
        
        System.out.print("Inserisci numero 2: ");
        n2=input.nextInt();
        
        System.out.print("Inserisci numero 3: ");
        n3=input.nextInt();
        
        System.out.print("Inserisci numero 4: ");
        n4=input.nextInt();
        
        System.out.print("Inserisci numero 5: ");
        n5=input.nextInt();
        
         //Trova il minimo
        if(n1<n2)
            min=n1;
        
        if(n1>n2)
            min=n2;
        
        if(min>n3)
            min=n3;
        
        if(min>n4)
            min=n4;
        
        if(min>n5)
            min=n5;
        
        //Trova il massimo
        if(n1<n2)
           max=n2;
        
        if(n1>n2)
            max=n1;
        
        if(max<n3)
            max=n3;
        
        if(max<n4)
            max=n4;
        
        if(max<n5)
            max=n5;
        
        System.out.printf("\nil numero piu' piccolo e' %d, il numero piu' grande e' %d\n", min,max);
    }
}