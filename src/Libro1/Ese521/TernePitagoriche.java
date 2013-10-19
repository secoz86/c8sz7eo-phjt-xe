package Libro1.Ese521;

public class TernePitagoriche {
    public void calcola(){
        for(int cateto1=1;cateto1<=500;cateto1++){
            for(int cateto2=1;cateto2<=500;cateto2++){
                for(int ipotenusa=1;ipotenusa<=500;ipotenusa++){
                    if((Math.pow(cateto1,2)+Math.pow(cateto2,2))==Math.pow(ipotenusa,2))
                        System.out.printf("Terna: Cateto1: %d\tCateto2: %d\tIpotenusa: %d\n", cateto1,cateto2,ipotenusa);
                }
            }
        }
    }
}
