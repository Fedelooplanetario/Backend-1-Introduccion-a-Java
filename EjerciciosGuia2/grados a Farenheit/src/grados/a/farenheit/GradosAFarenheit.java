/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados.a.farenheit;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GradosAFarenheit {

    /**Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Double grados,faren;
        System.out.println("Ingrese un numero en grados centigrados para convertirlo a Farenheit");
        grados=leer.nextDouble();
        faren=32 + (9 * grados / 5);
        System.out.println("Su equivalente en Farenheit es: " + faren);
        
        
        
    }
    
}
