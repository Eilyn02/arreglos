//Escribe un programa que tome dos arrays y determine si son iguales
// Es decir, si contienen los mismos elementos en el mismo orden.
package taller;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[]args){
    Scanner dato=new Scanner(System.in);
    
    int [] numero1=new int[5];
    int [] numero2=new int[5];
    
     System.out.println("Ingrese 5 números impares: ");
        for (int i = 0; i < numero1.length; i++) {
            numero1[i] = dato.nextInt();
        }

        System.out.println("Ingrese 5 números pares:");
        for (int i = 0; i < numero2.length; i++) {
            numero2[i] = dato.nextInt();
        }
     // Comprobamos si los dos arrays son iguales
        boolean iguales = true; // Asumimos que son iguales al principio
        
        if (numero1.length != numero2.length) {
            iguales = false;  // Si no tienen la misma longitud, no son iguales
        } else {
            // Verificar cada elemento
            for (int i = 0; i < numero1.length; i++) {
                if (numero1[i] != numero2[i]) {
                    iguales = false;
                    break;
                }
            }
        }
        
        if (iguales) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays no son iguales.");
        }
    }
}
