import java.util.Date;

public class Persona {
    public String nombre;
    public String apellidos; 
    public Date fechaNacimiento; 
    public String rut;
    public int edad;

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.apellidos="";
        this.fechaNacimiento = null ;
        this.rut="";
    }
    public Person(String nombre, String apellidos, Date fecha, String rut, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento = fecha;
        this.rut=rut;
        this.edad=edad;
    }

   //CRUD
    public void crearDato(){
       
    }

    public void leerDato(){

    }

    public void eliminarDato(){

    }

    public void actualizarDato(){

    }
}
