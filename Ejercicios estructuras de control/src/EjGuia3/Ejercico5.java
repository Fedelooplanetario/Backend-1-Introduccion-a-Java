/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjGuia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercico5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a 
     * continuación solicite números al usuario hasta que la suma de los números 
     * introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int limit, num,suma;
        System.out.println("Ingrese un valor limite positivo");
        limit=leer.nextInt();
        suma=0;
        
        do {
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            suma+=num;
            
            
        } while (suma < limit);
        
        System.out.println("La suma de los numeros es: " +suma +" y supero el limite de: " +limit );
        
     
    }
    
}
