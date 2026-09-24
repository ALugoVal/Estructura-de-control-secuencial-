/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio11;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio11 {

    public static double sueldobase(double horasnormales, double pagohora) {
    double sueldo = horasnormales * pagohora;
    return sueldo;
}

public static double pagohorasextras(double horasextras, double pagohora) {
    double pagohoraextra = pagohora * 1.25;
    double pago = horasextras * pagohoraextra;
    return pago;
}

public static double asignaciones(int hijos) {
    double actualizacion = 25000;
    double porhijos = hijos * 17300;
    double primahogar = 18000;
    double total = actualizacion + porhijos + primahogar;
    return total;
}

public static double deducciones(double sueldobase) {
    double paroforzoso = sueldobase * 0.05;
    double politicahabitacional = sueldobase * 0.02;
    double cajaahorro = sueldobase * 0.07;
    double total = paroforzoso + politicahabitacional + cajaahorro;
    return total;
}

public static double sueldoneto(double sueldobase, double pagoextras, double asignaciones, double deducciones) {
    double neto = sueldobase + pagoextras + asignaciones - deducciones;
    return neto;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del trabajador: ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese las horas normales trabajadas: ");
    double horasnormales = sc.nextDouble();
    System.out.println("Ingrese el pago de una hora normal: ");
    double pagohora = sc.nextDouble();
    System.out.println("Ingrese las horas extras trabajadas: ");
    double horasextras = sc.nextDouble();
    System.out.println("Ingrese el numero de hijos: ");
    int hijos = sc.nextInt();

    double base = sueldobase(horasnormales, pagohora);
    double extras = pagohorasextras(horasextras, pagohora);
    double totalasignaciones = asignaciones(hijos);
    double totaldeducciones = deducciones(base);
    double neto = sueldoneto(base, extras, totalasignaciones, totaldeducciones);

    System.out.println("Trabajador: " + nombre);
    System.out.println("Sueldo base: " + base);
    System.out.println("Pago por horas extras: " + extras);
    System.out.println("Asignaciones: " + totalasignaciones);
    System.out.println("Deducciones: " + totaldeducciones);
    System.out.println("Sueldo neto: " + neto);
}
    }

