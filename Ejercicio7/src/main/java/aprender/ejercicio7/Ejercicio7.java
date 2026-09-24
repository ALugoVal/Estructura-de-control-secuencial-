/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio7;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio7 {

  public static double metrosaPulgadas(double metros) {
    double pulgadas = metros * 39.27;
    return pulgadas;
}

public static double pulgadasaPies(double pulgadas) {
    double pies = pulgadas / 12;
    return pies;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad en metros: ");
    double metros = sc.nextDouble();

    double pulgadas = metrosaPulgadas(metros);
    double pies = pulgadasaPies(pulgadas);

    System.out.println(metros + " metros equivalen a " + pulgadas + " pulgadas");
    System.out.println(metros + " metros equivalen a " + pies + " pies");
}
}
