import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class calculadorametods {
    public static void Calculadora(){
        System.out.println("Bienvenido a la calculadora");
        System.out.println("1)Sumar");
        System.out.println("2)Restar");
        System.out.println("3)Multiplicar");
        System.out.println("4)Dividir");
        System.out.println("5)Salir de la calculadora");
        
    }
    public static void Sumar(Scanner entrada){
        int num1,num2;
        System.out.println("Ha elegido la opción Suma");
        System.out.println("Ingrese un número: ");
        num1=entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2=entrada.nextInt();
        System.out.println("El resultado es: "+(num1+num2));
        
        
    }
    public static void Restar(Scanner entrada){
        int num1,num2;
        System.out.println("Ha elegido la opción Resta");
        System.out.println("Ingrese un número: ");
        num1=entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2=entrada.nextInt();
        System.out.println("El resultado es: "+(num1-num2));
        
        
    }
    public static void Multiplicar(Scanner entrada){
        int num1,num2;
        System.out.println("Ha elegido la opción Multiplicar");
        System.out.println("Ingrese un número: ");
        num1=entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2=entrada.nextInt();
        System.out.println("El resultado es: "+num1*num2);
        
        
    }
    public static void Dividir(Scanner entrada){
        int num1,num2;
        System.out.println("Ha elegido la opción Dividir");
        System.out.println("Ingrese un número: ");
        num1=entrada.nextInt();
        System.out.println("Ingrese otro número: ");
        num2=entrada.nextInt();
        System.out.println("El resultado es:"+num1/num2);
        
        
    }
    public static void Opciones(Scanner entrada){
        int opc;
        do{
        Calculadora();
        
        opc=entrada.nextInt();
        
            switch(opc){
            case 1:
                Sumar(entrada);
                break;
            case 2:
                Restar(entrada);
                break;
            case 3:
                Multiplicar(entrada);
                break;
            case 4:
                Dividir(entrada);
                break; 
            case 5:
                System.out.println("Usted ha salido");
                break;
        }
            
            
        }while(opc!=5);
        
        
    }
    

    }
    



import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class calculadorametodosmain {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        calculadorametods.Opciones(entrada);
    }
    
}
