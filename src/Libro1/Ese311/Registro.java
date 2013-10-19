package Libro1.Ese311;

public class Registro {
    
    private String nomeCorso;
    private String nomeDocente;
    
    //Costruttore
    public Registro(String corso, String docente){
        nomeCorso=corso;
        nomeDocente=docente;
    }
    
    public void setNomeCorso(String corso){
        nomeCorso=corso;
    }
    
    public String getNomeCorso(){
        return nomeCorso;
    }
    
    public void setNomeDocente(String docente){
        nomeDocente=docente;
    }
    
    public String getNomeDocente(){
        return nomeDocente;
    }
    
    public void mostraMessaggio(){
        System.out.printf("Benvenuto al registro di: %s!\n", getNomeCorso());
        System.out.printf("Questo corso e' tenuto da: %s!\n", getNomeDocente());
    }
    
}
