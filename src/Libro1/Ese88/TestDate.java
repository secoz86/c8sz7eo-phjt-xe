package Libro1.Ese88;

public class TestDate {
    public static void main(String[] args) {
       System.out.println("Checking increment");
        Date data = new Date(11,27,1988);
       
       for(int i=0; i<40; i++){
           data.nextDay();
           System.out.printf("Incremented Date: %s\n",data.toString());
          
       }
    }
}