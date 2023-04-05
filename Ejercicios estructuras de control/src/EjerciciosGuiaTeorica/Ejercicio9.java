/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.

 */
package EjerciciosGuiaTeorica;

import java.util.Scanner;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num,cont,suma;
        suma=0;
        cont=0;
                
        
       
       do{
           System.out.println("Ingrese un numero.");
            num = leer.nextInt();
            cont = cont+1;
            if(num>0){
            suma = suma+num;
            }
       }while(num!=0 && cont != 2);
       
       if (num==0){
        System.out.println("Se capturó el numero cero");
       }
      
        System.out.println("La suma de los numero ingresados es: "+suma);
       
        
    
        
    }
    
}
