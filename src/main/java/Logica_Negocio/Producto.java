/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1002807593
 */
public class Producto {
    public String Marca;
    public String Serial;
    public String Tamaño;

    public Producto() {
    }

    public Producto(String Marca, String Serial, String Tamaño) {
        this.Marca = Marca;
        this.Serial = Serial;
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    
    
}
