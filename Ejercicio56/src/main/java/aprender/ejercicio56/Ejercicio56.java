/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio56;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio56 {

   public static void dividirrestas(int dividendo, int divisor) {
    int resto = dividendo;
    int cociente = 0;

    while (resto >= divisor) {
        resto = resto - divisor;
        cociente++;
    }

    System.out.println("Cociente: " + cociente);
    System.out.println("Resto: " + resto);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el dividendo: ");
    int dividendo = sc.nextInt();
    System.out.println("Ingrese el divisor: ");
    int divisor = sc.nextInt();

    dividirrestas(dividendo, divisor);
}
}
