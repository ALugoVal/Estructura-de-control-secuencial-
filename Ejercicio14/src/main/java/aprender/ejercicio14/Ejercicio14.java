/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio14;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio14 {

   public static double denominador(double a, double b, double d, double e) {
    double denominador = a * e - b * d;
    return denominador;
}

public static double valorx(double a, double b, double c, double d, double e, double f) {
    double x = (c * e - b * f) / denominador(a, b, d, e);
    return x;
}

public static double valory(double a, double b, double c, double d, double e, double f) {
    double y = (a * f - c * d) / denominador(a, b, d, e);
    return y;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de a: ");
    double a = sc.nextDouble();
    System.out.println("Ingrese el valor de b: ");
    double b = sc.nextDouble();
    System.out.println("Ingrese el valor de c: ");
    double c = sc.nextDouble();
    System.out.println("Ingrese el valor de d: ");
    double d = sc.nextDouble();
    System.out.println("Ingrese el valor de e: ");
    double e = sc.nextDouble();
    System.out.println("Ingrese el valor de f: ");
    double f = sc.nextDouble();

    double x = valorx(a, b, c, d, e, f);
    double y = valory(a, b, c, d, e, f);

    System.out.println("El valor de X es: " + x);
    System.out.println("El valor de Y es: " + y);
}
    }

