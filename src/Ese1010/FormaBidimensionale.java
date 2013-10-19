/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public abstract class FormaBidimensionale extends Forma {
    private int dimensione1, dimensione2;
    
    //costruttore di formabidimensionale
    public FormaBidimensionale(int x, int y, int dim1, int dim2){
        super(x,y);
        dimensione1=dim1;
        dimensione2=dim2;
    }
    
    //metodi set e get di dimensione1
    public void setDimensione1(int dim1){
        dimensione1=dim1;
    }
    
    public int getDimensione1(){
        return dimensione1;
    }
    
    //metodi set e get di dimensione2
    public void setDimensione2(int dim2){
        dimensione2=dim2;
    }
    
    public int getDimensione2(){
        return dimensione2;
    }
    
    //metodo astratto getArea
    public abstract int getArea();
}
