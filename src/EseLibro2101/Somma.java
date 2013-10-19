/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EseLibro2101;
import javax.swing.JOptionPane;

public class Somma {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Inserisci primo numero");
        String num2 = JOptionPane.showInputDialog("Inserisci secondo numero");
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        
        int somma = n1 + n2;
        
        JOptionPane.showMessageDialog(null,"La somma e' " + somma, "Somma di due interi", JOptionPane.PLAIN_MESSAGE);
        
    }
}
