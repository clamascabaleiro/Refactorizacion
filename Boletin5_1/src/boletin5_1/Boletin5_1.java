/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;
import java.util.Scanner;
/**
 *
 * @author clamascabaleiro
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner ler=new Scanner (System.in);
    Conta datos = new Conta ();
    System.out.println("Introduzca cliente:");
    datos.setNombre(ler.next());
    System.out.println("Cliente= " + datos.getNombre());
    System.out.println("Introduzca conta:");
    datos.setNumeroconta(ler.next());
    System.out.println("Cliente= " + datos.getNombre());
    System.out.println("Conta= " +datos.getNumeroconta());
    System.out.println("Introduzca saldo:");
    datos.setSaldo(ler.nextDouble());
    System.out.println("Cliente= " + datos.getNombre());
    System.out.println("Conta= " +datos.getNumeroconta());
    System.out.println("Saldo= " +datos.getSaldo());
    System.out.println("Introduzca cantidad a añadir:");
    datos.setSaldo(ler.nextDouble());
    System.out.println("Cliente= " + datos.getNombre());
    System.out.println("Conta= " +datos.getNumeroconta());
    System.out.println("Saldo= " +datos.getSaldo());
    
    
    }
    }
