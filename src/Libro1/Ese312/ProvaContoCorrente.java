package Libro1.Ese312;

import java.util.Scanner;

public class ProvaContoCorrente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContoCorrente conto = new ContoCorrente(10.00);
        
        System.out.printf("Saldo del conto: %.2f\n", conto.getSaldo());
        
        System.out.print("Inserire deposito al conto: ");
        conto.accredita(input.nextDouble());
        
        System.out.printf("Saldo del conto: %.2f\n", conto.getSaldo());
        
        
        System.out.print("Addebito deposito al conto: ");
        conto.addebita(input.nextDouble());
        
        System.out.printf("Saldo del conto: %.2f\n", conto.getSaldo());
    }
}
