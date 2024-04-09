/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1003311202
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String Nombre,Apellido,Direccion,Cedula,Uid,Producto,Nom_img;
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Persona> Lspersonas = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int opc=0;
        do {            
            System.out.println("*******MENU*********");
            System.out.println("1. Registrar Persona");
            System.out.println("2. ");
            
            switch (opc) {
                case 1:// registrar persona y producto
                    System.out.println("¿cantidad de personas a registrar?");
                    int cantiadad=0;
                    cantiadad=scan.nextInt();
                    for(int i=0;i<cantiadad;i++){
                    System.out.println("Ingresar nombre de la perdsona");
                    Nombre=scan.nextLine();
                    System.out.println("Ingresar Apellido de la persona");
                    Apellido=scan.nextLine();
                    System.out.println("ingresar direccion de la persona");
                    Direccion=scan.nextLine();
                    System.out.println("Digite la contraseña");
                    Cedula=scan.nextLine();
                    System.out.println("Digite el identificador único");
                    Uid=scan.nextLine();
                    
                    System.out.println("digit el numero de imagen");
                    Nom_img=scan.nextLine();
                    
                    
                    //productpo
                        System.out.println("Cantiadad de productos de la persona");
                        cantiadad=scan.nextInt();
                        for(int j=0;j< cantiadad;j++){
                        if(cantiadad>0){
                            System.out.println(" digite Nombre del producto");
                            String NombreP=scan.nextLine();
                            System.out.println("digite la Marca del producto");
                            String Marca=scan.nextLine();
                            System.out.println("digite el serial del producto");
                            String serial=scan.nextLine();
                            Producto objProducto=new Producto(NombreP, Marca, serial);
                            productos.add(objProducto);
                            
                        }
                        }
                    Persona Objpersona = new Persona(Nombre, Apellido, Direccion, Cedula, Uid, Producto, Nom_img, productos);
                    Lspersonas.add(Objpersona);
                        
                    }
                    
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
            
        } while (opc!=5);
        
        
    }
     
}
