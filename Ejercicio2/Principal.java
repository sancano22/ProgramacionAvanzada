import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
    public static void main(String args[]) throws ParseException{
      Date fecha=new Date();
      String fecha1="12/12/2023 12:30";

      SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy hh:mm");
      fecha=formato.parse(fecha1);
      Persona persona=new Persona();


      






    }


    
}
