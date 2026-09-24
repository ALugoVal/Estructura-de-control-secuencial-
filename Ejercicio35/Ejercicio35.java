/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio35;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio35 {

   public static String deporteapropiado(double temperaturaF){
    String deporte;

    if (temperaturaF > 85) {
        deporte = "Natacion";
    } else if (temperaturaF > 70) {
        deporte = "tenis";
    } else if (temperaturaF > 32) {
        deporte = "golf";
    } else if (temperaturaF > 10) {
        deporte = "esqui";
    } else {
        deporte = "marcha";
    }

    return deporte;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la temperatura: ");
    double temperaturaF = sc.nextDouble();
    String deporte = deporteapropiado(temperaturaF);
    System.out.println("Deporte apropiado: " + deporte);
}
}