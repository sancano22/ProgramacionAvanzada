import java.text.SimpleDateFormat;
import java.util.Date;
public class principal {
    public static void main(String args[]){
        String fechaentrada;
        Scanner Entrada=new Scanner(System.in);
        Date fecha=new Date();

        System.out.println("Digite la fecha");
        fechaentrada=Entrada.next();

        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy hh:mm");
        fecha=formato.parse(fechaentrada);

        Persona [] listPersonas=new Persona[3];

       //crear ==Create
        listPersonas[0]=new Persona("pepito","perez","1212121-1",fecha,12);
        listPersonas[1]=new Persona("juanita","perez","1212121-1",fecha,15);
        listPersonas[2]=new Persona("pepita","perez","1212121-1",fecha,22);
        //leer==Read
        System.out.println("El apellido es "+listPersonas[2].apellidos);
        //Actualizar ==Update
        listPersonas[2].apellidos="guzman";
        //Eliminr==DELETE
        listaPersonas[2]=null;








    }
}
