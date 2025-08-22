import java.util.Scanner;
public class veporcientodescuento {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Si su prenda cuesta 100 pesos o más, tendrá un descuento del 20%");
        System.out.println("Si su prenda cuesta 200 pesos o más, tendrá un descuento del 35%");
        System.out.println("Pero si su prenda cuesta 500 pesos o más, tendrá un descuento del 50%");
        System.out.println("Ingrese el precio de la prenda: ");
        double prec= entrada.nextDouble();
        if(prec>=100 && prec<200 ){
            double desc=.80;
            double precfin=prec*desc;
            System.out.println("El precio final de su producto es de: $"+precfin);

        }else if(prec>=200 && prec<500){
            double desc=.65;
            double precfin=prec*desc;
            System.out.println("El precio final de su producto es de: $"+precfin);

        }else if(prec>=500){
            double desc=.50;
            double precfin=prec*desc;
            System.out.println("El precio final de su producto es de: $"+precfin);
        }

    }
}
