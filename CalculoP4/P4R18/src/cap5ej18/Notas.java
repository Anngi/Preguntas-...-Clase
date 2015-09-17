
package cap5ej18;


public class Notas {
    
     double notM1 , notM2 , notM3 , notM4 , promC , numC1 , numC2 , numC3 , numC4 , numE , NcC;
     
     double promedio_estudiante(double numC1 ,double numC2 ,double numC3 ,double numC4,double notM1 , double notM2 ,double notM3 , double notM4)
     {
         
          NcC = numC1 + numC2 + numC3 + numC4;
           promC = (notM1 * numC1 + notM2 * numC2 + notM3 * numC3 + notM4 * numC4) / NcC;
           return promC;
     }
}
