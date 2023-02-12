import java.util.Scanner;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");*/
       int producto , calidad;
       double precio = 0;
       
    Scanner teclado = new Scanner(System.in);  
    System.out.print("Ingrese el código del producto: ");
    producto = teclado.nextInt();
    System.out.print("Ingrese el código de calidad de producto: ");
    calidad = teclado.nextInt();    
    switch (producto) {
        case 1:
            switch (calidad) {
                case 1:
                    precio = 5000;
                    break;
                case 2:
                    precio = 4500;
                    break;
                case 3:
                    precio = 4000;
                    break;
                default:
                    String error_cal = "Calidad inválida";
                    break;
            }
            break;
        case 2:
            switch (calidad) {
                case 1:
                    precio = 4500;
                    break;
                case 2:
                    precio = 4000;
                    break;
                case 3:
                    precio = 3500;
                    break;
            default:
                String error_cal = "Calidad inválida";
            break;
            }    
        case 3:
            switch (calidad) {
                case 1:
                    precio = 4000;
                    break;
                case 2:
                    precio = 3500;
                    break;
                case 3:
                    precio = 3000;
                    break;
        default:
            String error_cal = "Calidad inválida";
        break;
        }    
            break;

        default:
            String error_prod = "Producto inválido";
            break;
    }
    System.out.println("\n");
    System.out.println("El código del producto es: " + producto + "\n"
                        + "cuyo código de calidad es: " + calidad + "\n"
                        + "su precio es $" + precio + " pesos" );
    System.out.println("..... gracias .....");                    
    }

}
