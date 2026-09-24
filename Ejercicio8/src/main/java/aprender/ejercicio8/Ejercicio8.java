/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio8;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio8 {

   public static double semiperimetro(double a, double b, double c) {
    double p = (a + b + c) / 2;
    return p;
}

public static double areatriangulo(double a, double b, double c) {
    double p = semiperimetro(a, b, c);
    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return area;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el lado a: ");
    double a = sc.nextDouble();
    System.out.println("Ingrese el lado b: ");
    double b = sc.nextDouble();
    System.out.println("Ingrese el lado c: ");
    double c = sc.nextDouble();

    double area = areatriangulo(a, b, c);

    System.out.println("El área del triángulo es: " + area);
}
    }
