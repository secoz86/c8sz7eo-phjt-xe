package Libro1.Ese522;

public class ProvaPattern{
    public static void main(String[] args){
       int riga, colonna, spazio;

       for (riga=1;riga<=10;riga++){
           //Primo Triangolo
           for(colonna=1;colonna<=riga;colonna++)
               System.out.print('*');

           for(spazio=1;spazio<=10-riga;spazio++)
               System.out.print(' ');

           System.out.print("\t");

           //Secondo Triangolo
           for(colonna=10;colonna>=riga;colonna--)
               System.out.print('*');

           for(spazio=1;spazio<riga;spazio++)
               System.out.print(' ');

           System.out.print("\t");

           //Terzo Triangolo
           for(spazio=1;spazio<riga;spazio++)
               System.out.print(' ');

           for(colonna=10;colonna>=riga;colonna--)
               System.out.print('*');

           System.out.print("\t");

           //Quarto Triangolo
          for(spazio=10;spazio>riga;spazio--)
              System.out.print(' ');

          for(colonna=1;colonna<=riga;colonna++)
              System.out.print('*');

          System.out.println();

       }
    }
}