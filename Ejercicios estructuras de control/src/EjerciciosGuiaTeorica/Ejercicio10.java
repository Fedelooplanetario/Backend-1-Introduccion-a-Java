/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor
 */
package EjerciciosGuiaTeorica;

import java.util.Scanner;


public class Ejercicio10 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        
        for (int i = 0; i < 4; i++) {
            do{
    	System.out.println("Ingrese un numero del 1 al 20: ");
        num= leer.nextInt();
            }
            while(num < 1 || num > 20);
            
            
            System.out.println("=======================================");
            
            System.out.print(num);
            for (int j = 0; j < num; j++){
                System.out.print(" * ");
                
                
            }
         System.out.println("");
         
            System.out.println("=======================================");

    	}

     
       
        
        
    }
    
}
