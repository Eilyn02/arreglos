/*La empresa chicken little está haciendo un inventario de los productos que tiene para saber 
qué cantidades debe pedir de cada producto para abastecimiento 
se necesita saber cuántos y cuáles son los productos que maneja*/
package taller;
import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[]args){
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese el número de productos que desea");
        int cantp=dato.nextInt();
        int [] cantproductos=new int[cantp];
        String [] nomproductos=new String[cantp];
        
        for(int i=0; i<cantp; i++){
            System.out.println("Esciba el nombre del producto "+(i+1));
            nomproductos[i]=dato.next();
            
            System.out.println("Ingrese la cantidad del producto "+(i+1));
           cantproductos[i]=dato.nextInt();
            
        
        }
        
          // Mostrar los resultados
        System.out.println("Inventario:");
        for (int i = 0; i < cantp; i++) {
            System.out.println("Producto: " + nomproductos[i] + ", Cantidad: " + cantproductos[i]);
        
    }
    
}
}
