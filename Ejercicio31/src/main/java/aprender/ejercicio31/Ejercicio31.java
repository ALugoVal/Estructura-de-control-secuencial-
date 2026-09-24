/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio31;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio31 {

    public static double costoalquiler(double km) {
    double costo;
    if (km <= 300) {
        costo = 5000;
    } else if (km <= 1000) {
        costo = 5000 + (km - 300) * 200;
    } else {
        double tramomedio = 700 * 200;
        double tramolargo = (km - 1000) * 150;
        costo = 5000 + tramomedio + tramolargo;
    }
    return costo;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los kilometros recorridos: ");
    double km = sc.nextDouble();

    double costo = costoalquiler(km);

    System.out.println("Kilómetros recorridos: " + km);
    System.out.println("Total a pagar: " + costo + " Bolivares");
}
    }

