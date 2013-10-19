package Libro1.Ese515;

public class PuntoB {
    private int riga, colonna;
    
    public void stampa(){
        for(riga=10;riga>0;--riga){
            for(colonna=0;colonna<10;colonna++){
                if(riga>colonna)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
