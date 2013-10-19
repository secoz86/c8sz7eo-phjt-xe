package Libro1.Ese314;

public class Impiegato{
    private String nome;
    private String cognome;
    private double stipendioMensile;
    
    public Impiegato(String nom, String cog, double sti){
        nome=nom;
        cognome=cog;
        stipendioMensile=sti;
        
        if(stipendioMensile<0)
            stipendioMensile=0.0;
    }
    
    //SET E GET DI NOME
    public void setNome(String nom){
        nome=nom;
    }
    
    public String getNome(){
        return nome;
    }
    
    //SET E GET DI COGNOME
    public void setCognome(String cog){
        cognome=cog;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    //SET E GET DI STIPENDIO MENSILE
    public void setStipendioMensile(double sti){
        stipendioMensile=sti;
    }
    
    public double getStipendioMensile(){
        return stipendioMensile;
    }
}