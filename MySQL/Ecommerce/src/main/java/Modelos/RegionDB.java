/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author sandracano
 */
public interface RegionDB {
    ArrayList<Regiones>ListaRegiones=new ArrayList<Regiones>();
    
    public ArrayList<Regiones> Leer(Connection link);
    public Regiones Buscar(Connection link, String Nombre);
    
}
