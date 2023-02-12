/*import java.io.BufferedReader;
import java.io.InputStreamReader;*/
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");*/

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantltscons;
		double importegastado;
		double kmrecorrido;
		double kmslts;
		double preciocomb;
		// La Cantidad de litros consumidos.  /*   */
		System.out.print("Ingrese la cantidad de Kilometros recorridos: ");
		kmrecorrido = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el Precio del Combustible:");
		preciocomb = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese la cantidad de Kilometros  por litros Consumidos: ");
		kmslts = Double.parseDouble(bufEntrada.readLine());
		// Process
		cantltscons = kmrecorrido/kmslts;
		// ImporteGastado = PrecioComb * CantLtsCons;
		importegastado = cantltscons*preciocomb;
		// Salidas
		System.out.println("La Cantidad de litros consumidos es: "+cantltscons);
		System.out.println("El importe econ�mico Gastado en combustible:"+importegastado);
		System.out.println("Fin del Programa...");        
    }
}
