package Libro1.Ese619;

public class Quadrato {
    private int lato;
    private char carattere;
    
    public void setLato(int lat){
        lato=lat;
    }
    
    public int getLato(){
        return lato;
    }
    
    public void setCarattere(char car){
        carattere=car;
    }
    
    public char getCarattere(){
        return carattere;
    }
    
    public void stampaQuadrato(int lat,char car){
        for(int i=0; i<lat; i++){
            for(int y=0; y<lat; y++){
                System.out.printf("%c",car);
            }
            System.out.print("\n");
        }
    }
}
