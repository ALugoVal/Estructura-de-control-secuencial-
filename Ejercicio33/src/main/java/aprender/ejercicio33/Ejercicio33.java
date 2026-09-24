/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio33;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio33 {

    public static double porcentajedescuento(double monto) {
    double porcentaje;
    if (monto < 500) {
        porcentaje = 0;
    } else if (monto <= 1000) {
        porcentaje = 5;
    } else if (monto <= 7000) {
        porcentaje = 11;
    } else if (monto <= 15000) {
        porcentaje = 18;
    } else {
        porcentaje = 25;
    }
    return porcentaje;
}

public static double descuentorecibido(double monto, double porcentaje) {
    double descuento = monto * porcentaje / 100;
    return descuento;
}

public static double montoapagar(double monto, double descuento) {
    double pagar = monto - descuento;
    return pagar;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el monto de la compra: ");
    double monto = sc.nextDouble();

    double porcentaje = porcentajedescuento(monto);
    double descuento = descuentorecibido(monto, porcentaje);
    double pagar = montoapagar(monto, descuento);

    System.out.println("Monto de la compra: $" + monto);
    System.out.println("Descuento aplicado: " + porcentaje + "%");
    System.out.println("Descuento recibido: $" + descuento);
    System.out.println("Monto a pagar: $" + pagar);
}
    }

