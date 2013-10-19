package Libro1.Ese86;

public class LibrettoDiRisparmio {
    private static double interesseAnnuale=0.0;
    private double saldoDeposito;
    
    public LibrettoDiRisparmio(double numero){
        saldoDeposito=numero;
    }
    
    public double getSaldoDeposito(){
        return saldoDeposito;
    }
    
    public static double getInteresseAnnuale(){
        return interesseAnnuale;
    }
    
    public void setSaldoDeposito(double num){
        saldoDeposito=num;
    }
    
    public static void setInteresseAnnuale(double inte){
        interesseAnnuale=inte;
    }
    
    public void calcolaInteresseMensile(){
        setSaldoDeposito(getSaldoDeposito() + ((getSaldoDeposito())*(getInteresseAnnuale()))/12);  
    }
    
    public String ToString(){
        return String.format("%.2f", getSaldoDeposito());
    }
}