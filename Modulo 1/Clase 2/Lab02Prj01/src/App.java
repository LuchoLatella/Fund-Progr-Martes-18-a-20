import java.util.Scanner;

import java.io.*;  //método original
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));  método original
        Scanner LecturaDatos = new Scanner(System.in);
        int Nro1, Nro2, Suma;

        System.out.print("Ingrese el primer número: ");    //println
        Nro1 = LecturaDatos.nextInt();

        System.out.print("Ingrese el segundo número: ");      //println
        Nro2 = LecturaDatos.nextInt();

        Suma = Nro1+Nro2;

        System.out.println("La suma de ambos es :" + Suma);        
        LecturaDatos.close();
        

    }
}
