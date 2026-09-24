/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio46;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio46 {
    
public static void mostrarserie(int n, int k) {
    for (int i = n; i >= k; i--) {
        System.out.println(i);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor de N: ");
    int n = sc.nextInt();
    System.out.println("Ingrese el valor de K: ");
    int k = sc.nextInt();

    mostrarserie(n, k);

}
}
