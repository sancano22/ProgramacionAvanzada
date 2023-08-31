/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ep1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author sandracano
 */
public class Principal {

    
    /**
     * @param args the command line arguments
     */
    
    
    public static String file = "src/test/biblioteca.txt";
    public static ArrayList<Biblioteca> biblioteca=new ArrayList<Biblioteca>();
    
    public static void main(String args[]) throws ParseException{
       
        //leer y mostrar datos Biblioteca
        //leerDatos();
        //mostrarDatos();
        Date fecha=new SimpleDateFormat("dd/mm/yyyy").parse("12/02/2022");
        Biblioteca salida= new Biblioteca(1,"sancano",1,1,fecha);
        Biblioteca salida1= new Biblioteca(1,"sancano",1,1,fecha);

        biblioteca.add(salida);
        
          System.out.println(biblioteca.size());
 
        if(biblioteca.contains(salida1)==true){
            
            System.out.println("esta");
        }
         
    }
    
    
    public static void leerDatos(){
        try {
            BufferedReader archivo = new BufferedReader(new FileReader(file));
            
             int i=0;
             String linea;
             String [] campos=new String[5];
              while ((linea = archivo.readLine()) != null) {
                
                //System.out.println();
                if(i>0){
                   campos=linea.split(";");
                   Date fecha=new SimpleDateFormat("dd/mm/yyyy").parse(campos[4]);
                   
                   
                    biblioteca.add(new Biblioteca(Integer.valueOf(campos[0]),campos[1],Integer.valueOf(campos[2]),Integer.valueOf(campos[3]),fecha));
                //tratamiento para separar los ';'
                }
                
                i++;
             }
              
             System.out.println("el tamaño de objetos es "+biblioteca.size()); 
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException e){
        
        } catch(ParseException e){
            
        }
    }
        
    
    public static void mostrarDatos(){
         //Mostrardatos
         
         for(int i=0;i<biblioteca.size();i++){
             System.out.println("El contenido del objeto "+ (i+1)+" es");
             System.out.println("Id:"+ biblioteca.get(i).getID()+ " Titulo:"+ biblioteca.get(i).getTitulo()+" Estado:"+biblioteca.get(i).getEstado()+"Tipo:"+biblioteca.get(i).getTipo()+"Fecha:"+biblioteca.get(i).getFecha());
             
             
         }
        
    }
    
}
