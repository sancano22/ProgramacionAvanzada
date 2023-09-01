import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Persona {
    
    //atributos

    public String nombre;
    public String apellidos;
    public String rut;
    public Date fechaNacimiento;
    public int edad;
    public Persona listaPersona;
    public Scanner entradaDatos;
    public ArrayList<Persona> ArrayPersona=new Arraylist<>();
   
    //constructor

    public Persona(){
        this.nombre="";
        this.apellidos="";
        this.rut="";
        this.fechaNacimiento="";
        this.edad=0;
        this.entradaDatos=new Scanner(System.in);
        listaPersona=Persona[3];
    }

    public Persona(String nombre,String apellidos,String rut,Date fecha, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.rut=rut;
        this.fechaNacimiento=fecha;
        this.edad=edad;
    }

    
    //comportamientos o métodos
    public void crearDato(Persona e){
         System.out.println("Digite el nombre");
         String nombre = entradaDatos.next();
         System.out.println("Digite el apellidos");
         String apellidos = entradaDatos.next();
         System.out.println("Digite el rut");
         String rut = entradaDatos.next();
         System.out.println("Digite la fecha");
         SimpleDateFormat fechaAsignacion = SimpleDateFormat("dd/mm/YYYY");
         Date fecha=fechaAsignacion.parse(entradaDatos.next());
         System.out.println("Digite la edad");
         int edad = entradaDatos.nextInt();
         Persona personita=new Persona(nombre,apellidos,rut,fecha,edad);
         listaPersona[0]=personita;

         




    }

    public void actualizarDato(){

    }

    public void eliminarDato(){

    }

    public void leerDato(){

    }


}
