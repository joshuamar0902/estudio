import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class menupeliculas2 {
    String[] nombres = new String[3];
    Scanner entrada=new Scanner(System.in);
    public static void Menu(){
        System.out.println("Bienvenido al menú de películas");
        System.out.println("1)Agregar películas");
        System.out.println("2)Consultar películas");
        System.out.println("3)Eliminar películas");
        System.out.println("4)Salir del programa");
    }
    
    public static void controlMenu(Scanner entrada){
        int opc;
        do{
            Menu();
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1:
                    Agregar(entrada);
                    break;
                case 2:
                    Consultar(entrada);
                    break;
                case 3:
                    Eliminar(entrada);
                    break;
                case 4:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Esa opcion no se encuentra");
            }
            
            }while(opc!=4);
                
            }
    public static void Agregar(Scanner entrada){
        System.out.println("¿Qué película deseas agregar?");       
        String peli=entrada.nextLine();
        System.out.println("Haz agregado "+peli+" a la lista");
    }
    public static void Consultar(Scanner entrada){
        System.out.println("¿Qué película deseas consultar?");
        String cons=entrada.nextLine();
        System.out.println("Haz Consultado "+cons);
        
    }
    public static void Eliminar(Scanner entrada){
        System.out.println("¿Qué película desea eliminar?");
        String elim=entrada.nextLine();
        System.out.println("Haz eliminado "+elim+" de la lista");
        
        
    }
        }







    import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class menupeliculasmain {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        menupeliculas2.controlMenu(entrada);
    }
    
}
