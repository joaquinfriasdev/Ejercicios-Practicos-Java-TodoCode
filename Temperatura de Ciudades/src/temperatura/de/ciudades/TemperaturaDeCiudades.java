package temperatura.de.ciudades;

import java.util.Scanner;

public class TemperaturaDeCiudades {

 
    public static void main(String[] args) {
        
        // Declaramos los vectores
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        
        //Declaramos los Scanner
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        //Cargas los vectores
        for(int i=0; i<ciudades.length; i++){
            System.out.println("Ingrese el nombre de la ciudad " + i); 
            ciudades[i] = teclado.next();
            
            System.out.println("Ingrese la mínima de la ciudad " + i);
            minimas[i] = teclado2.nextDouble();
            
            System.out.println("Ingrese la máxima de la ciudad " + i);
            maximas[i] = teclado2.nextDouble();
            }
        
        //Declaramos variable para guardar la temperatura minima
        Double minima = 99999999.00;
        
        //Declaramos variable para guardar la posicion de la temperatura mínima
        int posMin = -1;
        
        //Determinamos la mínima
        for (int i =0; i<minimas.length; i++){
            
            if(minimas[i]<minima){
                minima = minimas[i];
                posMin = i;
                }
            }
        
        //Declaramos variable para guardar la temperatura maxima
        Double maxima = -99999999.00;
        
        //Declaramos variable para guardar la posicion de la temperatura maxima
        int posMax = -1;
        
        //Determinamos la máxima
        for (int i =0; i<maximas.length; i++){
            
            if(maximas[i]>maxima){
                maxima = maximas[i];
                posMax = i;
                }
            }
        
        // Imprimimos por pantalla los resultados
        System.out.println("La temperatura mínima es de: " + minima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMin]);
        
        System.out.println("La temperatura máxima es de: " + maxima);
        System.out.println("Se registro en la ciudad de: " + ciudades[posMax]);

        }
        
    }
    

