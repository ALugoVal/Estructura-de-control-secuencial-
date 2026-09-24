/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio41;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio41 {

   public static double hectareasametros(double hectareas) {
    double metros = hectareas * 10000;
    return metros;
}

public static double porcentajepino(double areabosque) {
    double porcentaje;
    if (areabosque > 1000000) {
        porcentaje = 70;
    } else {
        porcentaje = 50;
    }
    return porcentaje;
}

public static double porcentajeoyamel(double areabosque) {
    double porcentaje;
    if (areabosque > 1000000) {
        porcentaje = 20;
    } else {
        porcentaje = 30;
    }
    return porcentaje;
}

public static double porcentajecedro(double areabosque) {
    double porcentaje;
    if (areabosque > 1000000) {
        porcentaje = 10;
    } else {
        porcentaje = 20;
    }
    return porcentaje;
}

public static int cantidadarboles(double areabosque, double porcentaje, double metroscuadrados, int arbolesporespacio) {
    double areaespecie = areabosque * porcentaje / 100;
    double espacios = areaespecie / metroscuadrados;
    int cantidad = (int) (espacios * arbolesporespacio);
    return cantidad;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la superficie del bosque en hectareas: ");
    double hectareas = sc.nextDouble();

    double areabosque = hectareasametros(hectareas);

    double pctpino = porcentajepino(areabosque);
    double pctoyamel = porcentajeoyamel(areabosque);
    double pctcedro = porcentajecedro(areabosque);

    int pinos = cantidadarboles(areabosque, pctpino, 10, 8);
    int oyameles = cantidadarboles(areabosque, pctoyamel, 15, 15);
    int cedros = cantidadarboles(areabosque, pctcedro, 18, 10);

    System.out.println("Superficie del bosque: " + areabosque + " m²");
    System.out.println("Número de pinos a sembrar: " + pinos);
    System.out.println("Número de oyameles a sembrar: " + oyameles);
    System.out.println("Número de cedros a sembrar: " + cedros);
}
    }
