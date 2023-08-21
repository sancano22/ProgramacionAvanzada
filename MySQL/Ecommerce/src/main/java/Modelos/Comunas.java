/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author sandracano
 */
public class Comunas {
    
    private int Id;
    private int IdRegion;
    private String Nombre;

    public Comunas() {
    }

    public Comunas(int Id, int IdRegion, String Nombre) {
        this.Id = Id;
        this.IdRegion = IdRegion;
        this.Nombre = Nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdRegion() {
        return IdRegion;
    }

    public void setIdRegion(int IdRegion) {
        this.IdRegion = IdRegion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    
 
}
