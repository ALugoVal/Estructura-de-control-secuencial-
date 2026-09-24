/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio39;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio39 {

    public static double valorfinalauto(double valorinicial, double tasadevaluacion) {
    double valorfinal = valorinicial * Math.pow(1 - tasadevaluacion / 100, 3);
    return valorfinal;
}

public static double valorfinalterreno(double valorinicial, double tasaaumento) {
    double valorfinal = valorinicial * Math.pow(1 + tasaaumento / 100, 3);
    return valorfinal;
}

public static boolean debecomprarauto(double valorinicial, double tasadevaluacion, double tasaaumento) {
    double devaluacion = valorinicial - valorfinalauto(valorinicial, tasadevaluacion);
    double incremento = valorfinalterreno(valorinicial, tasaaumento) - valorinicial;

    boolean comprar = devaluacion <= incremento / 2;
    return comprar;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el valor inicial (el mismo para el auto y el terreno): ");
    double valorinicial = sc.nextDouble();
    System.out.println("Ingrese el porcentaje de devaluacion anual del auto: ");
    double tasadevaluacion = sc.nextDouble();
    System.out.println("Ingrese el porcentaje de aumento anual del terreno: ");
    double tasaaumento = sc.nextDouble();

    boolean comprar = debecomprarauto(valorinicial, tasadevaluacion, tasaaumento);

    if (comprar) {
        System.out.println("La persona SÍ debe comprar el automovil.");
    } else {
        System.out.println("La persona NO debe comprar el automovil (deberia comprar el terreno).");
    }
}
}
