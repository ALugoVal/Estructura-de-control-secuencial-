/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio24;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio24 {

    public static double intereses(double capital, double tasa) {
    double interes = capital * tasa;
    return interes;
}

public static double capitalfinal(double capital, double interes) {
    double total;
    if (interes > 7000) {
        total = capital + interes;
    } else {
        total = capital;
    }
    return total;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad que tiene en inversion: ");
    double capital = sc.nextDouble();

    double tasa = 0.02;

    double interes = intereses(capital, tasa);
    double total = capitalfinal(capital, interes);

    System.out.println("Intereses generados: " + interes);
    System.out.println("Dinero final en la cuenta: " + total);
}
    }

