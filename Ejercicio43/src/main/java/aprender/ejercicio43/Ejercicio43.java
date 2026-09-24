/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio43;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio43 {

   public static double nuevosaldo(double capital) {
    double saldo;

    if (capital < 0) {
        saldo = 10000;
    } else if (capital <= 20000) {
        saldo = 20000;
    } else {
        saldo = capital;
    }

    return saldo;
}

public static double prestamobanco(double capital, double saldo) {
    double prestamo;

    if (saldo > capital) {
        prestamo = saldo - capital;
    } else {
        prestamo = 0;
    }

    return prestamo;
}

public static double montoinsumos(double saldo) {
    double resto = saldo - 5000 - 2000;
    double insumos = resto / 2;
    return insumos;
}

public static double montoincentivos(double saldo) {
    double resto = saldo - 5000 - 2000;
    double incentivos = resto / 2;
    return incentivos;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el saldo actual del capital: ");
    double capital = sc.nextDouble();

    double saldo = nuevosaldo(capital);
    double prestamo = prestamobanco(capital, saldo);
    double insumos = montoinsumos(saldo);
    double incentivos = montoincentivos(saldo);

    System.out.println("Saldo con el que se trabajara: " + saldo);
    if (prestamo > 0) {
        System.out.println("Cantidad que se pediria al banco: " + prestamo);
    } else {
        System.out.println("No es necesario pedir ningun prestamo.");
    }
    System.out.println("Monto para la compra de insumos: " + insumos);
    System.out.println("Monto para incentivos al personal: " + incentivos);
}
}
