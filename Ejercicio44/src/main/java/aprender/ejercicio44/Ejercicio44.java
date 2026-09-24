/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio44;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio44 {

  public static double aportepersona(double montohipoteca, double inversiontotal) {
    double aporte;

    if (montohipoteca < 1000000) {
        aporte = inversiontotal * 0.5;
    } else {
        double resto = inversiontotal - montohipoteca;
        aporte = montohipoteca + resto / 2;
    }

    return aporte;
}

public static double aportesocio(double montohipoteca, double inversiontotal) {
    double aporte;

    if (montohipoteca < 1000000) {
        aporte = inversiontotal * 0.5;
    } else {
        double resto = inversiontotal - montohipoteca;
        aporte = resto / 2;
    }

    return aporte;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el monto que prestaria el banco por la hipoteca: ");
    double montohipoteca = sc.nextDouble();
    System.out.println("Ingrese la inversion total que necesita el negocio: ");
    double inversiontotal = sc.nextDouble();

    double persona = aportepersona(montohipoteca, inversiontotal);
    double socio = aportesocio(montohipoteca, inversiontotal);

    System.out.println("Monto de la hipoteca: " + montohipoteca);
    System.out.println("Inversión total del negocio: " + inversiontotal);
    System.out.println("Aporte de la persona: " + persona);
    System.out.println("Aporte del socio: " + socio);
}
}