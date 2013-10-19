package Libro1.Ese716;

public class ProvaSomma {

    public static void main(String[] args) {
        double somma=0.0,numero;
        double array[]=new double[args.length];
        
        for(int i=0; i<args.length; i++){
            numero=Double.parseDouble(args[i]);
            array[i]=numero;
        }

        for(double valore : array)
            somma+=valore;
        
        System.out.printf("%f\n",somma);
    }
}
