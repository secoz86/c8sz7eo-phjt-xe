package Libro1.Ese518;

//Fig. 5.6: Interessi.java
//Calcolo di interessi compositi con il ciclo for

public class Interessi {
    public static void main(String[] args) {
       int interi,cent;
       int ammontare;         //deposito alla fine di ogni anno
       int capitale = 1000; //capitale iniziale
       double tasso=0.05;      //tasso di interesse

           //visualizza intestazioni
           System.out.printf("%s   %20s\n", "Anno", "Quantita' in deposito");
           
           //calcola la quantita' in deposito alla fine di ogni anno
           for(int anno=1;anno<=10;anno++){
               //calcola la nuova quantita' alla fine dell'anno
               ammontare=(int)(capitale*100*Math.pow(1.0+tasso, anno));
               interi=(int)ammontare/100;
               cent=(int)ammontare%100;
               //visualizza l'anno e la quantità
               System.out.printf("%4d\t\t    $%d.%d\n", anno,interi,cent);
       } //fine for
    } //fine main
} //fine classe Interessi
