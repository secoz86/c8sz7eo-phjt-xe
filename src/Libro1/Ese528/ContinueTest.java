package Libro1.Ese528;

public class ContinueTest {

   public static void main(String[] args) {
        int contatore;
        
        for(contatore=1;contatore<=10;contatore++){
            System.out.printf("%d ", contatore);
            if(contatore==4)
                contatore+=1;
            
        }
        System.out.print("\nBypassato 5 con if al posto di continue\n");
    }
}
