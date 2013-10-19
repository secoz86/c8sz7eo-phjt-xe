/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese903;

/**
 *
 * @author Daniele
 */
public class provaImpiegatoComposizione {

    public static void main(String[] args) {
       ImpiegatoACommissioneSalariato4 prova = new ImpiegatoACommissioneSalariato4("Roberto", "Bianchi", "RBT BNC 71 F15 B321 H", 5000.00, .04, 300.00);
       
       //visualizza i dati dell'impiegato
       System.out.printf("%s\n", prova.toString());
   
    }
}
