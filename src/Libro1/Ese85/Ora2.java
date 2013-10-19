package Libro1.Ese85;

public class Ora2 {
   private int secondiMezzanotte;

   public Ora2() { 
      this(0,0,0); 
   }
   
   public Ora2(int h){
       this(h,0,0);
   }
   
   public Ora2(int h, int m){
       this(h,m,0);
   }
   
   public Ora2(int h, int m, int s){
       setOra(h,m,s);
   }
   
   public void setOra( int h, int m, int s )
   {
      int ora, minuto, secondo;

      ora = ( ( h >= 0 && h < 24 ) ? h : 0 );
      minuto = ( ( m >= 0 && m < 60 ) ? m : 0 );
      secondo = ( ( s >= 0 && s < 60 ) ? s : 0 );

      secondiMezzanotte = ora * 3600 + minuto * 60 + secondo;
   }

   public String toStringUniversale()
   {
      int ora, minuto, temp;

      ora = secondiMezzanotte / 3600;
      temp = secondiMezzanotte % 3600;
      minuto = temp / 60;

      return ( ora < 10 ? "0" : "" ) + ora +
             ( minuto < 10 ? "0" : "" ) + minuto;
   }

   public String toString()
   {
      int ora, minuto, secondo, temp;

      ora = secondiMezzanotte / 3600;
      temp = secondiMezzanotte % 3600;
      minuto = temp / 60;
      secondo = temp % 60;

      return ( ( ora == 12 || ora == 0 ) ? 12 : ora % 12 ) +
             ":" + ( minuto < 10 ? "0" : "" ) + minuto +
             ":" + ( secondo < 10 ? "0" : "" ) + secondo +
             ( ora < 12 ? " AM" : " PM" );
   }
}