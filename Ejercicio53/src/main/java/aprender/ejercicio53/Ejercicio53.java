/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio53;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio53 {

  public static double pagoporhora(int tipoempleado) {
    double pago;
    if (tipoempleado == 1) {
        pago = 5000;
    } else if (tipoempleado == 2) {
        pago = 10000;
    } else {
        pago = 15000;
    }
    return pago;
}

public static double sueldobasico(int tipoempleado, double horastrabajadas) {
    double pago = pagoporhora(tipoempleado);
    double sueldo = pago * horastrabajadas;
    return sueldo;
}

public static double segurosocial(double sueldobasico) {
    double seguro;
    if (sueldobasico > 100000) {
        seguro = sueldobasico * 0.03;
    } else {
        seguro = 0;
    }
    return seguro;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de empleados (M): ");
    int m = sc.nextInt();
    sc.nextLine();

    int venezolanostipo1 = 0;
    int venezolanostipo2 = 0;
    int venezolanostipo3 = 0;
    int extranjerosimpar = 0;
    int sumaedades = 0;
    double totalpagar = 0;

    for (int i = 1; i <= m; i++) {
        System.out.println("Empleado " + i + " - Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la nacionalidad (V/E): ");
        char nacionalidad = sc.next().charAt(0);
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el tipo de empleado (1, 2 o 3): ");
        int tipoempleado = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas: ");
        double horastrabajadas = sc.nextDouble();
        sc.nextLine();

        double sueldo = sueldobasico(tipoempleado, horastrabajadas);
        double seguro = segurosocial(sueldo);
        double neto = sueldo - seguro;

        sumaedades = sumaedades + edad;
        totalpagar = totalpagar + neto;

        if (nacionalidad == 'V') {
            if (tipoempleado == 1) {
                venezolanostipo1++;
            } else if (tipoempleado == 2) {
                venezolanostipo2++;
            } else {
                venezolanostipo3++;
            }
        } else {
            if (edad % 2 != 0) {
                extranjerosimpar++;
            }
        }

        System.out.println(nombre + " - Sueldo basico: " + sueldo + ", Seguro social: " + seguro + ", Neto: " + neto);
    }

    double promedioedad = (double) sumaedades / m;

    System.out.println("c. Venezolanos tipo 1: " + venezolanostipo1);
    System.out.println("c. Venezolanos tipo 2: " + venezolanostipo2);
    System.out.println("c. Venezolanos tipo 3: " + venezolanostipo3);
    System.out.println("d. Extranjeros con edad impar: " + extranjerosimpar);
    System.out.println("e. Promedio de edad: " + promedioedad);
    System.out.println("f. Total general a pagar en sueldos: " + totalpagar);
}
}