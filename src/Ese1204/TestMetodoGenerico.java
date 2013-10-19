// Fig 12.3: TestMetodoGenerico.java
// Usare i metodi generici per stampare array di tipi differenti.


package Ese1204;
import java.util.Scanner;
public class TestMetodoGenerico {
    
    
    
    // metodo generico printArray
    public static <E> void printArray (E[] inputArray){
        
        //stampa gli elementi dell'array
        for(E element : inputArray)
            System.out.printf("%s ", element);
        
        System.out.println();
    }// fine metodo printArray
    
    
    
    
    //metodo generico printArray con indiceInf e indiceSup
    public static <E> void printArray (E[] inputArray, int _indiceInf, int _indiceSup){
        
        if((_indiceInf < 0) || (_indiceSup > inputArray.length))
            System.out.println("Indici non validi.");
        else{
            while(_indiceInf <= _indiceSup){
                System.out.printf("%s ", inputArray[_indiceInf]);
                _indiceInf++;
            }
        }
        
                
    }// fine metodo printArray

    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int indiceInf, indiceSup;
        
        // crea gli array di Integer, Double e Character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
        Character[] charArray = {'H','E','L','L','O'};
        
        System.out.println("L'array integerArray contiene:");
        printArray(intArray); // array di Integer
        System.out.println("L'array doubleArray contiene:");
        printArray(doubleArray); // array di Double
        System.out.println("L'array charArray contiene:");
        printArray(charArray); // array di Character  
        
        
        //Seconda versione del metodo printArray
        System.out.print("Inserisci indice inferiore: ");
        indiceInf=input.nextInt();
        
        System.out.print("Inserisci indice superiore: ");
        indiceSup=input.nextInt();
        
        System.out.println("L'array integerArray contiene:");
        printArray(intArray, indiceInf, indiceSup); // array di Integer
        System.out.println("L'array doubleArray contiene:");
        printArray(doubleArray, indiceInf, indiceSup); // array di Double
        System.out.println("L'array charArray contiene:");
        printArray(charArray, indiceInf, indiceSup); // array di Character
        
        
    } // fine del main
} // fine della classe TestMetodoGenerico
