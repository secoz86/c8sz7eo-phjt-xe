/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese811;

import java.util.EnumSet;

public class provaSemaforo {

  
    public static void main(String[] args) {
       System.out.println("Luce:\tDurata:");
       
       for(Semaforo semaforo: Semaforo.values())
           System.out.printf("%-7s%3s\n",semaforo,semaforo.getDurata());
    }
}
