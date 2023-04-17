/*
 * Diseñe una función que pida el nombre y la edad
de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o
menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando
personas y frenar cuando el usuario ingrese la palabra “No”.

 */
package EjGuia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String nombre, confirma;
        int edad;
        boolean siNo;
        
        
        do{
            
        System.out.println("Ingrese un nombre.");
        nombre = leer.next();
        System.out.println("Ingrese edad.");
        edad=leer.nextInt();
        
        imprimirNombre(nombre); 
        
        if(verificaEdad(edad)){
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
            System.out.println("Desea continuar? Si/No");
            confirma = leer.next();
            
            if(confirma.equalsIgnoreCase("No")){
                
                siNo=false;
            }
                
        }while (siNo=true);
        

    }
    public static void imprimirNombre(String nombre){
        System.out.println("" + nombre);
    }
    
    public static boolean verificaEdad(int edad){
    
        return (edad>=18);
    }

    
    
}
