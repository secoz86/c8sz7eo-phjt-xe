/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese908;

/**
 *
 * @author Daniele
 */
public class Quadrilatero {
    Punto punto1, punto2, punto3, punto4;
    
    //costruttore quadrilatero
    public Quadrilatero(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        punto1= new Punto(x1,y1);
        punto2= new Punto(x2,y2);
        punto3= new Punto(x3,y3);
        punto4= new Punto(x4,y4);
    }
    
    //metodo get punto1
    public Punto getPunto1(){
        return punto1;
    }
    
    //metodo get punto2
    public Punto getPunto2(){
        return punto2;
    }
    
    //metodo get punto3
    public Punto getPunto3(){
        return punto3;
    }
    
    //metodo get punto4
    public Punto getPunto4(){
        return punto4;
    }
    
    public String toString(){
        return "Le coordinate del quadrilatero sono: \n" + stampaCoordinate();
    }

    public String stampaCoordinate(){
        return punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString() + ", " + punto4.toString();
    } 
}
