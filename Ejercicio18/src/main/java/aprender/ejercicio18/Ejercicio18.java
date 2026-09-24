/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio18;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio18 {

    public static double galonesalitros(double galones) {
    double litros = galones * 3.785;
    return litros;
}

public static double totalcobrar(double litros, double preciolitro) {
    double total = litros * preciolitro;
    return total;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los galones surtidos: ");
    double galones = sc.nextDouble();

    double preciolitro = 100;

    double litros = galonesalitros(galones);
    double total = totalcobrar(litros, preciolitro);

    System.out.println("Litros surtidos: " + litros);
    System.out.println("Total a cobrar: " + total + " Bolivares");
}
    }

