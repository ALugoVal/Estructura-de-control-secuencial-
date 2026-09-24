/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio45;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio45 {

 public static double discriminante(double a, double b, double c) {
    double d = Math.pow(b, 2) - 4 * a * c;
    return d;
}

public static String tiposolucion(double d) {
    String tipo;

    if (d == 0) {
        tipo = "una sola solucion";
    } else if (d > 0) {
        tipo = "dos soluciones reales";
    } else {
        tipo = "no tiene solucion en los reales";
    }

    return tipo;
}

public static double x1(double a, double b, double d) {
    double resultado;

    if (d == 0) {
        resultado = -b / (2 * a);
    } else {
        resultado = (-b + Math.sqrt(d)) / (2 * a);
    }

    return resultado;
}

public static double x2(double a, double b, double d) {
    double resultado = (-b - Math.sqrt(d)) / (2 * a);
    return resultado;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de A: ");
    double a = sc.nextDouble();
    System.out.println("Ingrese el valor de B: ");
    double b = sc.nextDouble();
    System.out.println("Ingrese el valor de C: ");
    double c = sc.nextDouble();

    double d = discriminante(a, b, c);
    String tipo = tiposolucion(d);

    System.out.println("Discriminante: " + d);
    System.out.println("Tipo de solucion: " + tipo);

    if (d == 0) {
        double resultado = x1(a, b, d);
        System.out.println("X1 = X2 = " + resultado);
    } else if (d > 0) {
        double resultado1 = x1(a, b, d);
        double resultado2 = x2(a, b, d);
        System.out.println("X1 = " + resultado1);
        System.out.println("X2 = " + resultado2);
    } else {
        System.out.println("No hay solucion real para esta ecuacion.");
    }
}
}
    
