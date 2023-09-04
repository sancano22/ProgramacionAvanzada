

package com.mycompany.laboratorio1;

import java.text.ParseException;

/**
 *
 * @author sandracano
 */
public class Laboratorio1 {
    
    
    
    public static void main(String[] args) throws ParseException {
        
        Estudiante estudiante=new Estudiante();
        estudiante.leerDatos();
        
       for(int i=0;i<estudiante.getListaEstudiante().size();i++){
           System.out.println(estudiante.getListaEstudiante().get(i).getRegion());
       }


       if(estudiante.crearDato()){
           System.out.println("El dato fue ingresado "+estudiante.getListaEstudiante().size());
           
       }

      
        
    }
    
}
