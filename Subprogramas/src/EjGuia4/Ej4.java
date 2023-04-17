/*
 * Crea una aplicación que nos pida un número por teclado y con una 
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.


 */
package EjGuia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        
        
        System.out.println("Ingrese un numero para verificar si es primo:");
        numero=leer.nextInt();
        
        boolean verificaPrimo= esPrimo (numero);
        System.out.println("" + verificaPrimo);
        
        
        
    }

    public static boolean esPrimo(int numero) {
        int contador=0;
        for (int i = 2; i < numero; i++) {
            
            if (numero%i==0) {
                contador++;
                 
            }
            
        }
        
       return (contador==0) && (numero!=1);
        
    }

   
    
}
