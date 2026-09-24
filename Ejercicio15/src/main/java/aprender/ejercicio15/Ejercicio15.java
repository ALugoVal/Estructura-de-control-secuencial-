/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio15;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio15 {

    public static double consumokilovatios(double lecturaanterior, double lecturaactual) {
    double consumo = lecturaactual - lecturaanterior;
    return consumo;
}

public static double montototal(double consumo, double costokilovatio) {
    double monto = consumo * costokilovatio;
    return monto;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la lectura anterior: ");
    double lecturaanterior = sc.nextDouble();
    System.out.println("Ingrese la lectura actual: ");
    double lecturaactual = sc.nextDouble();
    System.out.println("Ingrese el costo por kilovatio: ");
    double costokilovatio = sc.nextDouble();

    double consumo = consumokilovatios(lecturaanterior, lecturaactual);
    double monto = montototal(consumo, costokilovatio);

    System.out.println("Consumo del mes: " + consumo + " kWh");
    System.out.println("Monto total a pagar: " + monto);
}
    }

