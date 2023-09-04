/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Estudiante {
    
    private String nombres;
    private String apellidos;
    private String rut; 
    private Date fechaNacimiento;
    private char genero;
    private String region;
    private ArrayList<Estudiante>listaEstudiante=new ArrayList<Estudiante>();
    public  String file = "src/test/estudiantes.txt";
    public Scanner entrada=new Scanner(System.in);

    
    public Estudiante(){
        
    }
    public Estudiante(String nombres, String apellidos, String rut, char genero,Date fechaNacimiento,  String region) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.genero=genero;
        this.region = region;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getRut() {
        return rut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRegion() {
        return region;
    }

    public ArrayList<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public String getFile() {
        return file;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setListaEstudiante(ArrayList<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public void setFile(String file) {
        this.file = file;
    }
        

   
  public boolean crearDato() throws ParseException{
  
      System.out.println("Digite los nombres");
      this.nombres=entrada.next();
      System.out.println("Digite los nombres");
      this.apellidos=entrada.next();
      System.out.println("Digite rut");
      this.rut=entrada.next();
      System.out.println("Digite fecha de nacimiento dd/mm/YYYY");

      this.fechaNacimiento=new SimpleDateFormat("dd/mm/YYYY").parse(entrada.next());
    
      System.out.println("Digite la region");
      this.region=entrada.next();
      System.out.println("Digite el genero");
      this.genero=entrada.next().charAt(0);

      listaEstudiante.add(new Estudiante(this.nombres, this.apellidos, this.rut, this.genero, this.fechaNacimiento, this.region));
      
      return true;
  }
  
  public void leerDatos(){
        try {
             BufferedReader archivo = new BufferedReader(new FileReader(file));
            
             int i=0;
             String linea;
             String [] campos=new String[6]; //el total de columnas a leer.
              while ((linea = archivo.readLine()) != null) {
                
                
                if(i>0){
                   campos=linea.split(";");
                   Date fecha=new SimpleDateFormat("dd/mm/yyyy").parse(campos[4]);

                   
                   listaEstudiante.add(new Estudiante(campos[0],campos[1],campos[2],campos[3].charAt(0),fecha,campos[5]));
           
                //tratamiento para separar cada dato por ';'
                }
                
                i++;
             }
              
             System.out.println("el tamaño de objetos es "+listaEstudiante.size()); 
             
        } catch (FileNotFoundException ex) {
            System.out.print(ex);
        }catch (IOException e){
        
        } catch(ParseException e){
            
        }
    }
   

    
    
    
}
