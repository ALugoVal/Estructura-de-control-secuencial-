/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio29;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio29 {

    public static double totalventas(double ventas1, double ventas2, double ventas3) {
    double total = ventas1 + ventas2 + ventas3;
    return total;
}

public static double porcentajeventas(double ventasdepto, double total) {
    double porcentaje = ventasdepto * 100 / total;
    return porcentaje;
}

public static double pagovendedor(double porcentaje, double salario) {
    double pago;
    if (porcentaje > 33) {
        pago = salario + salario * 0.20;
    } else {
        pago = salario;
    }
    return pago;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese las ventas del departamento 1: ");
    double ventas1 = sc.nextDouble();
    System.out.println("Ingrese las ventas del departamento 2: ");
    double ventas2 = sc.nextDouble();
    System.out.println("Ingrese las ventas del departamento 3: ");
    double ventas3 = sc.nextDouble();
    System.out.println("Ingrese el salario mensual de los vendedores: ");
    double salario = sc.nextDouble();

    double total = totalventas(ventas1, ventas2, ventas3);

    double porcentaje1 = porcentajeventas(ventas1, total);
    double porcentaje2 = porcentajeventas(ventas2, total);
    double porcentaje3 = porcentajeventas(ventas3, total);

    double pago1 = pagovendedor(porcentaje1, salario);
    double pago2 = pagovendedor(porcentaje2, salario);
    double pago3 = pagovendedor(porcentaje3, salario);

    System.out.println("Ventas totales: " + total);
    System.out.println("Departamento 1 (" + porcentaje1 + "% de las ventas): cada vendedor recibe " + pago1);
    System.out.println("Departamento 2 (" + porcentaje2 + "% de las ventas): cada vendedor recibe " + pago2);
    System.out.println("Departamento 3 (" + porcentaje3 + "% de las ventas): cada vendedor recibe " + pago3);
}
    }

