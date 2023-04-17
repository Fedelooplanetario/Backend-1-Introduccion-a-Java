/*
 *Construya un programa que lea 5 palabras, de mínimo 3 y hasta 5 caracteres y,
a medida que el usuario las va ingresando, construya una “sopa de letras para
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez concluida 
la ubicación de las palabras, rellene los espacios no utilizados con un número 
aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random().
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej6SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String sopa[][] = new String[20][20];
        String vector[] = new String[5];
        //String vector[] = new String[20];
        String palabra;
        //palabra = "h";
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            // aleatorio = random.nextInt(20);
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
            } while (palabra.length() > 5 || palabra.length() < 3);
            
            llenaSopa(vector, sopa);
        }

        imprimeSopa(sopa);

    }

    public static boolean largoPalabra(String palabra) {

        return ((palabra.length() < 3) || (palabra.length() > 5));
        //(palabra.length() > 5 || palabra.length() < 3)
    }

    public static String DescomponePalabra(String palabra) {
        String vector[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {

            vector[i] = palabra.substring(i);

        }
        return vector[palabra.length()];
    }

    public static String llenaSopa(String palabra, String sopa[][]) {

        for (int i = 0; i < 20; i++) {
            for (int j =0; j < 20; j++) {

                sopa[i][j] = vector[i];

            }
        }

        return sopa[20][20];
    }

    public static void imprimeSopa(String sopa[][]) {

        System.out.println("====================[SOPA LOCA]====================");

        for (String[] matriz1 : sopa) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[j] + " ]");
            }
            System.out.println();
        }
        System.out.println("================================================");

    }

}
