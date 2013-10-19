/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public class Sfera extends FormaTridimensionale {
    
    //costruttore
    public Sfera(int x, int y, int raggio){
        super(x,y,raggio,raggio,raggio);
        
    }
    
    public String getNome(){
        return "Sfera";
    }
    
    public int getArea(){
        return (int)(4 * Math.PI * getRaggio() * getRaggio());
    }
    
    public int getVolume(){
        return (int)(4.0 / 3.0 * Math.PI * getRaggio() * getRaggio() * getRaggio());
    }
    
    //metodo set e get di raggio
    public void setRaggio(int raggio){
        setDimensione1(raggio);
        setDimensione2(raggio);
        setDimensione3(raggio);
        
    }
    
    public int getRaggio(){
        return getDimensione1();
    }
    
    public String toString(){
        return String.format("%s %s: %d\n", super.toString(), "raggio", getRaggio());
    }
}
