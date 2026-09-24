/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio27;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio27 {

    public static double areatriangulo(double base, double altura) {
    double area = base * altura / 2;
    return area;
}

public static double areacirculo(double radio, double pi) {
    double area = pi * Math.pow(radio, 2);
    return area;
}

public static double arearectangulo(double base, double altura) {
    double area = base * altura;
    return area;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor 1: ");
    double valor1 = sc.nextDouble();
    System.out.println("Ingrese el valor 2: ");
    double valor2 = sc.nextDouble();
    System.out.println("Ingrese el valor 3 (el area a comparar): ");
    double valor3 = sc.nextDouble();

    int coincidencias = 0;

    if (Math.abs(areatriangulo(valor1, valor2) - valor3) < 0.0001) {
        System.out.println("Los valores corresponden a un TRIANGULO (base y altura).");
        coincidencias = coincidencias + 1;
    }
    if (Math.abs(areacirculo(valor1, valor2) - valor3) < 0.0001) {
        System.out.println("Los valores corresponden a un CIRCULO (radio y pi).");
        coincidencias = coincidencias + 1;
    }
    if (Math.abs(arearectangulo(valor1, valor2) - valor3) < 0.0001) {
        System.out.println("Los valores corresponden a un RECTANGULO (base y altura).");
        coincidencias = coincidencias + 1;
    }

    if (coincidencias == 0) {
        System.out.println("Los valores no corresponden a ninguna de las tres figuras.");
    }
}
    }

