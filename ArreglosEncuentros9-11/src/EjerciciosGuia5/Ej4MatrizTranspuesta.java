/*
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosGuia5;

/**
 *
 * @author Usuario
 */
public class Ej4MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] Matrix = new int[4][4];
        int[][] TransMatrix = new int[4][4];
//en este bucle llenamos la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("====================[Matriz]====================");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("================================================");
   //matriz transpuesta.
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                TransMatrix[j][i] = Matrix[i][j];
            }
        }  
   //imprimimos la transpuesta
           System.out.println("====================[Matriz Transpuesta]====================");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(TransMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
