/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese908;

public class Parallelogramma extends Trapezio {
    
    //costruttore
    public Parallelogramma( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ){
        super( x1, y1, x2, y2, x3, y3, x4, y4 );
    }

 
    public double getLarghezza(){
        if ( getPunto1().getPuntoY() == getPunto2().getPuntoY() )
            return Math.abs( getPunto1().getPuntoX() - getPunto2().getPuntoX() );
        else
            return Math.abs( getPunto2().getPuntoX() - getPunto3().getPuntoX() );
    }
    
    public String toString(){
        return "\nLe coordinate del parallelogramma sono: \n" + stampaCoordinate() + "\nLarghezza e': " + getLarghezza() + "\nAltezza e': " + getAltezza() + "\nArea e': " + getArea();
    }
}
