/* crear algoritmo que almacene 10 entero y muestre el contenido del array */

import java.util.*;
/* 
Crear un algoritmo que nos permita almacenar 10 numeros enteros, y mostrar el contenido del array. usando ESTRUCTURA REPETITIVA 
    DO{ 

    }WHILE (condiciones logicas)
    
*/

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!"); 
        //definimos un array de 10 elementos de tipo entero
        int ArrayNum[] = new int[10];
        int Nro ;
        Scanner Teclado = new Scanner(System.in);
        int i = 0;
        do {
           System.out.print("Ingrese un numero: (0 = Finalizar)");
           Nro = Teclado.nextInt();
           System.out.print(i +"\t");
           ArrayNum[i++] = Nro;
           //System.out.print("Ingrese el siguiente numero: (0 = Finalizar)");
           //Nro = Teclado.nextInt();
        } while (Nro != 0 && i < 10 ); 

        System.out.print("\n\n");
        for (int j = 0; j < i; j++) 
        {
            System.out.print(j +"\t");
            System.out.println("Los numeros almacenados en el Array son: " + ArrayNum[j]); 
        }
}
}