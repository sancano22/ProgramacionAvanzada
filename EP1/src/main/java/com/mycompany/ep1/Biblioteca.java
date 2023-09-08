/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep1;

/**
 *
 * @author sandracano
 */
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Biblioteca {

  private int ID;
  private String Titulo;
  private int Estado; // 1:reservado 2: sin reserva
  private int Tipo; // 1: revista 2: libro 3: tesis
  private Date Fecha;
  private Scanner Entrada;
  
  Biblioteca(){
      Entrada=new Scanner(System.in);
      
  }
  
  
  Biblioteca(int ID, String Titulo, int estado, int tipo,Date fecha) {
    this.ID = ID;
    this.Titulo = Titulo;
    this.Estado = estado;
    this.Tipo = tipo;
    this.Fecha=fecha;
  }

  // accesores

  public int getID() {
    return this.ID;
  }

  public String getTitulo() {
    return this.Titulo;
  }

  public int getEstado() {
    return this.Estado;
  }

  public int getTipo() {
    return this.Tipo;
  }

  public Date getFecha() {
    return this.Fecha;
  }

  // mutadores

  public void setID(int id) {
    this.ID = id;
  }

  public void setTitulo(String titulo) {
    this.Titulo = titulo;
  }

  public void setEstado(int estado) {
    this.Estado = estado;
  }

  public void setTipo(int tipo) {
    this.Tipo = tipo;
  }

  public void setFecha(Date fecha) {
    this.Fecha = fecha;
  }
  
  public Biblioteca crearDato() throws ParseException{
      System.out.println("Ingrese el ID"); 
      this.ID=Entrada.nextInt();
      Entrada.nextLine();
      System.out.println("Ingrese el Titulo"); 
      this.Titulo=Entrada.nextLine();
      
      System.out.println("Ingrese el Estado"); 
      this.Estado=Entrada.nextInt();
      
      System.out.println("Ingrese el Tipo"); 
      this.Estado=Entrada.nextInt();
      
      
      System.out.println("Ingrese La fecha de publicacion"); 
      this.Fecha= new SimpleDateFormat("dd/mm/YYYY").parse(Entrada.next());
      
     
      return new Biblioteca(this.ID, this.Titulo,this.Estado, this.Tipo, this.Fecha);
  }
  
  
  public void leerDato(ArrayList<Biblioteca> Lista){
      Lista.forEach(item->{
          System.out.println("Id: "+item.ID);
          System.out.println("Titulo:"+item.Titulo);
          if(item.Estado==1) System.out.println("Reservado");
          else System.out.println("No Reservado");
          switch(item.Tipo){
              case 1-> System.out.println("Tipo Revista");
              case 2-> System.out.println("Tipo Libro");
              case 3-> System.out.println("Tipo Tesis");
          }
          System.out.println("Fecha"+item.Fecha);
      });
  }

}