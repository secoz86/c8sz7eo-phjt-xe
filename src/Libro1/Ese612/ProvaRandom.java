package Libro1.Ese612;
import java.util.Random;

public class ProvaRandom {
    public static void main(String[] args) {
       Random prova = new Random();
       
       System.out.println(1+prova.nextInt(2));
       System.out.println(1+prova.nextInt(100));
       System.out.println(prova.nextInt(10));
       System.out.println(1000+prova.nextInt(113));
       System.out.println(-1+prova.nextInt(3));
       System.out.println(-3+prova.nextInt(15));
       
    }
}
