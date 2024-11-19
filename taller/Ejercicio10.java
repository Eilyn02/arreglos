
package taller;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[]args){
    Scanner dato=new Scanner(System.in);
    
    
        System.out.println("Ingrese la cantida de personas que insibira");
       int cant=dato.nextInt();
   String [] nomA=new String[cant];
   int [] edad=new int[cant];
   int [] cedula=new int[cant];
   String[] sexo=new String[cant];
   
   for(int i=0; i<cant; i++){
       System.out.println("Escriba su Nombre y apellido: "+(i+1));
       nomA[i]=dato.next();
       
       System.out.println("Escriba su Cedula: "+(i+1));
       cedula[i]=dato.nextInt();
       
         System.out.println("Escriba su Edad: "+(i+1));
       edad[i]=dato.nextInt();
       
       System.out.println("Escriba su sexo: "+(i+1));
       sexo[i]=dato.next();
   
   
   }
    
    }
}
