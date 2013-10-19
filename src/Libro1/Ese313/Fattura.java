package Libro1.Ese313;

public class Fattura {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private int quantitaAcquistata;
    private double prezzoUnitario;
    
    //Costruttore
    public Fattura(String codArt, String desArt, int quaAcq, double preUni){
        if(quaAcq < 0)
            quantitaAcquistata=0;
        else
            quantitaAcquistata=quaAcq;
        
        if(preUni < 0.0)
            prezzoUnitario=0.0;
        else
            prezzoUnitario=preUni;
        
        codiceArticolo=codArt;
        descrizioneArticolo=desArt;
    }
    
    //Metodi get e set di codiceArticolo
    public String getCodiceArticolo(){
        return codiceArticolo;
    }
    
    public void setCodiceArticolo(String codArt){
        codiceArticolo=codArt;
    }
    
    //Metodi get e set di descrizioneArticolo
    public String getDescrizioneArticolo(){
        return descrizioneArticolo;
    }
    
    public void setDescrizioneArticolo(String desArt){
        descrizioneArticolo=desArt;
    }
    
    //Metodi get e set di quantitaAcquistata
    public int getQuantitaAcquistata(){
        return quantitaAcquistata;
    }
    
    public void setQuantitaAcquistata(int quaAcq){
        if(quaAcq < 0)
            quantitaAcquistata=0;
        else
            quantitaAcquistata=quaAcq;
    }
    
    //metodi get e set di prezzoUnitario
    public double getPrezzoUnitario(){
        return prezzoUnitario;
    }
    
    public void setPrezzoUnitario(double preUni){
        if(preUni < 0.0)
            prezzoUnitario=0.0;
        else
            prezzoUnitario=preUni;
    }
    
    //Metodo TotaleFattura
    public double TotaleFattura(){
        return getQuantitaAcquistata()*getPrezzoUnitario();
    }
}
