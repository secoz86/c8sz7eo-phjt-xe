package Libro1.Ese615;

public class ProvaTriangolo {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo();
        
        System.out.printf("Triangolo 1 - Ipotenusa: %f\n", triangolo.ipotenusa(3.0, 4.0));
        System.out.printf("Triangolo 2 - Ipotenusa: %f\n", triangolo.ipotenusa(5.0, 12.0));
        System.out.printf("Triangolo 3 - Ipotenusa: %f\n", triangolo.ipotenusa(8.0, 15.0));
    }
}
