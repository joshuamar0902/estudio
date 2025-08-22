import java.util.Scanner;
public class tresnumerosmayores {
    Scanner entrada=new Scanner(System.in);

    public static void Control(Scanner entrada){
        Num1(entrada);
        int us=entrada.nextInt();
        Num2(entrada);
        int us2=entrada.nextInt();
        Num3(entrada);
        int us3=entrada.nextInt();
        if(us>us2 && us>us3){
            System.out.println("El primer número es el mayor: "+us);

        }else if(us2>us && us2>us3){
            System.out.println("El segundo número es el mayor: "+us2);

        }else{
            System.out.println("El tercer número es el mayor:"+us3);
        }

    }
    public static void Num1(Scanner entrada){
        System.out.println("Ingrese un número: ");
    }
    public static void Num2(Scanner entrada){
        System.out.println("Ingrese otro número: ");
    }
    public static void Num3(Scanner entrada){
        System.out.println("Ingrese un tercer número: ");
    }

}





import java.util.Scanner;
public class numerosmayoresmain {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        tresnumerosmayores.Control(entrada);
    }
}
