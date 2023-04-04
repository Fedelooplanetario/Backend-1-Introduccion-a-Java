
package ejercicios.estructuras.de.control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 * Nota: investigar la función equals() en Java. 
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;
        System.out.println("Ingrese una frase");
        frase=leer.next();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
            
        }
        else{
            System.out.println("Incorrecto");
        }    
        
    }
    
}
