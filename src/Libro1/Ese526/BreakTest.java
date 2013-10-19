package Libro1.Ese526;

public class BreakTest {

    public static void main(String[] args) {
        int contatore;
        
        for(contatore=1;contatore<=10;contatore++){
            System.out.printf("%d ", contatore);
            if(contatore==4)
                contatore=10;
            
        }
        System.out.print("\nUscito con if al posto di break\n");
    }
}
