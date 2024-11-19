//Escribe un programa que busque un número específico en un array 
//y devuelva el índice de la primera aparición de ese número. Si no se encuentra debe mostrar un mensaje
package taller;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[]args){
     Scanner dato=new Scanner(System.in);
     int tam, num;
     int datoB;
     boolean encon = false;
     
        System.out.println("Ingresar tamaño del arreglo");//tamaño del arreglo por el usuario
        tam=dato.nextInt();
       int [] numeros=new int[tam];
       
       System.out.println("Ingrese los numeros");//guardar los números
       for(int i=0; i<numeros.length; i++){
          num=dato.nextInt();
          numeros[i]=num;
    }
        System.out.println("Ingrese el dato que quiere Buscar");
        datoB=dato.nextInt();
         for(int i=0; i<numeros.length; i++){
          if (datoB == numeros[i]) {
        System.out.println("Dato " + datoB + " en posición " + i);
        encon= true; // Marcar que el dato ha sido encontrado
        break; // Terminar el ciclo una vez que se encuentra el dato
    }
         }
       // Si el dato no fue encontrado, imprimir un solo mensaje
if (!encon) {
    System.out.println("Dato no encontrado");
}  
         
         
}
}