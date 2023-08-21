/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author sandracano
 */
public interface ProductoDB {
    
    ArrayList<Producto>ListaProductos=new ArrayList<Producto>();
    public void Crear();
    public void Actualizar();
    public void Eliminar();
    public void Leer();
}
