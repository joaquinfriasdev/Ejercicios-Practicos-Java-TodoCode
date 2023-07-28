
package ejerciciomaratondelinmigrante;

import java.util.Scanner;


public class EjercicioMaratonDelInmigrante {


    public static void main(String[] args) {
        
        //Pedir datos a las personas: DNI, Nombre y Edad
        //Determinar a qué categoría se tiene que inscribir
        //Informarle a la persona
        //No sabemos la cantidad de personas
        
        //Pedimos DNI
        System.out.println("Ingrese el DNI de la persona");
        Scanner teclado = new Scanner (System.in); 
        String dni = teclado.nextLine();
        
        //Pedimos nombre
        System.out.println("Ingrese el nombre de la persona");
        String nombre = teclado.nextLine();
        
        //Pedimos edad de la persona
        System.out.println("Ingrese la edad de la persona");
        Scanner teclado2 = new Scanner (System.in);
        int edad = teclado2.nextInt();
        
        
        while (!dni.equals("0") && !nombre.equalsIgnoreCase("fin") ){
            
            if (edad >= 6 && edad <= 10){
                System.out.println("La categoría es Menores A");
            }
            else{
                if(edad >= 11 && edad <= 17){
                    System.out.println("La categoría es Menores B");
                }
                else{
                    if(edad >= 18 && edad <= 30){
                        System.out.println("La categoría es Juveniles");
                    }
                    else{
                        if(edad>=31 && edad <= 50){
                            System.out.println("La categoría es Adultos");
                        }
                        else{
                            if(edad>=50){
                                System.out.println("La categoría es Adultos Mayores");
                            }
                            else {
                                System.out.println("La persona no cuenta con la edad indicada");
                            }
                        }
                    }
                }
            }
            
            
         //aca 
                 //Volver a pedir datos
        System.out.println("Ingrese el DNI de la persona");
        dni = teclado.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        nombre = teclado.nextLine();
        System.out.println("Ingrese la edad de la persona");
        edad = teclado2.nextInt();
        }
        
        
    }
    
}
