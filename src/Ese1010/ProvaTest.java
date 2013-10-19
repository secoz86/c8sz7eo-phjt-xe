/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public class ProvaTest {

    public static void main(String[] args) {
       
       Forma oggettiForma[] = new Forma[4];
       
       oggettiForma[0] = new Cerchio(22, 88, 4);
       oggettiForma[1] = new Quadrato(71, 96, 10);
       oggettiForma[2] = new Sfera(8, 89, 2);
       oggettiForma[3] = new Cubo(79, 61, 8);
       
       for(Forma formaCorrente : oggettiForma){
           System.out.printf("%s: %s", formaCorrente.getNome(), formaCorrente);
           
           if(formaCorrente instanceof FormaBidimensionale){
               FormaBidimensionale formaBidimensionale = (FormaBidimensionale) formaCorrente;
               System.out.printf("L'area del %s e' %s\n\n", formaCorrente.getNome(), formaBidimensionale.getArea());
           }
           
           if(formaCorrente instanceof FormaTridimensionale){
               FormaTridimensionale formaTridimensionale = (FormaTridimensionale) formaCorrente;
               System.out.printf("L'area del %s e' %s\n", formaCorrente.getNome(), formaTridimensionale.getArea());
               System.out.printf("Il volume del %s e' %s\n\n", formaCorrente.getNome(), formaTridimensionale.getVolume());
           }
       }
    }
}