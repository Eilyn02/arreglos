
package arreglos;
import java.util.Scanner;
public class ejerciciopractica {
        public static void main(String[] args) {
     Scanner dato=new Scanner(System.in);
     int mayor=0, menor=0;
     int[]numeros=new int[11];
      for(int i=0+1 ; i<11; i++ ){
          System.out.println("ingrese el número "+i+"a evaluar: ");
          numeros[i]=dato.nextInt();
      }
      for(int i=1; i<numeros.length; i++){ //LENGTH( ) cuenta el número de caracteres de una cadena, incluidos todos los espacios y devuelve el número.
          if(mayor<numeros[i]){
              mayor=numeros[i];
          } menor=mayor;
          
      }
    }   
}
