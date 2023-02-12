/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pjrcuentabancaria;
import com.Lab.Dominio.CuentaBanco;
import java.util.Scanner;
/**
 *
 * @author J.A.S
 */
public class PjrCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Proyecto Cuenta Bancaria \n");
        Scanner Teclado = new Scanner(System.in);
        Scanner Teclado2 = new Scanner(System.in);
                
        
        CuentaBanco MiCuenta = new CuentaBanco("Julian Sosa");
        MiCuenta.setCodcuenta(11);
        MiCuenta.depositar(8000);
        MiCuenta.extraer(2000);
        
        System.out.print("Ingrese el Codigo de cuenta: ");
        int codigo = Teclado.nextInt();
        System.out.print("Ingrese el Saldo Inicial: ");
        float saldo = Teclado.nextFloat();
        System.out.print("Ingrese el Apellido del Titular: ");
        String titular = Teclado2.nextLine();
        
        CuentaBanco OtraCuenta = new CuentaBanco(codigo, saldo, titular);
        OtraCuenta.depositar(5000);
        OtraCuenta.extraer(8000);
              
        
        System.out.println("\n");
        
        System.out.println("Mi Codigo de Cuenta Bancaria es: "+MiCuenta.getCodcuenta());
        System.out.println("El Titular es: " +MiCuenta.getTitular() );
        System.out.println("El saldo de la cuenta es: " +MiCuenta.getSaldo());
        System.out.println("\n");
  
        System.out.println("El Codigo de Cuenta Bancaria es: "+OtraCuenta.getCodcuenta());
        System.out.println("El Titular es: " +OtraCuenta.getTitular() );
        System.out.println("El saldo de la cuenta es: " +OtraCuenta.getSaldo());
        System.out.println("\n");
        
        if (MiCuenta.getSaldo() > OtraCuenta.getSaldo()){
            System.out.println("La cuenta con mayor saldo es: " +MiCuenta.getCodcuenta()+"|" + " del Titular: " + MiCuenta.getTitular());
        } else 
            if (OtraCuenta.getSaldo()> MiCuenta.getSaldo()) {
                System.out.println("La cuenta con mayor saldo es: " +OtraCuenta.getCodcuenta()+"|" + " del Titular: " + OtraCuenta.getTitular());      
        } else {
            System.out.println("Las cuentas bancarias tienen igual Saldo");
        }
         
        }
   
}
