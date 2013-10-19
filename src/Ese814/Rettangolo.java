/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese814;

/**
 *
 * @author Daniele
 */
public class Rettangolo {
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    private double x4, y4;
    
    //COSTRUTTORE SENZA ARGOMENTI
    public Rettangolo(){
        this(1,1,1,1,1,1,1,1);
    }
    
    //COSTRUTTORE CON ARGOMENTI
    public Rettangolo(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        setCoordinate(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    public void setCoordinate(double xx1, double yy1, double xx2, double yy2, double xx3, double yy3, double xx4, double yy4){
        x1=(xx1>=0.0 && xx1<=20.0 ? xx1 : 1);
        y1=(yy1>=0.0 && yy1<=20.0 ? yy1 : 1);
        x2=(xx2>=0.0 && xx2<=20.0 ? xx2 : 1);
        y2=(yy2>=0.0 && yy2<=20.0 ? yy2 : 1);
        x3=(xx3>=0.0 && xx3<=20.0 ? xx3 : 1);
        y3=(yy3>=0.0 && yy3<=20.0 ? yy3 : 1);
        x4=(xx4>=0.0 && xx4<=20.0 ? xx4 : 1);
        y4=(yy4>=0.0 && yy4<=20.0 ? yy4 : 1);
    }
    
    //METODO LUNGHEZZA DI UN LATO
    public double distanza(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    
    //VERIFICA DEL RETTANGOLO
    public void verificaRettangolo(){
        double lato1=distanza(x1,y1,x2,y2);
        double lato2=distanza(x2,y2,x3,y3);
        double lato3=distanza(x3,y3,x4,y4);
        
        if((Math.sqrt(Math.pow(lato1,2)+Math.pow(lato2, 2))) == (Math.sqrt(Math.pow(lato2,2)+Math.pow(lato3, 2))))
            System.out.println("E' Un Rettangolo!");
    }
    
    public double getLunghezza(){
        double lato1=distanza(x1,y1,x2,y2);
        double lato2=distanza(x2,y2,x3,y3);
        
        return (lato1 > lato2 ? lato1 : lato2);
    }
    
    public double getLarghezza(){
        double lato1=distanza(x1,y1,x2,y2);
        double lato2=distanza(x2,y2,x3,y3);
        
        return (lato1 < lato2 ? lato1 : lato2);
    }
    
    public double getPerimetro(){        
        return ((getLunghezza()*2)+(getLarghezza()*2));
    }
    
    public double getArea(){        
        return ((getLunghezza())*(getLarghezza()));
    }
    
    public String toString(){
        return String.format("Lunghezza: %f\n Altezza: %f\n Perimetro: %f\n Area: %f\n", getLunghezza(), getLarghezza(), getPerimetro(), getArea());
    }
     
    public void verificaQuadrato(){
        if((getLunghezza())==(getLarghezza()))
            System.out.println("E' Un quadrato!");             
    }
}
