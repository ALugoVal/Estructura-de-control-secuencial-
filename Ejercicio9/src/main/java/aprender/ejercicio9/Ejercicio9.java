/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio9;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio9 {

    public static double salarioneto(double horastrabajadas, double preciohora) {
    double sueldobase = horastrabajadas * preciohora;
    double impuestos = sueldobase * 0.20;
    double neto = sueldobase - impuestos;
    return neto;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese las horas trabajadas: ");
    double horastrabajadas = sc.nextDouble();
    System.out.println("Ingrese el precio de la hora: ");
    double preciohora = sc.nextDouble();

    double neto = salarioneto(horastrabajadas, preciohora);

    System.out.println("El salario neto es: " + neto);
}
    }
