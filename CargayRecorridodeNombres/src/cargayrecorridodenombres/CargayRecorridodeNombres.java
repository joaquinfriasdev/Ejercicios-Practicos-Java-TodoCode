
package cargayrecorridodenombres;


public class CargayRecorridodeNombres {


    public static void main(String[] args) {
        
        // Consigna
        /*
        Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa,
        Guillermo, Daniel, Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos 
        y otro recorrido para mostrar los mismos por pantalla.
        */
        
        //Declaración de un vector para 8 nombres
        String vector[] = new String[8];
        
        //Asignación manual de los valores
        vector[0] = "Alejandra";
        vector[1] = "Leonardo";
        vector[2] = "Rosa";
        vector[3] = "Guillermo";
        vector[4] = "Daniel";
        vector[5] = "Luisa";
        vector[6] = "Ludmila";
        vector[7] = "Gabriel";
        
        //recorrido
        for(int i=0; i<vector.length; i++){
            System.out.println("En la posición: " + i + " está el nombre: " + vector[i]);
        }
        
        
    }
    
}
