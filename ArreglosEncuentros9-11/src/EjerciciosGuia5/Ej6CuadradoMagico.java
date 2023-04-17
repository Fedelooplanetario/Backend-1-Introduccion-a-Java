/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos
son correctos, es decir, están entre el 1 y el 9.

 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej6CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matriz = new int[3][3]; //{{2,7,6},{9,5,1},{4,3,8}};
        int numMagico = 0;
        int suma = 0;
        boolean bandera1, bandera2, bandera3, bandera4 = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero, entre el 1 y el 9 para la posición " + "(" + i + ")" + ";" + "(" + j + ")");
                    matriz[i][j] = leer.nextInt();
                } while ((matriz[i][j] < 0) || (matriz[i][j] > 10));

                //comprobar suma y num magico
                // suma filas
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz.length; l++) {
                        if (k == 0) {

                            numMagico = numMagico + matriz[k][l];

                        }

                    }
                }

            }

        }

    }

}
