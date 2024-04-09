/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.util.ArrayList;

/**
 *
 * @author perfil
 */
public class HelperValidacion {

    public static int RetornarValor(String Nombre) {
        int numero = 0;
        int letra = 0;

        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isDigit(Nombre.charAt(j));
            if (flag) {
                //System.out.println("'"+ Nombre.charAt(j)+"' is a number");
                numero++;
            } else {
                //System.out.println("'"+ Nombre.charAt(j)+"' is a letter");
                letra++;
            }

        }
        return numero;
    }

    public static int RetornarCEV2(String Nombre) {
        int ce = 0;

        ArrayList<Character> lscaracteres = new ArrayList<>();

        lscaracteres.add('@');
        lscaracteres.add('~');
        lscaracteres.add('/');
        lscaracteres.add(';');
        lscaracteres.add(':');
        lscaracteres.add('"');
        lscaracteres.add('!');

        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isLetter(Nombre.charAt(j));
            if (!flag) {
                for (int i = 0; i < lscaracteres.size(); i++) {

                    if (lscaracteres.get(i).compareTo(Nombre.charAt(j)) == 0) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }

    public static int ValidarVacio(String cadena) {
        if (cadena.equals("")) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int RetornarLetra(String Nombre) {
        int numero = 0;
        int letra = 0;

        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isDigit(Nombre.charAt(j));
            if (flag) {
                //System.out.println("'"+ Nombre.charAt(j)+"' is a number");
                numero++;
            } else {
                //System.out.println("'"+ Nombre.charAt(j)+"' is a letter");
                letra++;
            }

        }
        return letra;
    }

    public static int ValidarCantidadRango(int cantidad) {
        if (cantidad > 0 && cantidad < 1000) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int ValidarTodo(String Cadena) {
        int conteo = ValidarVacio(Cadena) + RetornarValor(Cadena) + RetornarCEV2(Cadena);
        return conteo;
        
    }
    public static int RetornarCEV2Contraseña(String Contraseña) {
        int ce = 0;

        ArrayList<Character> lscaracteres = new ArrayList<>();

        lscaracteres.add('@');
        lscaracteres.add('~');
        lscaracteres.add('/');
        lscaracteres.add(';');
        lscaracteres.add(':');
        lscaracteres.add('"');
        lscaracteres.add('!');

        for (int j = 0; j < Contraseña.length(); j++) {
            boolean flag = Character.isLetter(Contraseña.charAt(j));
            if (!flag) {
                for (int i = 0; i < lscaracteres.size(); i++) {

                    if (lscaracteres.get(i).compareTo(Contraseña.charAt(j)) == 0) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }
    public static int ValidarTodoContraseña(String cadena)
{
int conteo=ValidarVacio(cadena)+RetornarCEV2Contraseña(cadena);
return conteo;
}
    
}
