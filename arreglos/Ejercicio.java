
package arreglos;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[]args){
    int n=8;
    Scanner dato=new Scanner(System.in);
    
    int[] numeros=new int[6];
    
     System.out.println("Digite un número entero positivo");
     if(n<0){
         System.out.println("No se aceptan estos números");
     }
       for(int i=0 ; i<6; i++ ){
        n=dato.nextInt(); //line-String
        numeros[i]=n;
        }
     
        for(int i=0 ; i<6; i++ ){
            System.out.println("el nombre es: "+numeros[i]);
        }
     
    }
}
