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
public interface ComunaDB {
     ArrayList<Comunas>ListaComunas=new ArrayList<Comunas>();
    public ArrayList<Comunas> Leer(Connection link, int id);
  
}
