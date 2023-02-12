/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRJ09LAB01.java."

import java.io.*;

public class prj09lab01 {

	// algoritmo que solicite dos valores y marque cual es el mayor
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		boolean band;
		int nro_dos;
		int nro_uno;
		String num_dos;
		String num_uno;
		int val_iguales;
		int val_mayor;
		int val_menor;
		System.out.println("ingrese el primer valor:");
		num_uno = bufEntrada.readLine();
		System.out.println("ingrese el segundo valor: ");
		num_dos = bufEntrada.readLine();
		// Si num_uno > num_dos Entonces
		// val_mayor = num_uno;
		// Imprimir "El número mayor es el primer valor ingresado";
		// FinSi
		// Si num_dos > num_uno Entonces
		// val_mayor = num_dos;
		// Imprimir "El número mayor es el segundo valor ingresado"
		// FinSi
		if (num_uno>num_dos) {
			val_mayor = num_uno;
			val_menor = num_dos;
			band = true;
		} else {
			if (num_dos>num_uno) {
				val_mayor = num_dos;
				val_menor = num_uno;
				band = true;
			} else {
				val_iguales = num_uno;
				band = false;
			}
		}
		if (band==true) {
			System.out.println("El más alto es "+val_mayor+" , el más bajos es: "+val_menor);
		} else {
			System.out.println("Ambos valores resultan iguales, elegiste: "+val_iguales);
		}
	}


}

