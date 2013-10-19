/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese908;

/**
 *
 * @author Daniele
 */
public class Punto {
    private double x, y;
    
    public Punto(double _x, double _y){
        x=_x;
        y=_y;
    }
 
    //metodo get di x
    public double getPuntoX(){
        return x;
    }
    
    //metodo get di y
    public double getPuntoY(){
        return y;
    }
    
    public String toString(){
        return "( " + getPuntoX() + ", " + getPuntoY() + " )";
    }
}
