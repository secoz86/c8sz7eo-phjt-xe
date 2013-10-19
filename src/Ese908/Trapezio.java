
package Ese908;

public class Trapezio extends Quadrilatero{
    
    //costruttore
    public Trapezio(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    
    public double getAltezza(){
        if ((getPunto1().getPuntoY()) == getPunto2().getPuntoY())
            return Math.abs(getPunto2().getPuntoY() - getPunto3().getPuntoY());
        else
            return Math.abs(getPunto1().getPuntoY() - getPunto2().getPuntoY());
    }

 
    public double getArea(){
        return getSommaDueLati() * getAltezza() / 2.0;
    }

 

    public double getSommaDueLati(){
        if (getPunto1().getPuntoY() == getPunto2().getPuntoY())
            return Math.abs( getPunto1().getPuntoX() - getPunto2().getPuntoX() ) + Math.abs( getPunto3().getPuntoX() - getPunto4().getPuntoX());
        else
            return Math.abs( getPunto2().getPuntoX() - getPunto3().getPuntoX() ) + Math.abs( getPunto4().getPuntoX() - getPunto1().getPuntoX());
    }
    
    public String toString(){
        return "\nLe coordinate del trapezio sono: \n" + stampaCoordinate() + "\nAltezza e': " + getAltezza() + "\nArea e': " + getArea();
 }   
}

