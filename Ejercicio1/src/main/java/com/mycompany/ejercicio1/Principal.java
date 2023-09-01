/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sandracano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Date fecha=new Date();
        Scanner Entrada=new Scanner(System.in);
        String nombre,apellidos,rut;
        //arreglo personas
        Persona[]arregloPersonas=new Persona[5];
        
       
        for(int i=0;i<arregloPersonas.length;i++){
              System.out.println("Digite el nombre");
              nombre=Entrada.next();
              System.out.println("Digite los Apellidos");
              apellidos=Entrada.next();
              System.out.println("Digite el rut");
              rut=Entrada.next();
               
     
              Persona objeto=new Persona(nombre,apellidos,rut,fecha);
              arregloPersonas[i]=objeto;
        }
        
        System.out.println("El nombre del integrante 4 es "+arregloPersonas[3].getNombre());
        
        /*
        Persona objeto=new Persona("pepito","perez","121212",fecha);
        arregloPersonas[0]=objeto;
        System.out.println("El nombre es"+ arregloPersonas[0].getNombre());
        
        Persona objeto2=new Persona("pepita","gonzalez","121212",fecha);
        arregloPersonas[1]=objeto2;
        
        
        Persona objeto3=new Persona("sandro","castro","121212",fecha);
        arregloPersonas[2]=objeto3;
        */
        
        
        
        
    }
}
