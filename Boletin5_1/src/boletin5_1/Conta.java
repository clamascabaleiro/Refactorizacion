/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

/**
 *
 * @author clamascabaleiro
 */
public class Conta {

    // Declaro variables
    private String nombre;
    private String numeroConta;
    private double saldo;

    // Creo Constructores
    public Conta() {

    }

    public Conta(String nombre, String numeroConta, double saldo) {

        this.nombre = nombre;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Declaro gets y sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroconta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroconta() {
        return numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // Creamos metodos ingresar y sacar
    public double ingresar(double cantIngreso) {
        saldo += cantIngreso;
        return saldo;
    }

    public double sacar(double cantSaco) {
        saldo -= cantSaco;
        return saldo;
    }

    // Creamos metodo amosar
    public void amosar() {
        System.out.println("Nombre de cliente = " + nombre + "\nnumero de cuenta = " + numeroConta + "\nSaldo = " + saldo);
    }

    public double transferir(String contaDestino, double importe) {
        saldo -= importe;
        return saldo;
    }

}
