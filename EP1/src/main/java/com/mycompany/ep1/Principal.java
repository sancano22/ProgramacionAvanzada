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
import java.util.Scanner;

/**
 *
 * @author sandracano
 */
public class Principal {

 
    public static String file = "src/test/biblioteca.txt";
    public static ArrayList<Biblioteca> ListaBiblioteca=new ArrayList<Biblioteca>();
    
    public static void main(String args[]) throws ParseException{
        int opcion=-1;
        Scanner entrada;
        
        leerDatos();
        entrada=new Scanner(System.in);
        //leer y mostrar datos 
       
        Operacion operaciones=new Operacion();
        while(opcion!=0){
            operaciones.Menu();
            opcion=entrada.nextInt();
            switch(opcion){
                case 1 -> {
                    Biblioteca biblioteca=new Biblioteca();
                    ListaBiblioteca.add(biblioteca.crearDato());
                    
                } 
                case 3->{
                   Biblioteca biblioteca=new Biblioteca();
                   biblioteca.leerDato(ListaBiblioteca);
                }

            }
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
                   ListaBiblioteca.add(new Biblioteca(Integer.valueOf(campos[0]),campos[1],Integer.valueOf(campos[2]),Integer.valueOf(campos[3]),fecha));
                //tratamiento para separar los ';'
                }
                
                i++;
             }
              
             System.out.println("el tamaño de objetos es "+ListaBiblioteca.size()); 
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException e){
        
        } catch(ParseException e){
            
        }
    }
        
    
  
    
}
