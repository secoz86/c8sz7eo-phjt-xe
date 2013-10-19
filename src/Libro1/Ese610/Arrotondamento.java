package Libro1.Ese610;

public class Arrotondamento {
    private double numero;
    
    public void setNumero(double num){
        numero=num;
    }
    
    public double getNumero(){
        return numero;
    }
    
    public int arrotondaAllIntero(double num){
        double arrotondato = Math.floor(num+0.5);    
        return (int)arrotondato;
    }
    
    public double arrotondaAiDecimi(double num){
        double arrotondato = Math.floor(num*10+0.5)/10;    
        return arrotondato;
    }
    
    public double arrotondaAiCentesimi(double num){
        double arrotondato = Math.floor(num*100+0.5)/100;    
        return arrotondato;
    }
    
    public double arrotondaAiMillesimi(double num){
        double arrotondato = Math.floor(num*1000+0.5)/1000;    
        return arrotondato;
    }
}
