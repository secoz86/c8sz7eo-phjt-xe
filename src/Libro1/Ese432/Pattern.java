package Libro1.Ese432;

public class Pattern {
    private int riga=0, colonna=0;
    
    public void stampa(){
        while(riga<8){
            while(colonna<16){
                if(riga%2!=0){
                    if(colonna%2!=0){
                        System.out.print("*");
                    }
                    if(colonna%2==0){
                        System.out.print(" ");
                    }
                }
                else{
                    if(colonna%2!=0){
                        System.out.print(" ");
                    }
                    if(colonna%2==0){
                        System.out.print("*");
                    }
                }
            colonna++;
            
            }
            colonna=0;
         System.out.println();
            riga++;   
        }
    }
}
