/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Conexion.Conexion;
import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author perfil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.Conectar();
        String Nombre,Apellido,Direccion,Cedula,Uid,producto,Nom_img, Nom_p, Marca ,Serial;
        int retorno_num = 0, retorno_ce = 0, retorno_letra = 0, retorno_ce2 = 0, retorno_ced = 0, retorno_vac = 0;

        Scanner scan = new Scanner(System.in);
        int opc = 0; int Num_pro=0;
        ArrayList<Persona> Lspersonas = new ArrayList<>();
        ArrayList<Producto> ProductosGlobal = null;
       
        Producto objProducto;
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
                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nombre);
                    while (retorno_vac != 0) {
                        System.out.println("Digite el nombre de la persona: ");
                        Nombre = scan.nextLine();
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nombre);
                    }

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nombre);
                    retorno_num = Helpers.HelperValidacion.RetornarLetra(Nombre);
                    retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Nombre);
                    // fin nombre
                    System.out.println("Ingresar Apellido de la persona");
                    Apellido=scan.nextLine();
                    
                    //fin apellio
                    System.out.println("ingresar direccion de la persona");
                    Direccion=scan.nextLine();
                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Apellido);
                    while (retorno_vac != 0) {
                        System.out.println("Digite el apellido de la persona: ");
                        Apellido = scan.nextLine();
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Apellido);
                    }

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Apellido);
                    retorno_num = Helpers.HelperValidacion.RetornarLetra(Apellido);
                    retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Apellido);

                    while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
                        System.out.println("Digite el apellido de la persona: ");
                        Apellido = scan.nextLine();

                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Apellido);
                        retorno_num = Helpers.HelperValidacion.RetornarLetra(Apellido);
                        retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Apellido);
                    }
                    //Fin apellido

                    //Cedula
                    System.out.println("Digite el numero de cedula de la persona: ");
                    Cedula = scan.nextLine();

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Cedula);
                    while (retorno_vac != 0) {
                        System.out.println("Digite el numero de cedula de la persona: ");
                        Cedula = scan.nextLine();
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Cedula);
                    }

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Cedula);
                    retorno_letra = Helpers.HelperValidacion.RetornarLetra(Cedula);
                    retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Cedula);
                    //retorno_ced = Persona.VerificarCedula(Lista_personas, Cedula);

                    while (retorno_letra != 0 || retorno_ce != 0 || retorno_ced != 0 || retorno_vac != 0) {
                        if (retorno_ced != 0) {
                            System.out.println("El numero de cedula ingresado ya se encuentra registrado");
                        }

                        System.out.println("Digite el numero de cedula de la persona: ");
                        Cedula = scan.nextLine();

                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Cedula);
                        retorno_letra = Helpers.HelperValidacion.RetornarLetra(Cedula);
                        retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Cedula);
                        //retorno_ced = Persona.VerificarCedula(Lista_personas, Cedula);
                    }
                    //Fin cedula

                    //Direccion
                    System.out.println("Digite la direccion de la persona: ");
                    Direccion = scan.nextLine();

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Direccion);
                    while (retorno_vac != 0) {
                        System.out.println("Digite la direccion de la persona: ");
                        Direccion = scan.nextLine();
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Direccion);
                    }

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Direccion);
                    retorno_ce2 = Helpers.HelperValidacion.RetornarCEDireccionV2(Direccion);

                    while (retorno_ce2 != 0 || retorno_vac != 0) {
                        System.out.println("Digite la direccion de la persona: ");
                        Direccion = scan.nextLine();

                        retorno_ce2 = Helpers.HelperValidacion.RetornarCEDireccionV2(Direccion);
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Direccion);
                    }
                    //Fin direccion

                    //Inicio imagen
                    System.out.println("Digite el nombre de la imagen de la persona: ");
                    Nom_img = scan.nextLine();

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_img);
                    while (retorno_vac != 0) {
                        System.out.println("Digite el nombre de la imagen de la persona: ");
                        Nom_img = scan.nextLine();
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_img);
                    }

                    retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_img);
                    retorno_ce2 = Helpers.HelperValidacion.RetornarCEDireccionV2(Nom_img);

                    while (retorno_ce2 != 0 || retorno_vac != 0) {
                        System.out.println("Digite el nombre de la imagen de la persona: ");
                        Nom_img = scan.nextLine();

                        retorno_ce2 = Helpers.HelperValidacion.RetornarCEDireccionV2(Nom_img);
                        retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_img);
                    }
                    //productpo
                        ArrayList<Producto> Productos = new ArrayList<>();

                    do {
                        try {
                            System.out.println("Numero de productos que se desea añadirle: ");
                             Num_pro = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();
                    } while (Num_pro <= 0);

                    int retorno_can = Helpers.HelperValidacion.ValidarCantidadRango(Num_pro);

                 
                    if (retorno_can == 1) {
                        for (int j = 0; j < Num_pro; j++) {

                            //Nombre
                            System.out.println("Digite el nombre del producto " + (j + 1) + " :");
                            Nom_p = scan.nextLine();

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_p);
                            while (retorno_vac != 0) {
                                System.out.println("Digite el nombre del producto " + (j + 1) + " :");
                                Nom_p = scan.nextLine();
                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_p);
                            }

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_p);
                            retorno_num = Helpers.HelperValidacion.RetornarValor(Nom_p);
                            retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Nom_p);

                            while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
                                System.out.println("Digite el nombre del producto " + (j + 1) + " :");
                                Nom_p = scan.nextLine();

                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Nom_p);
                                retorno_num = Helpers.HelperValidacion.RetornarValor(Nom_p);
                                retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Nom_p);
                            }

                            //Marca
                            System.out.println("Digite la marca del producto " + (j + 1) + " :");
                            Marca = scan.nextLine();

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Marca);
                            while (retorno_vac != 0) {
                                System.out.println("Digite la marca del producto " + (j + 1) + " :");
                                Marca = scan.nextLine();
                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Marca);
                            }

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Marca);
                            retorno_num = Helpers.HelperValidacion.RetornarValor(Marca);
                            retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Marca);

                            while (retorno_num != 0 || retorno_ce != 0 || retorno_vac != 0) {
                                System.out.println("Digite la marca del producto " + (j + 1) + " :");
                                Marca = scan.nextLine();

                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Marca);
                                retorno_num = Helpers.HelperValidacion.RetornarValor(Marca);
                                retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Marca);
                            }
                            //fin marca

                            //Serial
                            System.out.println("Digite el serial del producto " + (j + 1) + " :");
                            Serial = scan.nextLine();

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Serial);
                            while (retorno_vac != 0) {
                                System.out.println("Digite el serial del producto " + (j + 1) + " :");
                                Serial = scan.nextLine();
                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Serial);
                            }

                            retorno_vac = Helpers.HelperValidacion.ValidarVacio(Serial);
                            retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Serial);

                            while (retorno_vac != 0 || retorno_ce != 0) {
                                System.out.println("Digite el serial del producto " + (j + 1) + " :");
                                Serial = scan.nextLine();

                                retorno_vac = Helpers.HelperValidacion.ValidarVacio(Serial);
                                retorno_ce = Helpers.HelperValidacion.RetornarCEV2(Serial);
                            }
                            //Fin serial
                            objProducto = new Producto(Nom_p, Marca, Serial);
                            Productos.add(objProducto);
                        }
                        }
                        ProductosGlobal = Productos;
                        Productos = null;
                    } else {
                        System.out.println("Cantidad invalida");
                        
                        break;
                    }
                    for (int i = 0; i < ProductosGlobal.size(); i++) {//Productos.add(objProducto);
                        producto += ProductosGlobal.get(i).getNombre()+ "," + ProductosGlobal.get(i).getMarca() + "," + ProductosGlobal.get(i).getSerial() + ";";

                    }
                    int id = (int) (Math.random() * 100000);

                     objPersona = new Persona(Nombre, Apellido, Direccion, Cedula, producto, String.valueOf(id), Nom_img);
                    Lspersonas.add(objPersona);
                    objPersona.setProductos(ProductosGlobal);
                    Helpers.HelperRegistro.RegistrarPersonaNube(objPersona, id, producto);
                    producto = "";
                    break;
                case 2:
                    
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
            
        } while (opc!=5);
        
        
    }//fin Main   
}
