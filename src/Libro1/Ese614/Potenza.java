package Libro1.Ese614;

public class Potenza {
    private int base, esponente;
    
    public void setBase(int bas){
        base=bas;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setEsponente(int esp){
        esponente=esp;
    }
    
    public int getEsponente(){
        return esponente;
    }
    
    public int potenzaIntera(int bas, int esp){
        int tot=1;
        while(esp>=1){
            tot=tot*bas;
            esp--;
        }
        return tot;
    }
    
}
