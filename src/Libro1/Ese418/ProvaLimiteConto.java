package Libro1.Ese418;

public class ProvaLimiteConto {
    public static void main(String[] args) {
        LimiteConto conto1 = new LimiteConto(101,500,250,20,1000);
        LimiteConto conto2 = new LimiteConto(101,500,250,20,500);
        
        conto1.calcoloSaldo();
        conto2.calcoloSaldo();
    }
}
