/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario 
se vuelve a mostrar el menú.

 */
package EjGuia3;

import java.util.Scanner;

public class Ejercio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, suma, resta, multi, div, numMenu;
        System.out.println("Ingrese un numero entero positivo");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero positivo");
        num2 = leer.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        String opcion;

        do {
            System.out.println("==========================================");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("==========================================");
            System.out.println("Elija opcion:");
            
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    System.out.println("Suma= " + suma);
                    break;
                case "2":
                    System.out.println("Resta= " + resta);
                    break;
                case "3":
                    System.out.println("Multiplicacion= " + multi);
                    break;
                case "4":
                    System.out.println("4.Divisio= " + div);
                    break;
                case "5":
                    System.out.println("¿Esta seguro que desea salir (s/n)?");
                    opcion = leer.next();

                default:
                    System.out.println("Ups el numero no es valido");
                    break;
            }

        } while (!"s".equalsIgnoreCase(opcion));
        System.out.println("Gracias por calcular");

    }

}
