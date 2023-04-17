/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int ran, ran2m;
        ran = (int) (Math.random() * 10);
        ran2m = (int) (Math.random() * 10);
        int suma = ran * ran2m;

        System.out.println(suma);

        Scanner leer = new Scanner(System.in);
        
        
        int respuesta;
        do {
            System.out.println("adivine el numero entre 0 y 100");
            respuesta = leer.nextInt();
            
            if(respuesta!=suma) {
                System.out.println("su respuesta no es correcta");
            }
                //   System.out.println(ran);
        }
            while (suma != respuesta);{
            
                System.out.println("su respuesta es correcta toma un chocolate");

        } 
        
        
      
    }
    
    
}
