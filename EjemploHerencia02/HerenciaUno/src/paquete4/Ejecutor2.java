/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author PC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        String nombre = "Carolina";
        String apellido = "Alvarado";
        String id = "1105716939";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
        apellido, id, edad);
        
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.establecerCostoCredito(30);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
