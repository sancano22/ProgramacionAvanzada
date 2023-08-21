/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Comunas;
import static Modelos.ComunaDB.ListaComunas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;


public class Comuna {
    public String query;
        public ArrayList<Comunas> Leer(Connection link,int id){
            
            try{
            Statement s = link.createStatement();

            query="SELECT * FROM `Comunas` inner join provincias on Comunas.id_pr=provincias.id where provincias.region_id="+id +" order by Comunas.str_descripcion ASC ";
            System.out.println(query);
            ResultSet rs=s.executeQuery(query);
            ListaComunas.clear();
                while (rs.next()){
                   Comunas comuna=new Comunas();
                   comuna.setId(rs.getInt("id_co"));
                   comuna.setNombre(rs.getString("str_descripcion"));
                   ListaComunas.add(comuna);

                }
            
            return ListaComunas;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
         return null;
       }

}
