/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio19;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio19 {

    public static double dineroporarea(double presupuesto, double porcentaje) {
    double dinero = presupuesto * porcentaje / 100;
    return dinero;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el presupuesto anual del hospital: ");
    double presupuesto = sc.nextDouble();

    double ginecologia = dineroporarea(presupuesto, 40);
    double traumatologia = dineroporarea(presupuesto, 30);
    double pediatria = dineroporarea(presupuesto, 30);

    System.out.println("Ginecología recibirá: " + ginecologia);
    System.out.println("Traumatología recibirá: " + traumatologia);
    System.out.println("Pediatría recibirá: " + pediatria);
}
    }

