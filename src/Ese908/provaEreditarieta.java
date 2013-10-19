
package Ese908;

public class provaEreditarieta {

    public static void main(String[] args) {
        
        Quadrilatero quadrilatero = new Quadrilatero(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
        Trapezio trapezio = new Trapezio(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
        Parallelogramma parallelogramma = new Parallelogramma(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
        Rettangolo rettangolo = new Rettangolo( 17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);
        Quadrato quadrato = new Quadrato(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0 );
        
        String result = quadrilatero.toString() + "\n" + trapezio.toString() + "\n" + parallelogramma.toString() + "\n" + rettangolo.toString() + "\n" + quadrato.toString();
        
        System.out.printf("%s\n", result);
    }
}
