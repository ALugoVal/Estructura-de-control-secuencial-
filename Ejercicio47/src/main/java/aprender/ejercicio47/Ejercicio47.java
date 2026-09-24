/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio47;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio47 {

public static void mostrarimpares() {
    for (int i = 1; i < 100; i = i + 2) {
        if (i % 7 != 0) {
            System.out.println(i);
        }
    }
}

public static void main(String[] args) {
    mostrarimpares();
}
}