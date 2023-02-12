import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        if (edad >= 21) {
            System.out.println("Usted es mayor de edad, tiene " +edad +" años");
        }
        else {
            System.out.println("Usted es menor de edad, tiene " +edad +" años");
        }
        


    }
}
