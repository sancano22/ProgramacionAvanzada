/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ep1;

/**
 *
 * @author sandracano
 */
public class Persona {
  private String Nombre;
  private String Rut;
  private int Tipo; // 1: profesor, 2: docente

  public Persona(String nombre, String rut, int tipo) {
    this.Nombre = nombre;
    this.Rut = rut;
    this.Tipo = tipo;
  }

  // accesores
  public String getNombre() {
    return this.Nombre;
  }

  public String getRut() {
    return this.Rut;
  }

  public int getTipo() {
    return this.Tipo;
  }

  // mutadores

  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public void setRut(String rut) {
    this.Rut = rut;
  }
  
}