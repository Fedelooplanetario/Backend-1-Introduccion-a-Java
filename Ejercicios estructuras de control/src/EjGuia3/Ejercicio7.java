/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package EjGuia3;

import java.util.Scanner;

public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       
        String frase ;
        int cont1=0;
        int cont2=0;
        do {   
             System.out.println("Ingrese una frase: ");
            frase = leer.next();
            if (frase.length()<=5 && "x".equals(frase.substring(0,1)) && "o".equals(frase.substring(frase.length()-1))) {
              cont1++;
               
               
            }else{
             cont2++;   
                
            }
            
        } while (!"&&&&&".equals(frase));
        System.out.println("la cantidad de cadenas correctas es : " + cont1 + " la cantidad de cadenas incorrectas es : " + (cont2-1));  
         
        
    }

}
