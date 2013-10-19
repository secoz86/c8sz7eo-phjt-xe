package Libro1.Ese86;

public class ProvaLibrettoDiRisparmio {

    public static void main(String[] args) {
        LibrettoDiRisparmio lib1 = new LibrettoDiRisparmio(2000.0);
        LibrettoDiRisparmio lib2 = new LibrettoDiRisparmio(3000.0);
        
        LibrettoDiRisparmio.setInteresseAnnuale(0.04);
        
        System.out.println("Saldo Mensile per un anno al 4%");
        System.out.println("Bilancio: ");
        System.out.printf("%20s%10s\n", "Saldo1", "Saldo2");
        
        for(int i=0; i<=12; i++){
            if(i==0){
                System.out.printf("%-10s%10s%10s\n", "Base",lib1.ToString(), lib2.ToString());
            }
            else{
                lib1.calcolaInteresseMensile();
                lib2.calcolaInteresseMensile();
                System.out.printf("%s %d:%13s%10s\n","Mese", i, lib1.ToString(), lib2.ToString());  
            }
        }
        
        LibrettoDiRisparmio.setInteresseAnnuale(0.05);
        lib1.calcolaInteresseMensile();
        lib2.calcolaInteresseMensile();
        
        System.out.println("\nSaldo Mensile per il 13° mese al 5%");
        System.out.println("Bilancio: ");
        System.out.printf(" %s  %s\n%s %s\n", "Saldo1", "Saldo2", lib1.ToString(), lib2.ToString());
    }
}