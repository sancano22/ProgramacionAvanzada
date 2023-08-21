/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author sandracano
 */
public class Cliente {
    
    private String rut; 
    private String nombres; 
    private String apellidos;
    private String fechaNacimiento; 
    private String Region;
    private String Comuna;

    
    public Cliente(){
        
    }
    public Cliente(String rut, String nombres, String apellidos, String fechaNacimiento, String Region, String Comuna) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.Region = Region;
        this.Comuna = Comuna;
    }

    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRegion() {
        return Region;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }
    
    
    public void Imprimir(){
        
    }
    
    
}
