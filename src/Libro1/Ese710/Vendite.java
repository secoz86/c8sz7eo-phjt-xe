package Libro1.Ese710;

import java.util.Scanner;

public class Vendite {
    private Scanner input = new Scanner(System.in);
    private int commissioni[] = new int[10];
    private int contatore[] = new int[9];
    private int commissione;
    
    public void immissione(){
        //Immette 10 vendite e calcola la commissione per ogni venditore
        for(int conta=0;conta<commissioni.length;conta++){
            System.out.printf("Immetti Vendite di Venditore %d: ",(conta+1));
            commissioni[conta]=(((input.nextInt()*9)/100)+200);
        }
    }
    
    public void calcolaNumeri(){
        for(int conta=0; conta<commissioni.length; conta++){
            commissione=commissioni[conta];
            
            if(commissione>=200 && commissione<=299)
                ++contatore[0];
            
            if(commissione>=300 && commissione<=399)
                ++contatore[1];
             
            if(commissione>=400 && commissione<=499)
                ++contatore[2];
              
            if(commissione>=500 && commissione<=599)
                ++contatore[3];
               
            if(commissione>=600 && commissione<=699)
                ++contatore[4];
                
            if(commissione>=700 && commissione<=799)
                ++contatore[5];
                 
            if(commissione>=800 && commissione<=899)
                ++contatore[6];
                  
            if(commissione>=900 && commissione<=999)
                ++contatore[7];
            
            if(commissione>=1000)
                ++contatore[8];
        }
    }
        
        public void stampaRisultati(){
          System.out.println();
          for(int conta=0; conta<contatore.length;conta++){
              switch(conta){
                  case 0:
                      System.out.printf("200$-299$: %d\n", contatore[0]);
                      break;
                      
                  case 1:
                      System.out.printf("300$-399$: %d\n", contatore[1]);
                      break;
                      
                  case 2:
                      System.out.printf("400$-499$: %d\n", contatore[2]);
                      break;
                      
                  case 3:
                      System.out.printf("500$-599$: %d\n", contatore[3]);
                      break;
                      
                  case 4:
                      System.out.printf("600$-699$: %d\n", contatore[4]);
                      break;
                      
                  case 5:
                      System.out.printf("700$-799$: %d\n", contatore[5]);
                      break;
                      
                  case 6:
                      System.out.printf("800$-899$: %d\n", contatore[6]);
                      break;
                  
                  case 7:
                      System.out.printf("900$-999$: %d\n", contatore[7]);
                      break;
                      
                  case 8:
                      System.out.printf("oltre i 1000$: %d\n", contatore[8]);
                      break;
              }
        }
            
    }
}