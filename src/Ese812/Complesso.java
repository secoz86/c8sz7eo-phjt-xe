/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese812;

/**
 *
 * @author Daniele
 */
public class Complesso {
    private double reale;
    private double immaginario;
    
    //COSTRUTTORE
    public Complesso(double rea, double imm){
        reale=rea;
        immaginario=imm;
    }
    
    //COSTRUTTORE DEFAULT
    public Complesso(){
        this(0.0, 0.0);
    }
    
    //METODO ADDIZIONE
    public Complesso addizione(Complesso due){
        return new Complesso(reale+due.reale,immaginario+due.immaginario);
    }
    
    //METODO SOTTRAZIONE
    public Complesso sottrazione(Complesso due){
        return new Complesso(reale-due.reale,immaginario-due.immaginario);
    }
    
    public String toString(){
        return String.format("%.2f, %.2f",reale,immaginario);
    }
}
