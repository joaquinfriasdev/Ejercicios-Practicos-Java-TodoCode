
package ejercicioingresopalabrascentinela;

import java.util.Scanner;


public class EjercicioIngresoPalabrasCentinela {


    public static void main(String[] args) {
        
        //Sabemos que es un bucle
        //Sabemos la condición de salida
        //Sabemos que estructura usa
        
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner (System.in);
        String palabra = teclado.next();
        
        while (!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese otra palabra");
            palabra = teclado.next();
        }
                   
    }
    
}
