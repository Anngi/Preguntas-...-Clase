
package cap5ej18;

import java.util.Scanner;

public class Cap5Ej18 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana ver = new Ventana();
        ver.setVisible(true);
        Scanner teclado = new Scanner(System.in);
        
        int i , codg ;
        double notM1 , notM2 , notM3 , notM4 , promC , numC1 , numC2 , numC3 , numC4 , numE , NcC;
        
        System.out.println("Numero de estudiantes");
        numE = teclado.nextInt();
        
        for(i=1 ; i<=numE ; i++){
            System.out.println("Codigo del estudiante");
        codg = teclado.nextInt();
        System.out.println("Nota materia 1");
        notM1 = teclado.nextDouble();
        System.out.println("Numeros de Creditos  materia 1");
        numC1 = teclado.nextInt();
        System.out.println("Nota materia 2");
        notM2 = teclado.nextDouble();
        System.out.println("Numeros de Creditos  materia 2");
        numC2 = teclado.nextInt();
        System.out.println("Nota materia 3");
        notM3 = teclado.nextDouble();
        System.out.println("Numeros de Creditos  materia 3");
        numC3 = teclado.nextInt();
        System.out.println("Nota materia 4");
        notM4 = teclado.nextDouble();
        System.out.println("Numeros de Creditos  materia 4");
        numC4 = teclado.nextInt();
        NcC = numC1 + numC2 + numC3 + numC4;
        promC = (notM1 * numC1 + notM2 * numC2 + notM3 * numC3 + notM4 * numC4) / NcC;
        System.out.println("Promedio de Creditos  cursados es: "+ promC);
        }
    }
    
}
