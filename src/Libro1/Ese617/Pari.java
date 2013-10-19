package Libro1.Ese617;

public class Pari {
    private int numero;
    
    public void setNumero(int num){
        numero=num;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public boolean verificaPari(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
}
