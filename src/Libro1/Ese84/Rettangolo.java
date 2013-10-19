package Libro1.Ese84;

public class Rettangolo {
    private double altezza;
    private double larghezza;
    
    //COSTRUTTORE DI DEFAULT
    public Rettangolo(){
        this(1.0,1.0);
    }
    
    //COSTRUTTORE CON PARAMETRI
    public Rettangolo(double l, double a){
        setRettangolo(l,a);
    }
    
    //COSTRUTTORE RETTANGOLO
    public void setRettangolo(double l, double a){
        setLarghezza(l);
        setAltezza(a);
    }
    
    //METODI SET
    public void setAltezza(double a){
        if(a>0.0 && a<20.0)
            altezza=a;
        else
            altezza=1.0;
    }
    
    public void setLarghezza(double l){
        if(l>0.0 && l<20.0)
            larghezza=l;
        else
            larghezza=1.0;
    }
    
    //METODI GET
    public double getAltezza(){
        return altezza;
    }
    public double getLarghezza(){
        return larghezza;
    }
    
    //CALCOLO PERIMETRO
    public double perimetro(){
        return((getLarghezza()*2)+(getAltezza()*2));
    }
    
    //CALCOLO AREA
    public double area(){
        return(getLarghezza())*(getAltezza());
    }
    
    //METODO TOSTRING
    public String ToString(){
        return String.format("%s: %f\n%s: %f\n%s: %f\n%s: %f\n", "Larghezza", getLarghezza() , "Altezza", getAltezza(), "Perimetro" , perimetro(), "Area", area());
    }
}