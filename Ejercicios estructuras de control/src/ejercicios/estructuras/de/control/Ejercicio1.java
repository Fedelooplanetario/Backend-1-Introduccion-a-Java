/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 *Crear un programa que dado un número determine si es par o impar.
 * 
 */



public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Ingrese un numero para verificar si es par o impar.");
        num = leer.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par.");
            
        }
        else{
            System.out.println("El numero es impar.");
        }
        
        
        
        
    }
    
}
