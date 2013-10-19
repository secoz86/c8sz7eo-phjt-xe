package Libro1.Ese714;

public class ProvaSomma {

    public static void main(String[] args) {
        Somma prova = new Somma();
        int n1=1, n2=2, n3=3, n4=4, n5=5;
        
        System.out.printf("%d\n", prova.numeri(n1,n2));
        System.out.printf("%d\n", prova.numeri(n1,n2,n3));
        System.out.printf("%d\n", prova.numeri(n1,n2,n3,n4,n5,n1));
                

    }
}
