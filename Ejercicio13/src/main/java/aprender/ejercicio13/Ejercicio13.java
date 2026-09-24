/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio13;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio13 {

    public static double totaldinero(int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
    double total = n1 * 50000.0 + n2 * 20000.0 + n3 * 10000.0 + n4 * 5000.0
                 + n5 * 2000.0 + n6 * 1000.0 + n7 * 500.0 + n8 * 100.0;
    return total;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de billetes de 50000: ");
    int n1 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 20000: ");
    int n2 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 10000: ");
    int n3 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 5000: ");
    int n4 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 2000: ");
    int n5 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 1000: ");
    int n6 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 500: ");
    int n7 = sc.nextInt();
    System.out.println("Ingrese la cantidad de billetes de 100: ");
    int n8 = sc.nextInt();

    double total = totaldinero(n1, n2, n3, n4, n5, n6, n7, n8);

    System.out.println("El dinero toal en el banco es: " + total);
}
    }

