/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio34;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio34 {

    public static double porcentajeaumento(int categoria) {
    double porcentaje;
    if (categoria == 1) {
        porcentaje = 15;
    } else if (categoria == 2) {
        porcentaje = 10;
    } else if (categoria == 3) {
        porcentaje = 8;
    } else if (categoria == 4) {
        porcentaje = 7;
    } else {
        porcentaje = 0;
    }
    return porcentaje;
}

public static double nuevosueldo(double sueldo, double porcentaje) {
    double aumento = sueldo * porcentaje / 100;
    double nuevo = sueldo + aumento;
    return nuevo;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la categoria del trabajador (1 a 4): ");
    int categoria = sc.nextInt();
    System.out.println("Ingrese el sueldo del trabajador: ");
    double sueldo = sc.nextDouble();

    double porcentaje = porcentajeaumento(categoria);

    if (porcentaje < 0) {
        System.out.println("La categoria " + categoria + " no existe. Debe ser un numero del 1 al 4.");
    } else {
        double nuevo = nuevosueldo(sueldo, porcentaje);
        System.out.println("Categoria del trabajador: " + categoria);
        System.out.println("Aumento aplicado: " + porcentaje + "%");
        System.out.println("Nuevo sueldo: " + nuevo);
    }
}
    }

