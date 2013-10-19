/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public class Cubo extends FormaTridimensionale{
    
    //costruttore
    public Cubo(int x, int y, int lato){
        super(x,y,lato,lato,lato);
        
    }
    
    public String getNome(){
        return "Cubo";
    }
    
    public int getArea(){
        return (int)(6 * getLato() * getLato());
    }
    
    public int getVolume(){
        return (int)(getLato() * getLato() * getLato());
    }
    
    //metodo set e get di raggio
    public void setLato(int lato){
        setDimensione1(lato);
        setDimensione2(lato);
        setDimensione3(lato);
        
    }
    
    public int getLato(){
        return getDimensione1();
    }
    
    public String toString(){
        return String.format("%s %s: %d\n", super.toString(), "Lato", getLato());
    }
}
