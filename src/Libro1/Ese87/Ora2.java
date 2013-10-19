package Libro1.Ese87;

public class Ora2 {
    private int ora;
    private int minuto;
    private int secondo;
    
    public Ora2(){
        this(0,0,0);
    }
    
    public Ora2(int h){
        this(h,0,0);
    }
    
    public Ora2(int h, int m){
        this(h,m,0);
    }
    
    public Ora2(int h, int m, int s){
        setOrario(h,m,s);
    }
    
    public Ora2(Ora2 orario){
        this(orario.getOra(), orario.getMinuto(), orario.getSecondo());
    }
    
    public void setOrario(int h, int m, int s){
        setOra(h);
        setMinuto(m);
        setSecondo(s);
    }
    
    public void setOra(int h){
        ora=((h>=0 && h<24) ? h : 0);
    }
    
    public void setMinuto(int m){
        minuto=((m>=0 && m<60) ? m : 0);
    }
    
    public void setSecondo(int s){
        secondo=((s>=0 && s<60) ? s : 0);
    }
    
    public int getOra(){
        return ora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSecondo(){
        return secondo;
    }
    
    public String ToStringaUniversale(){
        return String.format("%02d:%02d:%02d", getOra(), getMinuto(), getSecondo());
    }
    
    public String ToString(){
        return String.format("%d:%02d:%02d %s", ((getOra()==0 || getOra()==12) ? 12 : getOra() % 12), getMinuto(), getSecondo(), (getOra() < 12 ? "AM" : "PM"));
    }
    
    public void tick(){
        setSecondo(secondo+1);
        
        if(getSecondo()==0)
            incrementaMinuto();
    }
    
    public void incrementaMinuto(){
        setMinuto(minuto+1);
        
        if(getMinuto()==0)
            incrementaOra();
    }
    
    public void incrementaOra(){
        setOra(ora+1);
    }
}