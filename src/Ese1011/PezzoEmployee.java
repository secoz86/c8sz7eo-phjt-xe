/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ese1011;

/**
 *
 * @author Daniele
 */
public class PezzoEmployee extends Employee{
    private double paga;
    private int pezzi;
    
    public PezzoEmployee (String first, String last, String ssn, double _paga, int _pezzi){
        super(first, last, ssn);
        setPaga(_paga);
        setPezzi(_pezzi);
    }
    
    //metodi set e get di paga
    public void setPaga(double _paga){
        paga = _paga < 0.0 ? 0.0 : _paga;
    }
    
    public double getPaga(){
        return paga;
    }
    
    //metodi set e get di pezzi
    public void setPezzi(int _pezzi){
        pezzi = _pezzi < 0 ? 0 : _pezzi;
    }
    
    public int getPezzi(){
        return pezzi;
    }
    
    public String toString(){
        return String.format("Pezzo Employee: %s\n%s: $%,.2f\n%s: %d", super.toString(), "Paga", getPaga(), "Pezzi", getPezzi());
    }
    
    public double earnings(){
        return getPaga() * getPezzi();
    }
    
}
