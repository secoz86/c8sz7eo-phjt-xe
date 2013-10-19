/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1010;

/**
 *
 * @author Daniele
 */
public abstract class FormaTridimensionale extends Forma {
    private int dimensione1, dimensione2, dimensione3;
    
    //costruttore di formabidimensionale
    public FormaTridimensionale(int x, int y, int dim1, int dim2, int dim3){
        super(x,y);
        dimensione1=dim1;
        dimensione2=dim2;
        dimensione3=dim3;
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
    
    //metodi set e get di dimensione1
    public void setDimensione3(int dim3){
        dimensione3=dim3;
    }
    
    public int getDimensione3(){
        return dimensione3;
    }
    
    //metodo astratto getArea e getVolume
    public abstract int getArea();
    public abstract int getVolume();
    
}
