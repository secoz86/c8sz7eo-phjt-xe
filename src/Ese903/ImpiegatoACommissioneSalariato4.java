package Ese903;

public class ImpiegatoACommissioneSalariato4{
    
    private double stipendioBase; //stipendio base settimanale
    private ImpiegatoACommissione3 impiegato;
    
    //costruttore con sei argomenti
    public ImpiegatoACommissioneSalariato4(String _nome, String _cognome, String cf, double vendite, double commissione, double stipendio){
            impiegato = new ImpiegatoACommissione3(_nome,_cognome,cf,vendite,commissione);
            setStipendioBase(stipendio); //valida e salva lo stipendio
    }
    
     //imposta il nome
    public void setNome(String _nome){
       impiegato.setNome(_nome);
    }
    
    //restituisce il nome
    public String getNome(){
        return impiegato.getNome();
    }
    
    //imposta il cognome
    public void setCognome(String _cognome){
        impiegato.setCognome(_cognome);
    }
    
    //restituisce il cognome
    public String getCognome(){
        return impiegato.getCognome();
    }
    
    //imposta il codice fiscale
    public void setCodiceFiscale(String _cf){
        impiegato.setCodiceFiscale(_cf);
    }
    
    //restituisce il codice fiscale
    public String getCodiceFiscale(){
        return impiegato.getCodiceFiscale();
    }

    //imposta le vendite lorde
    public void setVenditeLorde(double vendite){
        impiegato.setVenditeLorde(vendite);
    }
    
    //restituisce le vendite lorde
    public double getVenditeLorde(){
        return impiegato.getVenditeLorde();
    }
    
    //imposta la percentuale di commissione
    public void setPercentualeCommissione(double commiss){
        impiegato.setPercentualeCommissione(commiss);
    }
    
    //restituisce la percentuale di commissione
    public double getPercentualeCommissione(){
        return impiegato.getPercentualeCommissione();
    }
        
    //imposta lo stipendio base
    public void setStipendioBase(double stipendio){
        stipendioBase = (stipendio<0.0) ? 0.0 : stipendio;
    }
    
    //restituisce lo stipendio base
    public double getStipendioBase(){
        return stipendioBase;
    }
    
    //calcola il guadagno
    public double guadagno(){
        return getStipendioBase() + impiegato.guadagno();
    }
    
    //restituisce la rappresentazione in formato stringa
    public String toString(){
        return String.format( "%s %s\n%s: %.2f", "salariato", impiegato.toString(),
                "stipendio base", getStipendioBase());
    }
}
