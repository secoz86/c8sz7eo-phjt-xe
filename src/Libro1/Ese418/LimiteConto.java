package Libro1.Ese418;

public class LimiteConto {
    int numConto, saldoIniziale, artAcquistati, accreditiConto, limiteCredito;
    
    //costruttore
    public LimiteConto(int num, int saldoi, int arta, int accc, int limc){
        numConto=num;
        saldoIniziale=saldoi;
        artAcquistati=arta;
        accreditiConto=accc;
        limiteCredito=limc;        
    }
    
    public void calcoloSaldo(){
       int nuovoSaldo;
        nuovoSaldo=(saldoIniziale+artAcquistati)-accreditiConto;
        
        if(nuovoSaldo>limiteCredito)
            System.out.print("LIMITE DI CREDITO SUPERATO! \n\n");
        else
            System.out.printf("Nuovo Saldo: %d\n\n",nuovoSaldo);
    }
}
