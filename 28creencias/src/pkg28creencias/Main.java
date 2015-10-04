
package pkg28creencias;

import javax.swing.JOptionPane;
import java.lang.Error;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import static javax.swing.JOptionPane.YES_OPTION;

public class Main {
    
    public static Icon Dios;
    public static Icon Padre;
    public static Icon familia;
    public static Icon Error;
    public static Icon Visto;
    public static Icon Falta;
    public static Icon Exclamacion;
    public static void main(String[] args) {
    Icon Dios;
    Icon Padre;
    Icon familia;
    Icon Visto;
    Icon Falta;
    Icon Exclamacion;
       Dios = new ImageIcon ("src/Imagen/Dios.Jpg");
      Padre = new ImageIcon ("src/Imagen/iconopadre.png");
      familia = new ImageIcon ("src/Imagen/familia.Jpg");
      Visto = new ImageIcon ("src/Imagen/visto.png");
      Falta = new ImageIcon ("src/Imagen/falta.png");
      Exclamacion = new ImageIcon ("src/Imagen/exclamation.png");
int i,rcorrectas=0,rincorrectas=0;

int op = JOptionPane.showConfirmDialog(null,"<html><h1 style=\"color:Fuchsia\" >  ********BIENVENIDO*******.</h1></html>"+ "  \n"  + 
                                   "<html><h3 style=\"color:Navy\" >Se Realizara Algunas Preguntas Para Medir Su Conocimiento sobre: </h3></html>" + "  \n"  + 
                                   "<html><h3 style=\"color:Navy\" >---LAS 28 CREENCIAS FUNDAMENTALES DE LA RELIGION ADVENTISTA---  </h3></html> \n "+    "  \n"  +               
                                   "<html><h2 style=\"color:Navy\" > ¿Desea Continuar? </h3></html> \n " + "  \n"   ,"BIENVENIDOS",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION,Dios);


if(op == YES_OPTION){
String preguntas [] = new String [30];
preguntas [0] = "01) " + "¿Las Sagradas escrituras o la Biblia es la palabra de Dios?\n" ;
preguntas [1] = "02) " + "¿La iglesia adventista cree que hay un sólo Dios: Padre, Hijo\n"+
                    " y Espíritu Santo, una unidad de tres Personas coeterna (Trinidad)?\n";
preguntas [2] = "03) " + "¿Dios Padre es creador pero no sustentador ¿Es esto cierto?\n";
preguntas [3] = "04) " + "¿Jesucristo es un ser creado?\n";
preguntas [4] = "05) " + "¿Dios, el Espíritu Santo, desempeñó una parte activa con el \n"+
                         "Padre y el Hijo en la Creación, Encarnación y Redención. \n"+
                         "¿es verdad que también inspiro a los escritores de las sagradas escrituras?\n";
preguntas [5] = "06) " + "¿Dios es el Creador de todas las cosas y reveló en las Escrituras \n"+
                         "el relato auténtico de Su actividad creadora ¿él descanso el séptimo \n"+
                         "día porque estaba cansado??\n";
preguntas [6] = "07) " + "¿El hombre fue creado a imagen y semejanza de los ángeles?\n";
preguntas [7] = "08) " + "¿Cuando nuestros primeros padres desobedecieron a Dios, negaron \n"+
                          "su dependencia de Él y cayeron de su elevada posición abajo de Dios.\n"+
                          " La imagen de Dios en ellos, fue desfigurada, se volvieron mortales.\n"+
                          " ¿esto es cierto??";
preguntas [8] = "09) " + "¿Toda la humanidad está involucrada en un gran conflicto entre Cristo y Satanás,\n"+
                         " en cuanto al carácter de Dios, Su Ley y Su soberanía sobre el Universo. \n" +
                           "¿Este conflicto actualmente está centrado en la tierra??\n";
preguntas [9] = "10 " + "¿La salvación y la expiación de los pecados solo es posible atreves de las obras, \n"+
                          "los sacrificios y las penitencias. ¿Esto es cierto?  ?\n";
preguntas [10] = "11) " + "¿Por medio de Cristo somos justificados y libertados del dominio del pecado?\n";
preguntas [11] = "12) " + "¿Quién nos guía para reconocer nuestra pecaminosidad y arrepentirnos es el pastor \n "+
                          "de la iglesia?";
preguntas [12] = "13 " + "¿Nosotros mismos podemos lograr la victoria sobre las fuerzas del mal que aún tratan\n"+
                         " de dominarnos?";
preguntas [13] = "14) " + "¿La iglesia más que una congregación ¿es el Cuerpo de Cristo??\n";
preguntas [14] = "15) " + "¿El pueblo remanente debe esconder el mensaje de la segunda venida hasta que Cristo vuelva?\n";
preguntas [15] = "16) " + "¿La Iglesia es un cuerpo con muchos miembros, llamados de toda nación, tribu, lengua y pueblo.\n"+
                          " Todos somos iguales en Cristo. ¿es verdad que todos somos considerados hijos de Dios?\n";
preguntas [16] = "17) " + "¿Jesús nos dio ejemplo para el bautismo?";
preguntas [17] = "18) " + "¿La ceremonia del lavamiento de los pies es solo una formalidad para estar limpios para la cena del Señor?\n";
preguntas [18] = "19) " + "¿Los dones a la iglesia son dados por medio del espíritu santo?";
preguntas [19] = "20) " + "¿La iglesia adventista considera a la hermana Ellen G. de White como la mensajera de Dios ¿esto es cierto??\n";
preguntas [20] = "21) " + "¿Los diez mandamientos eran solo para los judíos?";
preguntas [21] = "22) " + "¿El sábado fue establecido des de la creación?";
preguntas [22] = "23) " + "¿Debemos dar cuentas a Dios por el uso apropiado del tiempo y de las oportunidades, capacidades y posesiones,\n"+
                          " y de las bendiciones de la Tierra y sus recursos que Él colocó bajo nuestro cuidado?\n";
preguntas [23] = "24) " + "¿por ser el pueblo de Dios tenemos el derecho de juzgar y menospreciar a los “pecadores”?\n";
preguntas [24] = "25) " + "¿El matrimonio es una institución establecida por el mismo Dios?\n";
preguntas [25] = "26) " + "¿Es Jesús nuestro sumo sacerdote e intercesor en el santuario celestial?\n";
preguntas [26] = "27) " + "¿La segunda venida de cristo será un suceso oculto (rapto secreto) que pocos podrán presenciar\n";
preguntas [27] = "28) " + "¿Las personas al morir van directamente al cielo (si fueron buenos en vida)?\n";
preguntas [28] = "29) " + "¿Después de la segunda venida habrá un periodo de mil años, durante este tiempo serán juzgados los impíos\n"+
                          " muertos?";
preguntas [29] = "30) " + "¿Al final del milenio será creado una nueva tierra?\n";


int RrC [] = {1,1,0,0,1,0,0,1,1,0,1,0,0,1,0,1,1,0,1,1,0,1,1,0,1,1,0,0,1,1};
for(i=0; i<=29;i++){
int respuesta =JOptionPane.showConfirmDialog(null, preguntas[i],"Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,familia);
 if(respuesta == RrC[i]){
		rincorrectas = rincorrectas + 1;
		}
         else
                rcorrectas = rcorrectas + 1;
}
int rcorrecta = (rcorrectas)*40;
{JOptionPane.showMessageDialog(null, "Su puntaje e:  " +rcorrecta+"/1200");
if (rcorrectas==1200)  { 
JOptionPane.showMessageDialog(null, "Felicidtaciones Usted Tiene Un Puntaje maximo ","",JOptionPane.PLAIN_MESSAGE,Visto);
}else{
if ((rcorrectas<1200)&& (rcorrectas>=800)) {
JOptionPane.showMessageDialog(null, " Muy Bien, Pero Esfuersate Un Poco Mas ","",JOptionPane.PLAIN_MESSAGE,Falta );
}else{
JOptionPane.showMessageDialog(null, " Debes Esforzarte Mas ","",JOptionPane.PLAIN_MESSAGE,Exclamacion );
} 
}  }

String[] options = {"<html><h3> Salir", "<html><h3> Reintentar"};
int seleccion = JOptionPane.showOptionDialog(null, " Que Desea Hacer \n", "", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION,Padre,options, options[0]);
if(seleccion== JOptionPane.YES_OPTION){
    System.exit(0);
    }else
    Main.main(null);
   
    }else{
    System.exit(0);
}
    
    
}
  
        
    
        }
  
