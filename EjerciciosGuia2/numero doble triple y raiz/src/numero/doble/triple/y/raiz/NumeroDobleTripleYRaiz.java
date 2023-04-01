/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
 *  el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package numero.doble.triple.y.raiz;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NumeroDobleTripleYRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        double numero = leer.nextDouble();
        System.out.println("el doble de " +numero + " es " +(numero*2));
        System.out.println("el triple de " +numero + " es " +(numero*3));
        System.out.println("la raiz cuadrada de " +numero + " es " + Math.sqrt(numero));
    }
    
}
