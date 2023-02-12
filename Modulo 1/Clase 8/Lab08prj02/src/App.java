import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese un número :");
    int nro = scanner.nextInt();
    int resto = nro %2;
    if (resto == 0) {
        System.out.print("Se trata de número par.-");
    }
    else{
        System.out.print("Se trata de número impar.-");
    }
    //*la verdad me mata esto
    }
}
