/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde
se encuentra el numero y si se encuentra repetido

 */
package EjerciciosGuia5;

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
        int tama, numing, cont;
        cont=0;
       System.out.println("Ingrese el tamaño del vector");
        Scanner leer=new Scanner (System.in);
        tama=leer.nextInt();
        int[] vector = new int [tama];
        for(int i = 0; i<tama; i++){
            vector[i] =(int) (Math.random()*tama);
        }
         System.out.println(" ");
         for(int elemento:vector){
          System.out.println(" " + elemento + " "); 
        }
         System.out.println("ingrese el numero a buscar en el vector");
               numing=leer.nextInt();
         for(int i = 0; i<tama; i++){
            if(numing==vector[i]){
                System.out.println("el numero ingresado esta en la posicion " + i);
                cont=1+cont;
            }
        }
         if(cont>1){
              System.out.println("el numero se repitio " + cont + "veces");
         }
        for(int elemento:vector){
          System.out.println(" " + elemento + " "); 
        }
    }
    }
    

