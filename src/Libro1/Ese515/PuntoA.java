package Libro1.Ese515;

public class PuntoA {
    private int riga, colonna;
    
    public void stampa(){
        for(riga=0;riga<10;riga++){
            for(colonna=0;colonna<10;colonna++){
                if(colonna<=riga)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
