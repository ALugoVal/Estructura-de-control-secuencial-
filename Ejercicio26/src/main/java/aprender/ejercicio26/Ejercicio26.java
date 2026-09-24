/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio26;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio26 {

    public static double alcuadrado(int a, int c) {
    double resultado = Math.pow(a - c, 2);
    return resultado;
}

public static double alcuboentreD(int a, int b, int d) {
    double resultado = Math.pow(a - b, 3) / d;
    return resultado;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de A: ");
    int a = sc.nextInt();
    System.out.println("Ingrese el valor de B: ");
    int b = sc.nextInt();
    System.out.println("Ingrese el valor de C: ");
    int c = sc.nextInt();
    System.out.println("Ingrese el valor de D: ");
    int d = sc.nextInt();

    if (d == 0) {
        double resultado = alcuadrado(a, c);
        System.out.println("Como D es 0, el resultado de (A-C)^2 es: " + resultado);
    } else if (d > 0) {
        double resultado = alcuboentreD(a, b, d);
        System.out.println("Como D es mayor que 0, el resultado de (A-B)^3 / D es: " + resultado);
    } else {
        System.out.println("D es negativo: el enunciado no define ninguna expresión para ese caso.");
    }
}
    }

