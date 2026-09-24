/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio57;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio57 {

   public static double raizcuadrada(double n) {
    double x = 0.1;
    double rn = (x + n / x) / 2;

    while (Math.abs(x - rn) >= 0.000001) {
        x = rn;
        rn = (x + n / x) / 2;
    }

    return rn;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero positivo (N): ");
    double n = sc.nextDouble();

    double raiz = raizcuadrada(n);

    System.out.println("La raíz cuadrada de " + n + " es aproximadamente: " + raiz);
}
}
