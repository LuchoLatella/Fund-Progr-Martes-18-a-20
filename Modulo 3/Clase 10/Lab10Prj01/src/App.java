import java.util.*;   //en caso de Scanner reemplaza *

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int num_uno , num_dos , val_mayor = 0, val_menor = 0, val_iguales =0;
        boolean band;
        Scanner teclado = new Scanner(System.in);     
        System.out.print("Ingrese el primer valor: ");
        num_uno = teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num_dos = teclado.nextInt();
        if (num_uno > num_dos) {
            val_mayor = num_uno;
		    val_menor = num_dos;
            band = true;
        } else {
            if (num_dos > num_uno) {
                val_mayor = num_dos; 
			    val_menor = num_uno;
			    band = true;
            } else {val_iguales = num_uno;
                    band = false;
    
            }
            
        }
        if (band == true) {    //sólo poner band porque está marcado como true // !band lo invierte
            System.out.println("El más alto es :" + val_mayor + " el más bajo es :" + val_menor );
        } else {
            System.out.println("Ambos valores resultan iguales, elegiste: " + val_iguales);
        }
    }
}
