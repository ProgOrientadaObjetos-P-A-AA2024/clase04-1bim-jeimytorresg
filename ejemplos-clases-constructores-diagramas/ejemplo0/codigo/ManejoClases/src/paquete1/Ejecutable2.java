/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author utpl
 */
public class Ejecutable2 {
    public static void main(String[] args){
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("R1");
        System.out.printf("%s - %f", personal.obtenerTipoProcesador(), 
                personal.obtenerMemoria());
        
    }
}
