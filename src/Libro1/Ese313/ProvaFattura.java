package Libro1.Ese313;

public class ProvaFattura{
    public static void main(String args[]){
        Fattura fattura1 = new Fattura("COD1","Viti",50,0.10);
        
        //METTENDO TUTTO POSITIVO
        System.out.printf("Fattura1:\n"
                        + "Codice Articolo: %s\n"
                        + "Descrizione Articolo: %s\n"
                        + "Quantita' Acquistata: %d\n"
                        + "Prezzo Unitario: %.2f\n"
                        + "Totale Fattura: %.2f\n\n",
                        fattura1.getCodiceArticolo(),
                        fattura1.getDescrizioneArticolo(),
                        fattura1.getQuantitaAcquistata(),
                        fattura1.getPrezzoUnitario(),
                        fattura1.TotaleFattura());
        
        //METTENDO QUANTITA' NEGATIVA
        fattura1.setQuantitaAcquistata(-100);
        System.out.printf("Fattura1:\n"
                        + "Codice Articolo: %s\n"
                        + "Descrizione Articolo: %s\n"
                        + "Quantita' Acquistata: %d\n"
                        + "Prezzo Unitario: %.2f\n"
                        + "Totale Fattura: %.2f\n\n",
                        fattura1.getCodiceArticolo(),
                        fattura1.getDescrizioneArticolo(),
                        fattura1.getQuantitaAcquistata(),
                        fattura1.getPrezzoUnitario(),
                        fattura1.TotaleFattura());
        
        //METTENDO QUANTITA' POSITIVA E PREZZO NEGATIVO
        fattura1.setQuantitaAcquistata(20);
        fattura1.setPrezzoUnitario(-3.00);
        
        System.out.printf("Fattura1:\n"
                        + "Codice Articolo: %s\n"
                        + "Descrizione Articolo: %s\n"
                        + "Quantita' Acquistata: %d\n"
                        + "Prezzo Unitario: %.2f\n"
                        + "Totale Fattura: %.2f\n\n",
                        fattura1.getCodiceArticolo(),
                        fattura1.getDescrizioneArticolo(),
                        fattura1.getQuantitaAcquistata(),
                        fattura1.getPrezzoUnitario(),
                        fattura1.TotaleFattura());       
    }
}