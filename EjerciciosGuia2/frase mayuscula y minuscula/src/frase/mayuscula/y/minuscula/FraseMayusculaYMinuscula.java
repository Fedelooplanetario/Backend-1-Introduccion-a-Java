/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase.mayuscula.y.minuscula;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class FraseMayusculaYMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String minus = frase.toLowerCase();
        String mayus = frase.toUpperCase();
        
        System.out.println(""+minus);
        System.out.println(""+mayus);
        
    }
    
}
