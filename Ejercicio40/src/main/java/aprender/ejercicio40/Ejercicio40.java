/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio40;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio40 {

    public static double consumokilovatios(double lecturaanterior, double lecturaactual) {
    double consumo = lecturaactual - lecturaanterior;
    return consumo;
}

public static double montototal(double consumo) {
    double monto;

    if (consumo <= 100) {
        monto = 2622.00;
    } else if (consumo <= 300) {
        monto = consumo * 79.78;
    } else if (consumo <= 500) {
        monto = consumo * 89.52;
    } else {
        monto = consumo * 97.95;
    }

    return monto;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la lectura anterior: ");
    double lecturaanterior = sc.nextDouble();
    System.out.println("Ingrese la lectura actual: ");
    double lecturaactual = sc.nextDouble();

    double consumo = consumokilovatios(lecturaanterior, lecturaactual);
    double monto = montototal(consumo);

    System.out.println("Consumo del mes: " + consumo + " kWh");
    System.out.println("Monto a pagar: " + monto + " Bolivares");
}
    }
