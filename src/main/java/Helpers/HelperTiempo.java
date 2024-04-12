/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

/**
 *
 * @author perfil
 */
public class HelperTiempo {

    public static void RetornarTiempo(long fin, long inicio) {
        double tiempo = (double) (fin - inicio);
        System.out.println("Tiempo en segundos" + tiempo);
        System.out.println("El tiempo que se demoro fue" + ":" + "\t" + "En segundos");

    }
}
