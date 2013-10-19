package Libro1.Ese232;

import java.util.Scanner;

public class PosNegZeri{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,n5,pos=0,neg=0,zeri=0;
        
        
        System.out.print("Inserisci il primo numero: ");
        n1=input.nextInt();
        
        if(n1==0)
            zeri=zeri+1;
        
        if(n1<0)
            neg=neg+1;
        
        if(n1>0)
            pos=pos+1;
            
                
        System.out.print("Inserisci il secondo numero: ");
        n2=input.nextInt();
        
        if(n2==0)
            zeri=zeri+1;
        
        if(n2<0)
            neg=neg+1;
        
        if(n2>0)
            pos=pos+1;
        
        
        System.out.print("Inserisci il terzo numero: ");
        n3=input.nextInt();
        
        if(n3==0)
            zeri=zeri+1;
        
        if(n3<0)
            neg=neg+1;
        
        if(n3>0)
            pos=pos+1;
        
       
        System.out.print("Inserisci il quarto numero: ");
        n4=input.nextInt();
        
        if(n4==0)
            zeri=zeri+1;
        
        if(n4<0)
            neg=neg+1;
        
        if(n4>0)
            pos=pos+1;
        
        
        System.out.print("Inserisci il quinto numero: ");
        n5=input.nextInt();
        
        if(n5==0)
            zeri=zeri+1;
        
        if(n5<0)
            neg=neg+1;
        
        if(n5>0)
            pos=pos+1;
        
        
        System.out.printf("Negativi: %d\nZeri: %d\nPositivi: %d\n",neg,zeri,pos);
    }
}