
package ejerciciovectoryfor;

import java.util.Scanner;


public class EjercicioVectoryFor {


    public static void main(String[] args) {
        
        //Consigna del ejercicio
        /*
        Realizar un programa que permita cargar 15 números en un vector. Una vez cargados,
        se necesita que el programa cuente e informe por pantalla cuántas veces 
        se cargó el número 3
        */
        
        //Declarar vector
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        //Cargar Vector
        for (int i = 0; i<15; i++){
            System.out.println("Ingrese un numero");
            vector[i] = teclado.nextInt();
            
        }
        
        //Recorrer y contar cuantos numeros 3 hay
        int cont = 0;
        for (int i = 0; i<15; i++){
            if(vector[i] == 3){
            cont = cont + 1;
            }
        }
        
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
    }
    
}
