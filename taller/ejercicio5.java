//Escribe un programa que sume todos los elementos pares de un array
//y todos los elementos impares. Imprime ambas sumas.
package taller;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args){
     Scanner dato=new Scanner(System.in);
     int tam, num;
     int sumai=0, sumap=0;
     
        System.out.println("Ingresar tamaño del arreglo");//tamaño del arreglo por el usuario
        tam=dato.nextInt();
       int [] numeros=new int[tam];
       
       System.out.println("Ingrese los numeros");//guardar los números
       for(int i=0; i<numeros.length; i++){
          num=dato.nextInt();
          numeros[i]=num;
          
          
       }
       
    for(int i=0; i<numeros.length; i++){
    if((numeros[i]%2)==0){
        sumap=sumap+numeros[i];
    }else{
        sumai=sumai+numeros[i];
    }
   /* if((numeros[i]%2)!=0){
    sumai=sumai+numeros[i];
    }*/
    }
    
        System.out.println("La suma de los numeros pares es: "+sumap);
        System.out.println("La suma de los numeros impares es: "+sumai);
    }
}
