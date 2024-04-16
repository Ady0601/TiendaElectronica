/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import java.util.ArrayList;

/**
 *
 * @author perfil
 */
public class HelperImpresion {
    
   
    public static void ImprimirInfoPersona(ArrayList<Persona> lspersonasnube) {
        String[] parts = null,
                parts2 = null;
        int bandera = 0;
        Producto objprodu;
        ArrayList<Producto> lsnube = new ArrayList<>();

        for (int i = 0; i < lspersonasnube.size(); i++) {

            System.out.println("Persona" + "\t" + (i + 1) + "\n"
                    + "El id de la persona es:" + lspersonasnube.get(i).getUid()
                    + "El nombre de la persona es:" + "\t" + lspersonasnube.get(i).getNombre() + "\n"
                    + "El apellido de la persona es:" + "\t" + lspersonasnube.get(i).getApellido() + "\n"
                    + "La cedula de la persona es:" + "\t" + lspersonasnube.get(i).getCedula() + "\n"
                    + "La direccion de la persona es:" + "\t" + lspersonasnube.get(i).getDireccion());
            parts = lspersonasnube.get(i).getProducto().split(";");

            for (int j = 0; j < parts.length; j++) {

                parts2 = parts[j].split(",");
                objprodu = new Producto(parts2[0], parts2[1], parts2[2]);
                lsnube.add(objprodu);
            }

            for (int k = 0; k < lsnube.size(); k++) {
                System.out.println("Producto" + "\t" + (k + i));
                System.out.println("Nombre" + "\t" + lsnube.get(k).getNombre());
                System.out.println("Marca" + "\t" + lsnube.get(k).getMarca());
                System.out.println("Serial" + "\t" + lsnube.get(k).getSerial() + "\n");
            }
            lsnube.clear();
                parts = null;
                parts2 = null;

        }
    }

    public static void BuscarPersonaNube(ArrayList<Persona> lspersonasnube, String Codigo) {
        String[] parts = null,
                parts2 = null;
        int bandera = 0;
        Producto objprodu;
        ArrayList<Producto> lsnube = new ArrayList<>();

        for (int i = 0; i < lspersonasnube.size(); i++) {
            if (Codigo.equals(lspersonasnube.get(i).getUid())) {
                bandera = 1;
                System.out.println("Persona" + "\t" + (i + 1) + "\n"
                        + "El id de la persona es:" + lspersonasnube.get(i).getUid()
                        + "El nombre de la persona es:" + "\t" + lspersonasnube.get(i).getNombre() + "\n"
                        + "El apellido de la persona es:" + "\t" + lspersonasnube.get(i).getApellido() + "\n"
                        + "La cedula de la persona es:" + "\t" + lspersonasnube.get(i).getCedula() + "\n"
                        + "La direccion de la persona es:" + "\t" + lspersonasnube.get(i).getDireccion());
                parts = lspersonasnube.get(i).getProducto().split(";");

                for (int j = 0; j < parts.length; j++) {

                    parts2 = parts[j].split(",");
                    objprodu = new Producto(parts2[0], parts2[1], parts2[2]);
                    lsnube.add(objprodu);
                }

                for (int k = 0; k < lsnube.size(); k++) {
                    System.out.println("Producto" + "\t" + (k + i));
                    System.out.println("Nombre" + "\t" + lsnube.get(k).getNombre());
                    System.out.println("Marca" + "\t" + lsnube.get(k).getMarca());
                    System.out.println("Serial" + "\t" + lsnube.get(k).getSerial() + "\n");
                }
                lsnube.clear();
                parts = null;
                parts2 = null;
            }

        }
        if (bandera == 0) {
            System.out.println("El Uid buscado no se encuentra en la lista ");
        }

    }

}
