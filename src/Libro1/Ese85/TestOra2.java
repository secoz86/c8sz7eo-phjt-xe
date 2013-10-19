package Libro1.Ese85;
//NON PROPRIO CORRETTO!
public class TestOra2 {

    public static void main(String[] args) {
        Ora2 t1 = new Ora2();
        Ora2 t2 = new Ora2(2);
        Ora2 t3 = new Ora2(21,34);
        Ora2 t4 = new Ora2(12,25,42);
        Ora2 t5 = new Ora2(27,74,99);
        
        System.out.println("Costruito con:");
        System.out.println("t1: tutti gli argomenti per default");
        System.out.printf("   %s\n", t1.toStringUniversale());
        System.out.printf("   %s\n", t1.toString());
        
        System.out.println("t2: ore specificate, minuti e secondi per default");
        System.out.printf("   %s\n", t2.toStringUniversale());
        System.out.printf("   %s\n", t2.toString());
        
        System.out.println("t3: ore e minuti specificati, secondi per default");
        System.out.printf("   %s\n", t3.toStringUniversale());
        System.out.printf("   %s\n", t3.toString());
        
        System.out.println("t4: ore, minuti e secondi specificati");
        System.out.printf("   %s\n", t4.toStringUniversale());
        System.out.printf("   %s\n", t4.toString());
        
        System.out.println("t5: specificati tutti valori non validi");
        System.out.printf("   %s\n", t5.toStringUniversale());
        System.out.printf("   %s\n", t5.toString());
                
    }
}
