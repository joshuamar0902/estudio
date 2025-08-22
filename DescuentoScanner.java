import java.util.Scanner;
public class descuentosscan {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el precio de una prenda: ");
        double precpr=entrada.nextDouble();
        System.out.println("Ingrese el descuento que se le quiera aplicar: ");
        double desc= entrada.nextDouble();
        float desccnv=(float) (desc/10);
        float desccnv2=(float) (desccnv*.10);
        float precfin= (float) (precpr*desccnv2);
        float precfin2=(float)(precpr-precfin);
        System.out.println("El precio inicial de su prenda fue de: $"+precpr);
        System.out.println("Usted eligió un descuento total de: "+desc+"%");
        System.out.println("Por lo que su precio final es de: $"+precfin2);
    }
}
