/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio42;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio42 {

   public static double limiteminimo(int edadmeses, char sexo) {
    double minimo;

    if (edadmeses <= 1) {
        minimo = 13;
    } else if (edadmeses <= 6) {
        minimo = 10;
    } else if (edadmeses <= 12) {
        minimo = 11;
    } else if (edadmeses <= 60) {
        minimo = 11.5;
    } else if (edadmeses <= 120) {
        minimo = 12.6;
    } else if (edadmeses <= 180) {
        minimo = 13;
    } else if (sexo == 'M') {
        minimo = 12;
    } else {
        minimo = 14;
    }

    return minimo;
}

public static double limitemaximo(int edadmeses, char sexo) {
    double maximo;

    if (edadmeses <= 1) {
        maximo = 26;
    } else if (edadmeses <= 6) {
        maximo = 18;
    } else if (edadmeses <= 12) {
        maximo = 15;
    } else if (edadmeses <= 60) {
        maximo = 15;
    } else if (edadmeses <= 120) {
        maximo = 15.5;
    } else if (edadmeses <= 180) {
        maximo = 15.5;
    } else if (sexo == 'M') {
        maximo = 16;
    } else {
        maximo = 18;
    }

    return maximo;
}

public static boolean tieneanemia(double hemoglobina, double minimo) {
    boolean positivo = hemoglobina < minimo;
    return positivo;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la edad en meses: ");
    int edadmeses = sc.nextInt();
    System.out.println("Ingrese el sexo (M = mujer, H = hombre): ");
    char sexo = sc.next().charAt(0);
    System.out.println("Ingrese el nivel de hemoglobina (g%): ");
    double hemoglobina = sc.nextDouble();

    double minimo = limiteminimo(edadmeses, sexo);
    double maximo = limitemaximo(edadmeses, sexo);
    boolean anemia = tieneanemia(hemoglobina, minimo);

    System.out.println("Rango correspondiente: " + minimo + " - " + maximo + " g%");

    if (anemia) {
        System.out.println("Resultado: POSITIVO (tiene anemia).");
    } else {
        System.out.println("Resultado: NEGATIVO (no tiene anemia).");
    }
}
}