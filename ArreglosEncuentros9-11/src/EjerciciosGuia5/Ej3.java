/*
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package EjerciciosGuia5;

/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        int cont5 = 0;
        int cont4 = 0;
        int cont3 = 0;
        int cont2 = 0;
        int cont1 = 0;
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * 10) * (int) (Math.random() * 10000);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(vector[i]);

            if ((vector[i] < 100000) && (vector[i] > 9999)) {
                cont5++;
            }
            if ((vector[i] < 10000) && (vector[i] > 999)) {
                cont4++;
            }
            if ((vector[i] < 1000) && (vector[i] > 99)) {
                cont3++;

            }
            if ((vector[i] < 100) && (vector[i] > 9)) {
                cont2++;

            }
            if ((vector[i] < 10) && (vector[i] > -1)) {
                cont1++;

            }
        }
        
        System.out.println("En el vector se encuentran:");
        System.out.println( cont1+ " numeros de 1 cifras");
        System.out.println( cont2+ " numeros de 2 cifras");
        System.out.println( cont3+ " numeros de 3 cifras");
        System.out.println( cont4+ " numeros de 4 cifras");
        System.out.println( cont5+ " numeros de 5 cifra");
        
        
    }
}
