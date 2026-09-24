/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio25;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio25 {

    public static double porcentajeaumento(double sueldo) {
    double porcentaje;
    if (sueldo < 40000) {
        porcentaje = 0.15;
    } else {
        porcentaje = 0.12;
    }
    return porcentaje;
}

public static double nuevosueldo(double sueldo, double porcentaje) {
    double aumento = sueldo * porcentaje;
    double nuevo = sueldo + aumento;
    return nuevo;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el sueldo del trabajador: ");
    double sueldo = sc.nextDouble();

    double porcentaje = porcentajeaumento(sueldo);
    double nuevo = nuevosueldo(sueldo, porcentaje);

    System.out.println("Sueldo actual: " + sueldo);
    System.out.println("Nuevo sueldo: " + nuevo);
}
    }

