package Libro1.Ese312;

public class ContoCorrente {
    private double saldo;
    
    //Costruttore
    public ContoCorrente(double saldoIniziale){
        if(saldoIniziale > 0.0)
            saldo=saldoIniziale;
    }
    
    public void accredita(double cifra){
        saldo = saldo + cifra;
    }
    
    public void addebita(double cifra){
        if(cifra>saldo){
            System.out.printf("La quantita' da addebitare supera il saldo. Operazione Impossibile.\n");
        }            
        else{
            saldo = saldo - cifra;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
        

    
}
