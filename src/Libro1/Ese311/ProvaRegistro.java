package Libro1.Ese311;

public class ProvaRegistro {
    public static void main(String[] args) {
        Registro registro1 = new Registro("CS101 Introduzione Java","Mario Rossi");
        Registro registro2 = new Registro("CS102 Introduzione PHP", "Giuseppe Verdi");
        
        registro1.mostraMessaggio();
        System.out.println();
        registro2.mostraMessaggio();
    }
}
