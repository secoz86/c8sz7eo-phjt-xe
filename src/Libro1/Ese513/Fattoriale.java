package Libro1.Ese513;

public class Fattoriale{
    private int fattoriale=1, contatore;
    
    public void calcolaEStampa(){
        System.out.print("n\tn!\n");
        
        for(contatore=1;contatore<=5;contatore++){
            fattoriale*=contatore;
            System.out.printf("%d\t%d\n",contatore,fattoriale);
        }
    }
}