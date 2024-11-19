
package arreglos;
import java.util.Scanner;
public class Arreglos {
    public static void main(String[] args) {
                String n;
        Scanner teclado=new Scanner(System.in); //hace parte de la manera por teclado
        String[]nombres=new String[3];
        // de forma manual
       /*nombres[0]="Carolina";
        nombres[1]="Eilyn";
        nombres[2]="Nicoll";
        for(int i=0 ; i<3; i++ ){
           System.out.println("el nombre es: "+nombres[i]);
        }*/
       //por teclado
        System.out.println("Digite un nombre");
       for(int i=0 ; i<3; i++ ){
        n=teclado.next(); //line-String
        nombres[i]=n;
        }
        for(int i=0 ; i<3; i++ ){
            System.out.println("el nombre es: "+nombres[i]);
        }
 
    }
    
}
