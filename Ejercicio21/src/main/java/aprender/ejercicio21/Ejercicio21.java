/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio21;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio21 {

   public static double costoinversion(double naranjas, double precioDocena) {
    double docenas = naranjas / 12;
    double costo = docenas * precioDocena;
    return costo;
}

public static double porcentajeganancia(double inversion, double ingreso) {
    double ganancia = ingreso - inversion;
    double porcentaje = ganancia * 100 / inversion;
    return porcentaje;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de naranjas (X): ");
    double naranjas = sc.nextDouble();
    System.out.println("Ingrese el precio por docena (Y): ");
    double precioDocena = sc.nextDouble();
    System.out.println("Ingrese lo obtenido por la venta (K): ");
    double ingreso = sc.nextDouble();

    double inversion = costoinversion(naranjas, precioDocena);
    double porcentaje = porcentajeganancia(inversion, ingreso);

    System.out.println("Inversion: " + inversion);
    System.out.println("Porcentaje de ganancia: " + porcentaje + "%");
}
    }

