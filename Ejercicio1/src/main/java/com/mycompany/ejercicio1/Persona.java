
package com.mycompany.ejercicio1;

import java.util.Date;


public class Persona {
    
    //atributos
    private String nombre;
    private String apellido;
    private String rut;
    private Date fechaNacimiento;
    
    //constructor
    //sobrecarga de constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
   
    
    
    /*
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getRut(){
        return this.rut;
    }
    
    public void setRut(String rut){
        this.rut=rut;
    }
    
    public Date getfechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setfechaNacimiento(Date fecha){
        this.fechaNacimiento=fecha;
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //comportamientos 
    //CRUD: Create, Read, Update, Delete
    public void crearDatos(){
        
    }
    
    public void leerDatos(){
        
    }
    
    
    
    
    
    
    
}
