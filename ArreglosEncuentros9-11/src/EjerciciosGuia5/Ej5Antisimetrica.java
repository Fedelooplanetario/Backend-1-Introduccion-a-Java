/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).

 */
package EjerciciosGuia5;

/**
 *
 * @author Usuario
 */
public class Ej5Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int[][] matriz = {{0,-2,5 }, {2, 0, 2},{-4,-2,0}};
           
        
        boolean esAntisimetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz [i].length; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }
        
        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
        
        System.out.println("====================[Matriz]====================");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[j] + " ]");
            }
            System.out.println();
        }
        System.out.println("================================================");
    
      
        int [] [] matrizTranspuesta = new int[3][3];
         

        for (int i = 0; i < matrizTranspuesta.length; i++) {
            for (int j = 0; j < matrizTranspuesta[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("====================[Matriz transpuesta]====================");

        for (int[] matriz1 : matrizTranspuesta) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("[ " + matriz1[j] + " ]");
            }
            System.out.println();
        }
        System.out.println("================================================");
    }
}
        
        
        
    
    

