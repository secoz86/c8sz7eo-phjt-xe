package Libro1.Ese625;

public class PuntoC {
   
    //IL CALCOLO TROVA I NUMERI NON PRIMI. I RETURN ALLA FINE RITORNANO GLI OPPOSTI
    private boolean primo(int num){
        boolean primo=false;
        int max = (int) Math.sqrt(num);
        for(int contatore=2; contatore<=max; contatore++){
            if((num%contatore)==0){
                primo=true;
                break;
            }
        }
        if(primo==true)
                return false;
            else
                return true; 
    }
    
    public void verifica(){
        for(int i=2; i<10000; i++){            
            if(primo(i))
                System.out.printf("%d\n",i);   
        }
    }
}