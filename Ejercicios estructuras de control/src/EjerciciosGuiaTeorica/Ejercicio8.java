/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está 
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package EjerciciosGuiaTeorica;

import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        
        System.out.println("Ingrese una nota entre 0 y 10");
        num = leer.nextInt();
        
        while (num < 0 || num > 10){
            System.out.println("La nota es incorrecta, ingrese nuevamente");
        
        num = leer.nextInt();

        }
        
        System.out.println("Nota correcta");
        
    }
    
}
