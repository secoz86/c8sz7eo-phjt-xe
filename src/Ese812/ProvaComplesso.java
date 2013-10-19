/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese812;

/**
 *
 * @author Daniele
 */
public class ProvaComplesso {

    public static void main(String[] args) {
       Complesso a = new Complesso(9.5,7.7);
       Complesso b = new Complesso(1.2,3.1);
       
       System.out.printf("a: (%s)\n",a.toString());
       System.out.printf("b: (%s)\n",b.toString());
       System.out.printf("a+b: (%s)\n",a.addizione(b));
       System.out.printf("a-b: (%s)\n",a.sottrazione(b));
    }
}
