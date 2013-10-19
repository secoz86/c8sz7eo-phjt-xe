
package Ese903;

public class ImpiegatoACommissione3 {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private double venditeLorde;  // vendite lorde settimanali
    private double percentualeCommissione;

    //costruttore con cinque argomenti
    public ImpiegatoACommissione3(String _nome, String _cognome, String cf, double vendite, double commissione){
        //invocazione implicita del costruttore di Object
        nome=_nome;
        cognome=_cognome;
        codiceFiscale=cf;
        setVenditeLorde(vendite); //valida e salva le vendite
        setPercentualeCommissione(commissione); //valida e salva
    } //fine del costruttore a cinque argomenti
    
    //imposta il nome
    public void setNome(String _nome){
        nome=_nome;
    }
    
    //restituisce il nome
    public String getNome(){
        return nome;
    }
    
    //imposta il cognome
    public void setCognome(String _cognome){
        cognome=_cognome;
    }
    
    //restituisce il cognome
    public String getCognome(){
        return cognome;
    }
    
    //imposta il codice fiscale
    public void setCodiceFiscale(String _cf){
        codiceFiscale=_cf;
    }
    
    //restituisce il codice fiscale
    public String getCodiceFiscale(){
        return codiceFiscale;
    }

    //imposta le vendite lorde
    public void setVenditeLorde(double vendite){
        venditeLorde= (vendite<0.0) ? 0.0 : vendite;
    }
    
    //restituisce le vendite lorde
    public double getVenditeLorde(){
        return venditeLorde;
    }
    
    //imposta la percentuale di commissione
    public void setPercentualeCommissione(double commiss){
        percentualeCommissione = (commiss>0.0 && commiss<1.0) ? commiss : 0.0;
    }
    
    //restituisce la percentuale di commissione
    public double getPercentualeCommissione(){
        return percentualeCommissione;
    }
    
    //calcola il guadagno
    public double guadagno(){
        return getPercentualeCommissione()*getVenditeLorde();
    }
    
    //restituisce la rappresentazione in formato stringa
    public String toString(){
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", "impiegato a commissione",
                getNome(),getCognome(),"codice fiscale", getCodiceFiscale(),"vendite lorde",
                getVenditeLorde(),"percentuale di commissione",getPercentualeCommissione());
    }
}
