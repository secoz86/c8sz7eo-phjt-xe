/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1205;

/**
 *
 * @author Daniele
 */
public class TestMetodoGenerico {

    
    
    // metodo generico printArray
    public static <E> void printArray (E[] inputArray){
        
        //stampa gli elementi dell'array
        for(E element : inputArray)
            System.out.printf("%s ", element);
        
        System.out.println();
    }// fine metodo printArray
    
    
    
    // metodo generico printArray
    public static void printArray (String[] inputArray, int num){
        
        for(int i=0; i<8; i++){
            System.out.printf("%s ", inputArray[i]);
            if(i==num)
                System.out.println();
        }
     }
    
    public static void main(String[] args) {
        
        int numero = 3;
        String[] stringArray = {"uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto"};
        
        System.out.println("L'array stringArray contiene:");
        printArray(stringArray); // array di Integer
        
        System.out.println("L'array stringArray2 contiene:");
        printArray(stringArray, numero); // array di Integer
    }
}
