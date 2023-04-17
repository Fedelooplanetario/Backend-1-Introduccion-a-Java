/*
 *Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden 
ser a dólares, yenes o libras. La función tendrá como parámetros, la 
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package EjGuia4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String moneda;
        double euros;
        int opcion;
        
        System.out.println("Ingrese la cantidad de Euros a convertir");
        euros = leer.nextDouble();
         System.out.println("Eligir moneda a convertir:");
        System.out.println("1: Libras");
        System.out.println("2: Dolares");
        System.out.println("3: Yenes");
        opcion=leer.nextInt();
        
        conversorDeMonedas(euros, opcion);
          
    }

    private static void conversorDeMonedas(double euros, int opcion) {
        switch (opcion){
            case 1:
                System.out.println("Libras"+euros*0.86);
                break;
            case 2:
                System.out.println("Dolares"+euros*1.28611);
                break;
                
            case 3:
                System.out.println("Yenes"+euros*129.852);
                break;
                
            default:
                System.out.println("La opcion ingresada es incorecta");
        
        
        
        
        }
        
        
        
    }
    
}
