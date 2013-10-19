package Libro1.Ese722;

import java.util.Random;

public class SaltoCavallo {
  Random rnd = new Random();
  private int scacchiera[][] = new int[8][8];
  private int riga, colonna, mossa, conta2;
  private boolean possibilita;
  public void inizio(){
      
      //GENERA POSIZIONE RANDOM DEL CAVALLO
      riga= rnd.nextInt(7);
      colonna =rnd.nextInt(7);
      scacchiera[riga][colonna]=1;
      possibilita=false;
      
      
      for(conta2=2; conta2<66; conta2++){
          //VERIFICA POSSIBILITA' DI MUOVERSI
          /*
           * 1. Verifica se ogni mossa disponibile non sfora i margini della scacchiera
           * 2. Verifica se non si e' già passati per quella casella
           * 3. altrimenti verifica la mossa successiva
           * 4. Se è disponibile, viene verificato se possibilita è su true ed effettua la mossa corrispondente
           * 5. Se alla fine della verifica, non c'è nessuna mossa disponibile (possibilita si false), stampa la scacchiera
           */
          for(int conta=0; conta<8; conta++){
            switch(conta){
                case 0:
                    //MOSSA 0
                    if(((riga+2)<8) && ((colonna-1)>=0)){
                        if(scacchiera[riga+2][colonna-1] == 0){
                            possibilita=true;
                            mossa=0;
                        }
                        else{
                            possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 1:
                    //MOSSA 1
                    if(((riga+1)<=7) && ((colonna-2)>=0)){
                        if(scacchiera[riga+1][colonna-2] == 0){
                            possibilita=true;
                            mossa=1;
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 2:
                    //MOSSA 2
                    if(((riga-1)>=0) && ((colonna-2)>=0)){
                        if(scacchiera[riga-1][colonna-2] == 0){
                            possibilita=true;
                            mossa=2;
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 3:
                    //MOSSA 3
                    if(((riga-2)>=0) && ((colonna-1)>=0)){
                        if(scacchiera[riga-2][colonna-1] == 0){
                            possibilita=true;
                            mossa=3;    
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 4:
                    //MOSSA 4
                    if(((riga-2)>=0) && ((colonna+1)<=7)){
                        if(scacchiera[riga-2][colonna+1] == 0){
                            possibilita=true;
                            mossa=4;    
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 5:
                    //MOSSA 5
                    if(((riga-1)>=0) && ((colonna+2)<=7)){
                        if(scacchiera[riga-1][colonna+2] == 0){
                            possibilita=true;
                            mossa=5;    
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 6:
                    //MOSSA 6
                    if(((riga+1)<=7) && ((colonna+2)<=7)){
                        if(scacchiera[riga+1][colonna+2] == 0){
                            possibilita=true;
                            mossa=6;
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                case 7:
                    //MOSSA 7
                    if(((riga+2)<=7) && ((colonna+1)<=7)){
                        if(scacchiera[riga+2][colonna+1] == 0){
                            possibilita=true;
                            mossa=7;
                        }
                        else{
                        possibilita=false;
                        }
                    }
                    else{
                        possibilita=false;
                    }
                    break;

                default:
                    possibilita=false;
                    break;
            }

            if(possibilita==true)
                break;
        }
        
        //EFFETTUA MOSSA
        if(possibilita==false)
            break;
        
          switch(mossa){
            case 0:
                scacchiera[riga+2][colonna-1]=conta2;
                riga+=2;
                colonna-=1;
                break;
                
            case 1:
                scacchiera[riga+1][colonna-2]=conta2;
                riga+=1;
                colonna-=2;
                break;
                
            case 2:
                scacchiera[riga-1][colonna-2]=conta2;
                riga-=1;
                colonna-=2;
                break;
                
            case 3:
                scacchiera[riga-2][colonna-1]=conta2;
                riga-=2;
                colonna-=1;
                break;
                    
            case 4:
                scacchiera[riga-2][colonna+1]=conta2;
                riga-=2;
                colonna+=1;
                break;
        
            case 5:
                scacchiera[riga-1][colonna+2]=conta2;
                riga-=1;
                colonna+=2;
                break;
                
            case 6:
                scacchiera[riga+1][colonna+2]=conta2;
                riga+=1;
                colonna+=2;
                break;
                
            case 7:
                scacchiera[riga+2][colonna+1]=conta2;
                riga+=2;
                colonna+=1;
                break;
        }
      }

      
      // STAMPA SCACCHIERA
      for(riga=0; riga<8; riga++){
          for(colonna=0; colonna<8; colonna++){
              System.out.printf("%2d ", scacchiera[riga][colonna]);
          }
          System.out.println();
      }
      
      System.out.printf("\nNessuna Mossa disponibile. Sono state effettuate %d mosse.\n", conta2-1);
  }
}

 