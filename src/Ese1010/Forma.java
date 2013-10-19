/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public abstract class Forma {
    private int x,y;
    
    //costruttore di forma
    public Forma(int _x, int _y){
        this.x = _x;
        this.y = _y;
    }
    
    //metodi set e get di x
    public void setX(int _x){
        this.x = _x;
    }
    
    public int getX(){
        return x;
    }
    
    //metodi set e get di y
    public void setY(int _y){
        this.y = _y;
    }
    
    public int getY(){
        return y;
    }
    
    //metodo toString di forma
    public String toString(){
        return String.format("(%d,%d)", getX(), getY());
    }
    
    public abstract String getNome();
    
    
}
