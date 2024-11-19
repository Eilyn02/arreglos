//Crea un método que tome un array de números enteros 
//y lo ordene en orden ascendente sin utilizar métodos predefinidos
package taller;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[]args){
    Scanner dato=new Scanner(System.in);
    int num, aux;
        System.out.println("¿cuantos números te gustaria ingresar?");
        int tama=dato.nextInt();
        
        int array[]=new int[tama];
        //guardar arreglo
        for(int i=0; i<array.length; i++){
            System.out.println("Ingrese el número "+(i+1));
            num=dato.nextInt();
            array[i]=num;
        
        }
 
        //imprimir arreglo
        
        System.out.println("Números en desorden");
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        
        for(int i=0; i<(array.length-1); i++){ 
            for(int j=0; j<(array.length-1); j++){
             if(array[j]>array[j+1]){
                 
                aux=array[j]; //guardar la variable para poder  intercambiar
                array[j]=array[j+1]; //intercambio
                array[j+1]=aux; 
             }
            }
        }
         System.out.println("Números ordenados");
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
