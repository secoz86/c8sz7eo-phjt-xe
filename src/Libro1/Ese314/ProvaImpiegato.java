package Libro1.Ese314;

public class ProvaImpiegato{
    public static void main(String args[]){
        Impiegato imp1 = new Impiegato("Daniele", "Arnadi", 1200.0);
        Impiegato imp2 = new Impiegato("Fabio","Leporini",-800.0);
        
        //Visualizza il primo impiegato
        System.out.printf("Impiegato 1:\nNome: %s\nCognome: %s\nStipendio Mensile: %.2f €\nStipendio Annuale: %.2f €\n\n",
                            imp1.getNome(),imp1.getCognome(),imp1.getStipendioMensile(),((imp1.getStipendioMensile())*12));
        
         //Visualizza il secondo impiegato
        System.out.printf("Impiegato 2:\nNome: %s\nCognome: %s\nStipendio Mensile: %.2f €\nStipendio Annuale: %.2f €\n\n",
                            imp2.getNome(),imp2.getCognome(),imp2.getStipendioMensile(),((imp2.getStipendioMensile())*12));
        
        //aumento 10% a imp1
        imp1.setStipendioMensile((imp1.getStipendioMensile()+((imp1.getStipendioMensile())*10)/100));
        
        //aumento 10% a imp2
        imp2.setStipendioMensile((imp2.getStipendioMensile()+((imp2.getStipendioMensile())*10)/100));
        
         //Visualizza il primo impiegato
        System.out.printf("Impiegato 2:\nNome: %s\nCognome: %s\nStipendio Mensile: %.2f €\nStipendio Annuale: %.2f €\n\n",
                            imp1.getNome(),imp1.getCognome(),imp1.getStipendioMensile(),((imp1.getStipendioMensile())*12));
        
         //Visualizza il secondo impiegato
        System.out.printf("Impiegato 2:\nNome: %s\nCognome: %s\nStipendio Mensile: %.2f €\nStipendio Annuale: %.2f €\n\n",
                            imp2.getNome(),imp2.getCognome(),imp2.getStipendioMensile(),((imp2.getStipendioMensile())*12));
    }
}