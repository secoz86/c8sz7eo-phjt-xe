package Libro1.Ese515;

public class PuntoD {
    private int riga, colonna;
    
    public void stampa(){
        for(riga=10;riga>0;--riga){
            for(colonna=1;colonna<=10;colonna++){
                if(colonna>=riga)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
