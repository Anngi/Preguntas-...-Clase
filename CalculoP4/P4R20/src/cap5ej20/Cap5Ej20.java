
package cap5ej20;

import java.util.Scanner;

public class Cap5Ej20 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tcl = new Scanner(System.in);
         int codA , canA ; 
         double precA , valTa , valT; 
         valT = 0 ; 
         System.out.print("Codigo del articulo: ");
         codA = tcl.nextInt();
        
       
        while(codA > 0)
        {
         System.out.print("Cantidad: ");
         canA = tcl.nextInt();
         System.out.print("precio Articulo: ");
         precA = tcl.nextDouble();
         valTa =  canA * precA;
         valT = valT + valTa;
         System.out.println("Codigo articulo: "+codA );
         System.out.println("cantidad: "+canA );
         System.out.println("Precio: "+precA );
         System.out.println("Valor total por articulo: "+valTa );
         System.out.println("  " );
         System.out.print("Codigo del articulo: ");
         codA = tcl.nextInt();
        }
         System.out.println("Valor total de la compra: "+valT );
        
        
    }
    
}
