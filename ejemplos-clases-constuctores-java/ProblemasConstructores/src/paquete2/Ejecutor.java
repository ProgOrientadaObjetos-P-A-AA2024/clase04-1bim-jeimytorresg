/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hospital: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese el numero de doctores: ");
        int numDoc= sc.nextInt();
        System.out.println("Ingrese el numero de enfermeros: ");
        int numEnf = sc.nextInt();
        
        Hospital hospital = new Hospital(nombre, ciudad, numDoc, numEnf);
        
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);
        
        h1.establecerNombre("Hospital Militar Privado");
        
        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);
        
        System.out.printf("%s\n", h1);
        System.out.println("---------------------------------------------");
        System.out.printf("%s\n", h2);
        System.out.println("---------------------------------------------");
        System.out.printf("%s\n%s\n%d\n%d\n", hospital.obtenerNombre(),
                hospital.obtenerCiudad(), hospital.obtenerNumeroDoctores(),
                hospital.obtenerNumeroEnfermeros());
    }
}
