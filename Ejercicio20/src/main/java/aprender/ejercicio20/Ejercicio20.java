/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio20;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio20 {

    public static double tasaanual(double capital, double interes, double tiempo) {
    double tasa = interes * 100 / (capital * tiempo);
    return tasa;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor del prestamo (X): ");
    double capital = sc.nextDouble();
    System.out.println("Ingrese los intereses pagados (Y): ");
    double interes = sc.nextDouble();

    double tiempo = 4;

    double tasa = tasaanual(capital, interes, tiempo);

    System.out.println("El porcentaje anual cobrado fue: " + tasa + "%");
}
    }

