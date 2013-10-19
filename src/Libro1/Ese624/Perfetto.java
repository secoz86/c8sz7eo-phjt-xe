package Libro1.Ese624;

public class Perfetto {
    
    public boolean perfetto(int num){
        int totale=0;
        for(int i=1; i<num; i++){
            if(num%i==0)
                totale+=i;  
        }
        if(num==totale)
            return true;
        else
            return false;
    }
    
    public void stampa(){
        for(int contatore=1; contatore<=1000; contatore++){
            if(perfetto(contatore))
                System.out.printf("%d\n", contatore);
        }
    }
}
