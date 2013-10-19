package Libro1.Ese719;

import java.util.Scanner;

public class Prenotazione {
    
    Scanner input = new Scanner(System.in);
    private int scelta, subscelta;
    private int prima=1, economica=6;
    private boolean posto[] = new boolean[11];
    
    public  void inizio(){
        
        //INIZIALIZZAZIONE DELL'ARRAY A FALSE
        for(int contatore = 0; contatore < posto.length; contatore++)
            posto[contatore]=false;
        
        //STAMPA SCHERMATA
        System.out.println("Inserire 1 per la Prima Classe");
        System.out.println("Inserire 2 per la Classe Economica");
        System.out.println("Inserire -1 per terminare");
        System.out.print("Scelta: ");
        
        scelta=input.nextInt();
        
        //ITERA FINO A QUANDO NON SI INSERISCE UN VALORE NEGATIVO
         while(scelta>0){
            if(scelta==1){                                                      //SCELTA 1 CLASSE
                if(prima>=1 && prima<=5 ){                                      // SE C'E' QUALCHE POSTO ANCORA DISPONIBILE LO ASSEGNA
                    posto[prima]=true;
                    System.out.printf("Prima Classe. Posto #%d.\n\n",prima);
                    prima++;
                    
                }
                else{
                    System.out.println("\n\nLa Prima Classe e' piena. Classe Economica?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    System.out.print("Scelta: ");
                    
                    subscelta=input.nextInt();
                    
                    if(subscelta==1){                                           //SCELTA SI
                        if(economica>=6 && economica<=10 ){                     // SE C'E' QUALCHE POSTO ANCORA DISPONIBILE LO ASSEGNA
                            posto[economica]=true;
                            System.out.printf("Classe Economica. Posto #%d.\n\n", economica);
                            economica++;
                            
                        }
                        else{
                            System.out.println("Spiacenti. Nessun Posto Disponibile."); //NON C'E' NESSUN POSTO DISPONIBILE IN NESSUNA CLASSE
                        }
                    }
                    else{
                        System.out.println("Il prossimo volo parte fra 3 ore.");//SCELTA NO
                    }
                }
                
            }
            
            if(scelta==2){                                                      //SCELTA CLASSE ECONOMICA
                if(economica>=6 && economica<=10 ){                             // SE C'E' QUALCHE POSTO ANCORA DISPONIBILE LO ASSEGNA
                    posto[economica]=true;
                    System.out.printf("Classe Economica. Posto #%d.\n\n",economica);
                    economica++;
                     
                }
                else{
                    System.out.println("La Classe Economica e' piena. Prima Classe?");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    System.out.print("Scelta: ");
                    
                    subscelta=input.nextInt();
                    
                    if(subscelta==1){                                           //SCELTA SI
                        if(prima>=1 && prima<=5 ){                              // SE C'E' QUALCHE POSTO ANCORA DISPONIBILE LO ASSEGNA
                            posto[prima]=true;
                            System.out.printf("Prima Classe. Posto #%d.\n\n",prima);
                            prima++;
                            
                        }
                        else{
                            System.out.println("Spiacenti. Nessun Posto Disponibile.");//NON C'E' NESSUN POSTO DIPONIBILE IN ALCUNA CLASSE
                        }
                    }
                    else{
                        System.out.println("Il prossimo volo parte fra 3 ore.");//SCELTA NO
                    }
                }
                
            }
        
        //RISTAMPA SCHERMATA E SCELTA
        System.out.println("Inserire 1 per la Prima Classe");
        System.out.println("Inserire 2 per la Classe Economica");
        System.out.println("Inserire -1 per terminare");
        System.out.print("Scelta: ");
        
        scelta=input.nextInt();
        }
        
    }
}