package Libro1.Ese717;

import java.util.Random;

public class Dadi {
    private Random dado = new Random();
    private int dado1, dado2, totaleDadi;
    private int[] risultato = new int[11];
    
    public void setDado1(int faccia){
        dado1=faccia;
    }
    
    public int getDado1(){
        return dado1;
    }
    
    public void setDado2(int faccia){
        dado2=faccia;
    }
    
    public int getDado2(){
        return dado2;
    }
    
    public void assegnaDado(){
        setDado1(1+dado.nextInt(6));
        setDado2(1+dado.nextInt(6));
    }
    
    public void calcolaSommaDadi(){
        totaleDadi=getDado1()+getDado2();
    }
    
    public void assegnaRisultato(){
        risultato[totaleDadi-2]++;
    }
    
    public void stampa(){
        System.out.printf("%5s%12s%12s\n", "Somma", "Frequenza", "Percentuale" );
        for(int i=0; i<risultato.length; i++){
            System.out.printf("%5d%12d%12d\n",(i+2), risultato[i], (risultato[i]/(36000/100)));
        }
    }
    
    public void inizio(){
        for(int i=0; i<36000; i++){
            assegnaDado();
            calcolaSommaDadi();
            assegnaRisultato();
        }
        stampa();
    }
}