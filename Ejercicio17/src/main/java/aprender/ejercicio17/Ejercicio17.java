/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio17;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio17 {

    public static double descuentoaplicado(double pvp, double preciofinal) {
    double descuento = pvp - preciofinal;
    return descuento;
}

public static double porcentajedescuento(double pvp, double preciofinal) {
    double descuento = descuentoaplicado(pvp, preciofinal);
    double porcentaje = descuento * 100.0 / pvp;
    return porcentaje;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el precio de venta al publico (PVP): ");
    double pvp = sc.nextDouble();
    System.out.println("Ingrese el precio final pagado: ");
    double precioFinal = sc.nextDouble();

    double porcentaje = porcentajedescuento(pvp, precioFinal);

    System.out.println("Porcentaje de descuento aplicado: " + porcentaje + "%");
}
    }

