/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio50;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio50 {

   public static int sumarpares(int inicio, int fin) {
    int suma = 0;
    int primerpar = inicio;
    if (primerpar % 2 != 0) {
        primerpar = primerpar + 1;
    }

    for (int i = primerpar; i < fin; i = i + 2) {
        suma = suma + i;
    }

    return suma;
}

public static void main(String[] args) {
    int suma = sumarpares(97, 1003);
    System.out.println("La suma de los pares entre 97 y 1003 es: " + suma);
}
}