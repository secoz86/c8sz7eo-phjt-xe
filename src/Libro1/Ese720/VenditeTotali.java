/*
 * TESTO ESERICIZIO:
 * USATE UNA MATRICE BIDIMENSIONALE PER RISOLVERE IL SEGUENTE PROBLEMA: UNA COMPAGNIA HA QUATTRO ADDETTI ALLE
 * VENDITE (DA 1 A 4) CHE VENDONO CINQUE DIVERSI PRODOTTI (DA 1 A 5). UNA VOLTA AL GIORNO OGNI VENDITORE
 * INSERISCE UNO SCONTRINO PER OGNI PRODOTTO VENDUTO. OGNI SCONTRINO CONTIENE:
 * A) IL CODICE DEL VENDITORE;
 * B) IL CODICE DEL PRODOTTO;
 * C) IL VALORE TOTALE IN DOLLARI DI VENDITE PER QUEL PRODOTTO.
 * OGNI VENDITORE INSERISCE QUINDI DA 0 A 5 SCONTRINI AL GIORNO. SUPPONETE CHE SIANO DISPONIBILI TUTTE LE 
 * INFORMAZIONI DEGLI SCONTRINI DELL'ULTIMO MESE. SCRIVETE UN'APPLICAZIONE CHE LEGGE TUTTE QUESTE INFORMAZIONI E 
 * RIASSUME LE VENDITE TOTALI PER VENDITORE E PER PRODOTTO. TUTTE LE SOMME DOVRANNO ESSERE CONSERVATE NELL'ARRAY 
 * BIDIMENSIONALE VENDITE. DOPO AVER ELABORATO LE INFORMAZIONI PER L'ULTIMO MESE MOSTRATE I RISULTATI IN FORMATO
 * TABELLARE IN MODO CHE OGNI COLONNA RAPPRESENTI UN PARTICOLARE VENDITORE E OGNI RIGA UN PARTICOLARE PRODOTTO.
 * SOMMATE IN ORIZZONTALE OGNI RIGA PER AVERE LE VENDITE TOTALI DI OGNI PRODOTTO PER IL MESE. SOMMATE IN 
 * VERTICALE LE COLONNE PER OTTENERE LE VENDITE TOTALI DI OGNI VENDITORE. LA TABELLA IN OUTPUT DOVRA' INCLUDERE 
 * LE SOMME ORIZZONTALI A DESTRA DELLA RIGA CORRISPONDENTE E LE SOMME VERTICALI IN FONDO ALLE COLONNE.
 */

package Libro1.Ese720;

import java.util.Scanner;

public class VenditeTotali {
    Scanner input = new Scanner(System.in);
    private int riga, colonna;
    private double valore, totaleProdotti, totaleVenditore;
    private double matrice[][] = new double[10][10];
    
    public void inizio(){
        System.out.print("Inserisci numero addetto (-1 per terminare): ");
        riga=input.nextInt();
        
        while(riga>=1){
            System.out.print("Inserisci numero prodotto: ");
            colonna=input.nextInt();
            
            System.out.print("Inserisci valore: ");
            valore=input.nextDouble();
            
            if(((riga>=1)&&(riga<=4))&&((colonna>=1)&&(colonna<=5))){
                matrice[riga][colonna]=valore + matrice[riga][colonna];
            }
            else{
                System.out.println("Immissione Errata.");
            }
            
            System.out.print("Inserisci numero addetto (-1 per terminare): ");
            riga=input.nextInt();
        
        }
        
        //CALCOLA TOTALE PER OGNI PRODOTTO
        for(int conta1=1;conta1< 6; conta1++){
            for(int conta2=1; conta2<5; conta2++){
            totaleProdotti+=matrice[conta2][conta1];    
            }
            matrice[5][conta1]=totaleProdotti;
            totaleProdotti=0;
        }
        
        //CALCOLA TOTALE PER OGNI VENDITORE
        for(int conta2=1;conta2< 6; conta2++){
            for(int conta1=1; conta1<5; conta1++){
            totaleVenditore+=matrice[conta2][conta1];    
            }
            matrice[conta2][6]=totaleVenditore;
            totaleVenditore=0;
        }
        
        //STAMPA INTESTAZIONI E PRODOTTI
        System.out.printf("%8s%14s%14s%14s%14s%14s\n","Prodotto","Venditore 1","Venditore 2","Venditore 3","Venditore 4","Totale");
        for(int conta1=1;conta1< 6; conta1++){
            System.out.printf("%8d",conta1);
            for(int conta2=1; conta2<6; conta2++){
                System.out.printf("%14.2f", matrice[conta2][conta1]);
            }
            System.out.println();
        }
        
        //STAMPA TOTALE PER VENDITORE
        System.out.printf("%8s","Totale");
        for(int conta1=1; conta1<5; conta1++){
            System.out.printf("%14.2f",matrice[conta1][6]);
        }
        System.out.println();
        }
    }