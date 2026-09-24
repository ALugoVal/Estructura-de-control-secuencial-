/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio22;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio22 {

   public static double totalcuotas(double valorcuota, int numerocuotas) {
    double total = valorcuota * numerocuotas;
    return total;
}

public static double porcentajerecargo(double preciocontado, double totalcuotas) {
    double recargo = totalcuotas - preciocontado;
    double porcentaje = recargo * 100 / preciocontado;
    return porcentaje;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el precio al contado (P): ");
    double preciocontado = sc.nextDouble();
    System.out.println("Ingrese el valor de cada cuota (T): ");
    double valorcuota = sc.nextDouble();

    int numerocuotas = 12;

    double total = totalcuotas(valorcuota, numerocuotas);
    double porcentaje = porcentajerecargo(preciocontado, total);

    System.out.println("Total pagado en cuotas: " + total);
    System.out.println("Porcentaje de recargo: " + porcentaje + "%");
}
    }

