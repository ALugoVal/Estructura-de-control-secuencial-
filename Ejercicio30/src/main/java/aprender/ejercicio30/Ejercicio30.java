/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio30;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio30 {

    public static int formarnumero(int a, int b, int c, int d) {
    int n = a * 1000 + b * 100 + c * 10 + d;
    return n;
}

public static int redondearcentena(int n) {
    int centenas = n / 100;
    int resto = n - centenas * 100;
    int redondeado;
    if (resto >= 50) {
        redondeado = (centenas + 1) * 100;
    } else {
        redondeado = centenas * 100;
    }
    return redondeado;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el digito A: ");
    int a = sc.nextInt();
    System.out.println("Ingrese el digito B: ");
    int b = sc.nextInt();
    System.out.println("Ingrese el digito C: ");
    int c = sc.nextInt();
    System.out.println("Ingrese el digito D: ");
    int d = sc.nextInt();

    int n = formarnumero(a, b, c, d);
    int redondeado = redondearcentena(n);

    System.out.println("El numero formado es: " + n);
    System.out.println("Redondeado a la centena mas proxima: " + redondeado);
}
    }

