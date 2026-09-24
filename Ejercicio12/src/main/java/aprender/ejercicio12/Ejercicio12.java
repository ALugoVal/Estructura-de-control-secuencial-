/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio12;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio12 {

    public static double notamatematica(double examen, double tarea1, double tarea2, double tarea3) {
    double promediotareas = (tarea1 + tarea2 + tarea3) / 3;
    double nota = examen * 0.90 + promediotareas * 0.10;
    return nota;
}

public static double notafisica(double examen, double tarea1, double tarea2) {
    double promediotareas = (tarea1 + tarea2) / 2;
    double nota = examen * 0.80 + promediotareas * 0.20;
    return nota;
}

public static double notaquimica(double examen, double tarea1, double tarea2, double tarea3) {
    double promediotareas = (tarea1 + tarea2 + tarea3) / 3;
    double nota = examen * 0.85 + promediotareas * 0.15;
    return nota;
}

public static double promediogeneral(double mate, double fisica, double quimica) {
    double promedio = (mate + fisica + quimica) / 3;
    return promedio;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("MATEMATICA - Ingrese la nota del examen: ");
    double examenmate = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 1: ");
    double matetarea1 = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 2: ");
    double matetarea2 = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 3: ");
    double matetarea3 = sc.nextDouble();

    System.out.println("FISICA - Ingrese la nota del examen: ");
    double examenfisica = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 1: ");
    double fisicatarea1 = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 2: ");
    double fisicatarea2 = sc.nextDouble();

    System.out.println("QUIMICA - Ingrese la nota del examen: ");
    double examenquimica = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 1: ");
    double quimicatarea1 = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 2: ");
    double quimicatarea2 = sc.nextDouble();
    System.out.println("Ingrese la nota de la tarea 3: ");
    double quimicatarea3 = sc.nextDouble();

    double matematicas = notamatematica(examenmate, matetarea1, matetarea2, matetarea3);
    double fisica = notafisica(examenfisica, fisicatarea1, fisicatarea2);
    double quimica = notaquimica(examenquimica, quimicatarea1, quimicatarea2, quimicatarea3);
    double general = promediogeneral(matematicas, fisica, quimica);

    System.out.println("Promedio en Matematica: " + matematicas);
    System.out.println("Promedio en Fisica: " + fisica);
    System.out.println("Promedio en Quimica: " + quimica);
    System.out.println("Promedio general: " + general);
}
    }

