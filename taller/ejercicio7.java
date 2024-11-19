//Implementa un programa que recorra un array de números 
//y calcule la media, el valor mínimo y el valor máximo.
package taller;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[]args){
        int num;
    Scanner dato=new Scanner(System.in);
      System.out.println("Ingrese el tamaño de el arreglo");
      int tam=dato.nextInt();
        int[] numero=new int[tam];
    
    System.out.println("Ingrese los numeros");//guardar los números
       for(int i=0; i<numero.length; i++){
          numero[i]=dato.nextInt();
          
    }
     int max=numero[0];
        int min=numero[0];
        int suma=0;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] > max) {
                max = numero[i];
            }
            if (numero[i] < min) {
                min = numero[i];
            }
             suma=suma+numero[i];
    }
        
        double media=(double)suma/numero.length;
         System.out.println("El Valor maximo es: "+max);
         System.out.println("El valor de la Media es: "+media);
        System.out.println("El valor minimo es: "+min);
    
}
}
