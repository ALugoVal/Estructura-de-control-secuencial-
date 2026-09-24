/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio48;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio48 {

    public static double acelsius(double f) {
    double c = 5 * (f - 32) / 9;
    return c;
}

public static double arankine(double f) {
    double r = f + 459.67;
    return r;
}

public static double akelvin(double c) {
    double k = c + 273.15;
    return k;
}

public static void imprimirencabezado() {
    System.out.println("Fahrenheit\tCelsius\tKelvin\tRankine");
}

public static void tabla(double inicio, double fin, double paso) {
    imprimirencabezado();

    for (double f = inicio; f <= fin; f = f + paso) {
        double c = acelsius(f);
        double k = akelvin(c);
        double r = arankine(f);
        System.out.println(f + "\t" + c + "\t" + k + "\t" + r);
    }
}

public static void main(String[] args) {
    tabla(28, 54, 1);
    tabla(450, 950, 50);
    tabla(-50, 250, 10);
}
}