/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Regiones;
import static Modelos.RegionDB.ListaRegiones;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;


public class Region {
        public String query;
        public ArrayList<Regiones> Leer(Connection link){
            
            try{
            Statement s = link.createStatement();
            query="select * from Regiones ORDER BY str_descripcion ASC";
            ResultSet rs=s.executeQuery(query);
                while (rs.next()){
                   Regiones region=new Regiones();
                   region.setId(rs.getInt("id_re"));
                   region.setNombre(rs.getString("str_descripcion"));
                   ListaRegiones.add(region);

                }
            
            return ListaRegiones;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
       }
        
        public int Buscar(Connection link, String nombre){
            int id=0;
            try{
            Statement s = link.createStatement();
            query="select * from Regiones where str_descripcion='"+nombre+"'";
            ResultSet rs=s.executeQuery(query);
                while (rs.next()){
                   
                   id=rs.getInt("id_re");
                   

                }
            
              return id;
           }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
        }

}
