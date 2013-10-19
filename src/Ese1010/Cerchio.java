/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public class Cerchio extends FormaBidimensionale {
    
    //costruttore
    public Cerchio(int x, int y, int raggio){
        super(x,y,raggio,raggio);
        
    }
    
    public String getNome(){
        return "Cerchio";
    }
    
    public int getArea(){
        return (int)(Math.PI * getRaggio() * getRaggio());
    }
    
    //metodo set e get di raggio
    public void setRaggio(int raggio){
        setDimensione1(raggio);
        setDimensione2(raggio);
        
    }
    
    public int getRaggio(){
        return getDimensione1();
    }
    
    public String toString(){
        return String.format("%s %s: %d\n", super.toString(), "raggio", getRaggio());
    }
    
}
