/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio58;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio58 {

   public static double capitalacumulado(double capital, double tasa, int semanas) {
    double capitalinicial = capital;
    int dias = semanas * 7;

    int diatranscurrido = 1;
    while (diatranscurrido <= dias) {
        double interesdiario = (tasa / 100) * capitalinicial / 365;
        capital = capital + interesdiario;
        diatranscurrido++;
    }

    return capital;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el capital a depositar: ");
    double capital = sc.nextDouble();
    System.out.println("Ingrese la tasa de interés (por ejemplo, 6 para 6%): ");
    double tasa = sc.nextDouble();
    System.out.println("Ingrese la duracion del deposito en semanas: ");
    int semanas = sc.nextInt();

    double capitalfinal = capitalacumulado(capital, tasa, semanas);

    System.out.println("Capital total acumulado despues de " + semanas + " semanas: " + capitalfinal);
}
}
