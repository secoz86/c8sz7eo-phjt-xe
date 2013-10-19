package Libro1.Ese417;

public class Calcoli {
    private int litri=0, chilometri=0, totlitri=0, totchilometri=0;
    private double kmlparz=0.0, kmltot=0.0;
    
    //costruttore
    public Calcoli(int lit, int chi, int totl, int totc, double klp, double klt){
        litri=lit;
        chilometri=chi;
        totlitri=totl;
        totchilometri=totc;
        kmlparz=klp; 
        kmltot=klt;
    }
    
    //set e get di litri
    public void setLitri(int lit){
        litri=lit;
    }
    
    public int getLitri(){
        return litri;
    }
    
    //set e get di chilometri
    public void setChilometri(int chi){
        chilometri=chi;
    }
    
    public int getChilometri(){
        return chilometri;
    }
    
    //set e get di chilometri parziali
    public void setKmlparz(double klp){
        kmlparz=klp;
    }
    
    public double getKmlparz(){
        return kmlparz;
    }
    
    //set e get di totlitri
    public void setTotLitri(int totl){
        totlitri=totl;
    }
    
    public int getTotLitri(){
        return totlitri;
    }
    
    //set e get di totchilometri
    public void setTotChilometri(int totc){
        totchilometri=totc;
    }
    
    public int getTotChilometri(){
        return totchilometri;
    }
    
    //set e get di chilometri parziali
    public void setKmltot(double klt){
        kmltot=klt;
    }
    
    public double getKmltot(){
        return kmltot;
    }
}