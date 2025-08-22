import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double prom;
        System.out.println("Ingrese su primera calificación: ");
        double a= entrada.nextDouble();
        System.out.println("ingrese su segunda calificación: ");
        double b= entrada.nextDouble();
        prom=((a+b)/2);
        System.out.println("Su promedio es de: "+prom);
    }
}
