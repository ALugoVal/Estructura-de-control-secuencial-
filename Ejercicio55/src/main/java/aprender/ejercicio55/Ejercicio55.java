/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio55;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio55 {

  public static double termino(int k) {
    double valor = (Math.pow(k, 2) + 1) / k;
    return valor;
}

public static void main(String[] args) {
    int k = 0;
    double suma = 0;

    while (suma + termino(k + 1) <= 1000) {
        k = k + 1;
        suma = suma + termino(k);
    }

    System.out.println("Número de terminos necesarios: " + k);
    System.out.println("Suma aproximada a 1000: " + suma);
}
}
