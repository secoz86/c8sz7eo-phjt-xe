package Libro1.Ese422;

public class Tabella {
    private int contatore=1;
    
    public void stampaTabella(){
        System.out.print("N     10*N     100*N     1000*N\n\n");
        
        while(contatore<=5){
            System.out.printf("%d     %d       %d       %d\n",contatore,contatore*10,contatore*100,contatore*1000);
            contatore++;
        }
    }
}
