package rellenarmatriz;

public class RellenarMatriz {

    
    public static void main(String[] args) {
        
    //Consigna
    /*
    Llevar a cabo un programa que permite cargar completamente con numeros 5 una matriz de 4x5.
    */
      //Declaramos la matriz
      int matriz[][] = new int[4][5];  
      
      //Rellenamos la matriz
      for(int f=0;f<4;f++){
          for(int c=0;c<5;c++){
              matriz[f][c] = 5;
          }
      }
      
        //Mostramos por pantalla
       for(int f=0;f<4;f++){
          for(int c=0;c<5;c++){
              System.out.print(matriz[f][c]);
           }
           System.out.print("\n");
        }
      
    }
    
}
