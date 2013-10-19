/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese811;

/**
 *
 * @author Daniele
 */
public enum Semaforo {
    
    //COSTANTI
    ROSSO( 50 ),
    GIALLO( 5 ),
    VERDE( 40 );
    
    private final int durata;
    
    //COSTRUTORE
    Semaforo(int secondi){
        durata=secondi;
    }
    
    //METODO GET DI DURATA
    public int getDurata(){
        return durata;
    }
}
