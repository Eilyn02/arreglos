//Escribe un programa que recorra un array de números enteros 
//y encuentre el valor máximo y el valor mínimo en él. Imprimir ambos valores.
package taller;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int[] numero = new int[5];
        
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = dato.nextInt();
        }
        int max = numero[0];
        int min = numero[0];

        // Encontrar el máximo y el mínimo
        for (int i = 1; i < numero.length; i++) {  // Empezamos desde 1 porque el primer valor ya está en max y min
            if (numero[i] > max) {
                max = numero[i];
            }
            if (numero[i] < min) {
                min = numero[i];
            }
        }

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
    }
}
