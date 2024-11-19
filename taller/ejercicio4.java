//Implementa un método que rote los elementos de un array hacia la derecha una posición.
//Por ejemplo, el array {1, 2, 3, 4, 5} se convertirá en {5, 1, 2, 3, 4}
package taller;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
    Scanner dato=new Scanner(System.in);
    int num, tama;
    
        System.out.println("Ingrese la cantidad de números que necesite guardar");
         tama=dato.nextInt();
          // Verificar si el tamaño del array es válido
         if (tama <= 0) {
            System.out.println("El tamaño del array debe ser mayor a 0.");
            return; // Salir del programa si el tamaño no es válido
        }
    
   int[] numeros=new int [tama];
    
    for(int i=0; i<numeros.length; i++){
        System.out.println("Ingrese el número "+(i+1));
        num=dato.nextInt();
        numeros[i]=num;
    
    }
        System.out.println("Posición inicial");
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        
        }
    int cam=numeros[numeros.length - 1]; //guardar ultimo elemento
    for(int i=numeros.length - 1; i>0; i--){
        numeros[i]=numeros[i-1];//para que avanze una posición
    }
    numeros[0]=cam;//pasarlo a la primera posición
    
    System.out.println("Posición final despues del cambio");
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        
        }
 
    }
}
