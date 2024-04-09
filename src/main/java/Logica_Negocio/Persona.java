/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author perfil
 */
public class Persona {

    public String Nombre;
    public String Apellido;
    public String Cedula;
    public String Direccion;
    public String Producto;
    public String Uid;
    public String Nom_img;
    public ArrayList <Producto>Productos; 

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Cedula, String Direccion, String Producto, String Uid, String Nom_img, ArrayList<Producto> Productos) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Producto = Producto;
        this.Uid = Uid;
        this.Nom_img = Nom_img;
        this.Productos = Productos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    public String getNom_img() {
        return Nom_img;
    }

    public void setNom_img(String Nom_img) {
        this.Nom_img = Nom_img;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

    
}
