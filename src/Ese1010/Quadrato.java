/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public class Quadrato extends FormaBidimensionale {
    
    //costruttore
    public Quadrato(int x, int y, int lato){
        super(x,y,lato,lato);
    }
    
    public String getNome(){
        return "Quadrato";
    }
    
    public int getArea(){
        return getLato() * getLato();
    }
    
    //metodo set e get di raggio
    public void setLato(int lato){
        setDimensione1(lato);
        setDimensione2(lato);
        
    }
    
    public int getLato(){
        return getDimensione1();
    }
    
    public String toString(){
        return String.format("%s %s: %d\n", super.toString(), "lato", getLato());
    }
    
}
