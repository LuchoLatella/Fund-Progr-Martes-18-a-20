/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lab.Dominio;

/**
 *
 * @author J.A.S
 */
public class CuentaBanco {
    //Definicion Atributos
    private int codcuenta;
    private float saldo;
    private String titular;
    
    //Definimos el constructor
    public CuentaBanco(){
        codcuenta=0;
        saldo=0;
        titular="Sin Definir";
    }

    public CuentaBanco(int codcuenta, float saldo, String titular) {
        this.codcuenta = codcuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public CuentaBanco(String titular) {
        this.titular = titular;
    }
    
    //Definit Comportamientos

    public int getCodcuenta() {
        return codcuenta;
    }

    public void setCodcuenta(int codcuenta) {
        this.codcuenta = codcuenta;
    }
    
    public float getSaldo() {
        return (float) saldo;
    }

//    public void setSaldo(float saldo) {  //
//        this.saldo = saldo;
//    }OK
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositar(float monto){
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }
    
    public void extraer(float monto){
        if (monto > 0 && saldo >= monto) {
           saldo = saldo - monto;
        }
    }
    
    
    
}
