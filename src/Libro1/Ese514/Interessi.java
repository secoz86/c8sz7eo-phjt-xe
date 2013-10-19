package Libro1.Ese514;

//Fig. 5.6: Interessi.java
//Calcolo di interessi compositi con il ciclo for

public class Interessi {
    public static void main(String[] args) {
       double ammontare;         //deposito alla fine di ogni anno
       double capitale = 1000.0; //capitale iniziale
       double tasso;      //tasso di interesse
       
       for(int contatore=5;contatore<=10;contatore++){
           //visualizza intestazioni
           System.out.printf("Tasso di interesse: %d%s\n",contatore,"%");
           System.out.printf("%s   %20s\n", "Anno", "Quantita' in deposito");
           
           tasso=(double)contatore/100;
           //calcola la quantita' in deposito alla fine di ogni anno
           for(int anno=1;anno<=10;anno++){
               //calcola la nuova quantita' alla fine dell'anno
               ammontare=capitale*Math.pow(1.0+tasso, anno);
           
               //visualizza l'anno e la quantità
               System.out.printf("%4d%,24.2f\n", anno, ammontare);
           } // fine for
           System.out.println();
       } //fine for
    } //fine main
} //fine classe Interessi
