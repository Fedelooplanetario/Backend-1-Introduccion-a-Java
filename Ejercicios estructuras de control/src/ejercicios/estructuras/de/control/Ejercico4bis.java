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
 */
public class Ejercico4bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("Ingrese una frase:");
        System.out.println("==================================");
        String frase = leer.next();

        String letra = frase.substring(0,1).toUpperCase(); 

//Avion --> A - V - I - O - N
//          0   1   2   3   4 ---> Orden con SubString.
//          1   2   3   4   5 ---> Orden original.

        if (letra.equals("A")) {
            System.out.println("=================");
            System.out.println("Letra CORRECTA :).");
            System.out.println("=================");
        } else {
            System.out.println("========================");
            System.out.println("Letra INCORRECTA.");
            System.out.println("========================");
        }
        
        
        
    }
    
}
