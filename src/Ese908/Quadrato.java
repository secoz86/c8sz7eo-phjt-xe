package Ese908;

public class Quadrato extends Parallelogramma {

    //costruttore
    public Quadrato( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ){
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }
    
    public String toString(){
        return "\nLe coordinate del quadrato sono: \n" + stampaCoordinate() + "\nLato e': " + getLarghezza() + "\nArea e': " + getArea();
    }
}
