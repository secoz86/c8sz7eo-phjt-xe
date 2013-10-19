package Libro1.Ese87;
//NON PROPRIO CORRETTO!
public class TestOra2 {

    public static void main(String[] args) {
       
        Ora2 t6 = new Ora2();
        Ora2 t7 = new Ora2(22,59,59);
        Ora2 t8 = new Ora2(23,59,59);
        
        
        System.out.println("Costruito con:");
        System.out.println("t6: tutti gli argomenti per default");
        System.out.printf("   %s\n", t6.ToStringaUniversale());
        System.out.printf("   %s\n", t6.ToString());
        System.out.println("\nAumento di un secondo");
        t6.tick();
        System.out.printf("   %s\n", t6.ToStringaUniversale());
        System.out.printf("   %s\n", t6.ToString());
        
        
        System.out.println("Costruito con:");
        System.out.println("t7: tutti gli argomenti definiti");
        System.out.printf("   %s\n", t7.ToStringaUniversale());
        System.out.printf("   %s\n", t7.ToString());
        System.out.println("\nAumento di un minuto");
        t7.tick();
        System.out.printf("   %s\n", t7.ToStringaUniversale());
        System.out.printf("   %s\n", t7.ToString());
        
        
        System.out.println("Costruito con:");
        System.out.println("t8: tutti gli argomenti definiti");
        System.out.printf("   %s\n", t8.ToStringaUniversale());
        System.out.printf("   %s\n", t8.ToString());
        System.out.println("\nAumento di un giorno");
        t8.tick();
        System.out.printf("   %s\n", t8.ToStringaUniversale());
        System.out.printf("   %s\n", t8.ToString());
    }
}