/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep1;

/**
 *
 * @author sandracano
 */
import java.util.Date;

class Biblioteca {

  private int ID;
  private String Titulo;
  private int Estado; // 1:reservado 2: sin reserva
  private int Tipo; // 1: revista 2: libro 3: tesis
  private Date Fecha;

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

}