import java.util.Scanner;
public class promediofunciones {
    Scanner entrada=new Scanner(System.in);
    public static double Num1(double a,double b){
        return ((a+b)/2);
    }
    public static void control(Scanner entrada){
        System.out.println("Ingrese una calificación: ");
        double a=entrada.nextDouble();
        System.out.println("Ingrese otra calificación: ");
        double b= entrada.nextDouble();
        System.out.println("Su promedio es de: "+Num1(a,b));
    }
}



import java.util.Scanner;
public class promediomain {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        promediofunciones.control(entrada);

    }
}
