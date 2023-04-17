/*
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres
de tus compañeros de equipo


 */
package arreglosencuentros9.pkg11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej13Guia5Toerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] Equipo = new String[5];
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingresa los nombre de los interantes del equipo");
            Equipo [i]= leer.next(); 
            
        }
      
        for (int i = 0; i < 5; i++) {
            System.out.println(Equipo [i]);
            
        }
        System.out.println(" ");
    }
    
}
