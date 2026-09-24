/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio16;
import java.util.Scanner;


/**
 *
 * @author srpet
 */
public class Ejercicio16 {

    public static double arealamina(double largo, double ancho) {
    double area = largo * ancho;
    return area;
}

public static int piezasporlamina(double area, double consumopieza) {
    int piezas = 0;
    double material = area;
    while (material >= consumopieza) {
        material = material - consumopieza;
        piezas = piezas + 1;
    }
    return piezas;
}

public static double desperdicio(double area, int piezas, double consumopieza) {
    double sobrante = area - piezas * consumopieza;
    return sobrante;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el largo de la lamina (metros): ");
    double largo = sc.nextDouble();
    System.out.println("Ingrese el ancho de la lamina (metros): ");
    double ancho = sc.nextDouble();
    System.out.println("Ingrese lo que consume cada pieza: ");
    double consumopieza = sc.nextDouble();

    double area = arealamina(largo, ancho);
    int piezas = piezasporlamina(area, consumopieza);
    double sobrante = desperdicio(area, piezas, consumopieza);

    System.out.println("Piezas que se fabrican con una lamina: " + piezas);
    System.out.println("Desperdicio: " + Math.round(sobrante * 100.0) / 100.0);
}
    }

