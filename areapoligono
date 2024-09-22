/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
import java.util.Scanner;
public class Areapoligonos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Bienvenida a la calculadora de área de polígonos");
        System.out.println("1) TRIÁNGULO");
        System.out.println("2) CUADRADO");
        System.out.println("3) RECTÁNGULO");
        int opc= entrada.nextInt();
       switch(opc){
           case 1:
               System.out.println("TRIÁNGULO");
               System.out.println("Ingrese su altura: ");
               double altura=entrada.nextDouble();
               System.out.println("Ingrese su base: ");
               double base= entrada.nextDouble();
               double area=(base*altura)/2;
               System.out.println("El Área del triángulo es de: "+area+" cm cúbicos" +
                       "2");
               break;
           case 2:
               System.out.println("CUADRADO");
               System.out.println("Ingrese su lado: ");
               double lado= entrada.nextDouble();
               double areaC=lado*lado;
               System.out.println("El Área del cuadrado es de: "+areaC+" cm cúbicos" );
               break;
           case 3:
               System.out.println("RECTÁNGULO");
               System.out.println("Ingrese su altura: ");
               double alturaR= entrada.nextDouble();
               System.out.println("Ingrese su base: ");
               double baseR= entrada.nextDouble();
               double areaR=baseR*alturaR;
               System.out.println("El Área del rectángulo es de: "+areaR+" cm cúbicos");
               break;


        }
    }
}
