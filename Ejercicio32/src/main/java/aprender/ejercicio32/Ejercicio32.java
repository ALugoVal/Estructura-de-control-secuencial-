/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio32;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio32 {

    public static double evaluarexpresion(int p, int q) {
    double resultado = Math.pow(p, 3) + Math.pow(q, 4) - 2 * Math.pow(p, 2);
    return resultado;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de P: ");
    int p = sc.nextInt();
    System.out.println("Ingrese el valor de Q: ");
    int q = sc.nextInt();

    double resultado = evaluarexpresion(p, q);

    if (resultado > 680) {
        System.out.println("Los valores satisfacen la expresión.");
        System.out.println("P = " + p + " y Q = " + q);
    } else {
        System.out.println("Los valores no satisfacen la expresion (el resultado es " + resultado + ").");
    }
}
    }

