package Libro1.Ese315;

public class Appuntamento{
    private int giorno;
    private int mese;
    private int anno;
    
    public Appuntamento(int gio, int mes, int ann){
        giorno=gio;
        mese=mes;
        anno=ann;
    }
    
    //SET-GET DI GIORNO
    public void setGiorno(int gio){
        giorno=gio;
    }
    
    public int getGiorno(){
        return giorno;
    }
    
    //SET-GET DI MESE
    public void setMese(int mes){
        mese=mes;
    }
    
    public int getMese(){
        return mese;
    }
    
    //SET-GET DI ANNO
    public void setAnno(int ann){
        anno=ann;
    }
    
    public int getAnno(){
        return anno;
    }
    
    public void mostraAppuntamento(){
        System.out.printf("Data Appuntamento: %d/%d/%d\n",giorno,mese,anno);
    }
}