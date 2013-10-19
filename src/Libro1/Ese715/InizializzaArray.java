package Libro1.Ese715;
public class InizializzaArray {
    public static void main(String[] args){
       int dimensione;
       
       if(args.length==0){ 
           dimensione=10;
       }
       else{
           dimensione=Integer.parseInt(args[0]);
       }
        
       int array[];
       array= new int[dimensione];
       
       System.out.printf("%s%8s\n","Indice","Valore");
       
       for(int contatore=0; contatore<array.length; contatore++){
           System.out.printf("%5d%8d\n",contatore, array[contatore]);
       }
    }
}
