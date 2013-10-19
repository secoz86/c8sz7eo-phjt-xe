package Libro1.Ese618;

public class Quadrato {
    private int lato;
    
    public void setLato(int lat){
        lato=lat;
    }
    
    public int getLato(){
        return lato;
    }
    
    public void stampaQuadrato(int lat){
        for(int i=0; i<lat; i++){
            for(int y=0; y<lat; y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
