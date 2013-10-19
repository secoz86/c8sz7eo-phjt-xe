package Libro1.Ese722;

import java.util.Random;

public class SaltoCavalloB {
  Random rnd = new Random();
  private int scacchiera[][] = new int[8][8];
  
  private int accessibilita[][]={ {2,3,4,4,4,4,3,2},
                                  {3,4,6,6,6,6,4,3},
                                  {4,6,8,8,8,8,6,4},
                                  {4,6,8,8,8,8,6,4},
                                  {4,6,8,8,8,8,6,4},
                                  {4,6,8,8,8,8,6,4},
                                  {3,4,6,6,6,6,4,3},
                                  {2,3,4,4,4,4,3,2} };
  
                              
  private int riga, colonna, mossa, conta2, valoreAcc=9;
  private boolean possibilita;
  
  public void inizio(){
      
      //GENERA POSIZIONE RANDOM DEL CAVALLO
      riga=rnd.nextInt(7);
      colonna=rnd.nextInt(7);
      scacchiera[riga][colonna]=1;
      possibilita=false;
      
      //AGGIORNA TABELLA ACCESSIBILITA'
      modificaAccess( riga, colonna, accessibilita);

      
      for(conta2=2; conta2<64; conta2++){
          //VERIFICA POSSIBILITA' DI MUOVERSI
          /*
           * 1. Verifica se ogni mossa disponibile non sfora i margini della scacchiera
           * 2. Verifica se non si e' già passati per quella casella
           * 3. altrimenti verifica la mossa successiva
           * 4. Se è disponibile, viene verificato se possibilita è su true ed effettua la mossa corrispondente
           * 5. Se alla fine della verifica, non c'è nessuna mossa disponibile (possibilita si false), stampa la scacchiera
           */
          mossa=trovaAccess(riga,colonna,accessibilita,mossa,scacchiera);
   
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
        modificaAccess( riga, colonna, accessibilita);
        valoreAcc=9;
      
      }

       //ASSEGNA 64 ALL'ULTIMO
       for(riga=0; riga<8; riga++){
          for(colonna=0; colonna<8; colonna++){
              if(scacchiera[riga][colonna]==0)
                  scacchiera[riga][colonna]=64;
          }
          System.out.println();
      }
  
      // STAMPA SCACCHIERA
      for(riga=0; riga<8; riga++){
          for(colonna=0; colonna<8; colonna++){
              System.out.printf("%2d ", scacchiera[riga][colonna]);
          }
          System.out.println();
      }    
  }
  
  public int trovaAccess(int rig, int col, int acc[][], int mos, int scacc[][]){
      //MOSSA 0
      if(((rig+2)<7) && ((col-1)>=0)){
          if(scacc[rig+2][col-1]==0){
            if(acc[rig+2][col-1]<valoreAcc){
                valoreAcc=acc[rig+2][col-1];
                mos=0;
            }
          }
      }          
      
      //MOSSA 1
      if(((rig+1)<=7) && ((col-2)>=0)){
          if(scacc[rig+1][col-2]==0){
            if(acc[rig+1][col-2]<valoreAcc){
                valoreAcc=acc[rig+1][col-2];
                mos=1;
            }
          }
      }
          
      
      //MOSSA 2
      if(((rig-1)>=0) && ((col-2)>=0)){
          if(scacc[rig-1][col-2]==0){
            if(acc[rig-1][col-2]<valoreAcc){
                valoreAcc=acc[rig-1][col-2];
                mos=2;
            }
          }
      }
      
      //MOSSA 3
      if(((rig-2)>=0) && ((col-1)>=0)){
          if(scacc[rig-2][col-1]==0){
            if(acc[rig-2][col-1]<valoreAcc){
                valoreAcc=acc[rig-2][col-1];
                mos=3;
            }
          }
      }
      
      //MOSSA 4
      if(((rig-2)>=0) && ((col+1)<=7)){
          if(scacc[rig-2][col+1]==0){
            if(acc[rig-2][col+1]<valoreAcc){
                valoreAcc=acc[rig-2][col+1];
                mos=4;
            }
          }
      }
      
      //MOSSA 5
      if(((rig-1)>=0) && ((col+2)<=7)){  
          if(scacc[rig-1][col+2]==0){
            if(acc[rig-1][col+2]<valoreAcc){
                valoreAcc=acc[rig-1][col+2];
                mos=5;
            }
          }
      }
          
      //MOSSA 6
      if(((rig+1)<=7) && ((col+2)<=7)){  
          if(scacc[rig+1][col+2]==0){
            if(acc[rig+1][col+2]<valoreAcc){
                valoreAcc=acc[rig+1][col+2];
                mos=6;
            }
          }
      }
      
      //MOSSA 7
      if(((rig+2)<=7) && ((col+1)<=7)){
          if(scacc[rig+2][col+1]==0){
            if(acc[rig+2][col+1]<valoreAcc){
                valoreAcc=acc[rig+2][col+1];
                mos=7;
            }
          }
      }
      return mos;
  }

  public void modificaAccess(int rig, int col, int acc[][]){
      //MOSSA 0
      if(((rig+2)<7) && ((col-1)>=0))
          acc[rig+2][col-1]-=1;
      
      //MOSSA 1
      if(((rig+1)<=7) && ((col-2)>=0))
          acc[rig+1][col-2]-=1;
      
      //MOSSA 2
      if(((rig-1)>=0) && ((col-2)>=0))
          acc[rig-1][col-2]-=1;
      
      //MOSSA 3
      if(((rig-2)>=0) && ((col-1)>=0))
          acc[rig-2][col-1]-=1;
      
      //MOSSA 4
      if(((rig-2)>=0) && ((col+1)<=7))
          acc[rig-2][col+1]-=1;
          
      //MOSSA 5
      if(((rig-1)>=0) && ((col+2)<=7))   
          acc[rig-1][col+2]-=1;
          
      //MOSSA 6
      if(((rig+1)<=7) && ((col+2)<=7))   
          acc[rig+1][col+2]-=1;
      
      //MOSSA 7
      if(((rig+2)<=7) && ((col+1)<=7))
          acc[rig+2][col+1]-=1;
  }
}
   
  
  
  
  
  
  
  
  



     

 