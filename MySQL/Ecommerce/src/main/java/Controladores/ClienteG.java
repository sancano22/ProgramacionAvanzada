/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelos.ClienteDB;
import Modelos.Cliente;
import java.util.ArrayList;
/**
 *
 * @author sandracano
 */
public class ClienteG implements ClienteDB {
    public String query;
    
    public ArrayList<Cliente> Leer(Connection link){

        try{
            Statement s = link.createStatement();
            query="select * from Clientes";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){
               Cliente cliente=new Cliente();
               cliente.setRut(rs.getString("rut"));
               cliente.setNombres(rs.getString("nombres"));
               cliente.setApellidos(rs.getString("apellidos"));
               cliente.setFechaNacimiento(rs.getString("fechaNacimiento"));
               cliente.setRegion(rs.getString("region"));
               cliente.setComuna(rs.getString("comuna"));
               
               ListaCliente.add(cliente);
                
            }
            
            return ListaCliente;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
    
    
    
    public boolean Crear(Connection link, Cliente cliente){
        
        try{
            Statement s = link.createStatement();
            query="INSERT INTO Clientes(rut,nombres,apellidos,fechaNacimiento,region,comuna)VALUES('"+cliente.getRut()+"','"+cliente.getNombres()+"','"+cliente.getApellidos()+"','"+cliente.getFechaNacimiento()+"','"+cliente.getRegion()+"','"+cliente.getComuna()+"')";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public Cliente Buscar(Connection link, String rut){
        Cliente cliente=new Cliente();
        try {
            Statement s = link.createStatement();
            query="select * from Clientes where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               cliente.setRut(rs.getString("rut"));
               cliente.setNombres(rs.getString("nombres"));
               cliente.setApellidos(rs.getString("apellidos"));
               cliente.setFechaNacimiento(rs.getString("fechaNacimiento"));
               cliente.setRegion(rs.getString("region"));
               cliente.setComuna(rs.getString("comuna"));
                
            }
            return cliente;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
   
    
    public boolean Actualizar(Connection link, Cliente cliente){
        try{
            Statement s = link.createStatement();
            query="UPDATE Clientes set nombres='"+cliente.getNombres()+"',apellidos='"+cliente.getApellidos()+"',fechaNacimiento='"+cliente.getFechaNacimiento()+"',region='"+cliente.getRegion()+"',comuna='"+cliente.getComuna()+"' WHERE rut='"+cliente.getRut()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
       
    }

    @Override
    public boolean Eliminar(Connection link, String rut) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * Clientes where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
}
