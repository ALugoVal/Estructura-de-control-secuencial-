/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio49;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio49 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int trescorrectas = 0;
    int primeraysegunda = 0;
    int primeraytercera = 0;
    int segundaytercera = 0;
    int primeraalmenos = 0;
    int segundaalmenos = 0;
    int terceraalmenos = 0;
    int ninguna = 0;

    for (int persona = 1; persona <= 100; persona++) {
        System.out.println("Persona " + persona);
        System.out.println("¿Respondio correctamente la pregunta 1? (S/N): ");
        boolean correcta1 = sc.next().charAt(0) == 'S';
        System.out.println("¿Respondio correctamente la pregunta 2? (S/N): ");
        boolean correcta2 = sc.next().charAt(0) == 'S';
        System.out.println("¿Respondio correctamente la pregunta 3? (S/N): ");
        boolean correcta3 = sc.next().charAt(0) == 'S';

        if (correcta1 && correcta2 && correcta3) {
            trescorrectas++;
        }
        if (correcta1 && correcta2 && !correcta3) {
            primeraysegunda++;
        }
        if (correcta1 && !correcta2 && correcta3) {
            primeraytercera++;
        }
        if (!correcta1 && correcta2 && correcta3) {
            segundaytercera++;
        }
        if (correcta1) {
            primeraalmenos++;
        }
        if (correcta2) {
            segundaalmenos++;
        }
        if (correcta3) {
            terceraalmenos++;
        }
        if (!correcta1 && !correcta2 && !correcta3) {
            ninguna++;
        }
    }

    System.out.println("a. Las tres correctas: " + trescorrectas);
    System.out.println("b. Solo primera y segunda: " + primeraysegunda);
    System.out.println("c. Solo primera y tercera: " + primeraytercera);
    System.out.println("d. Solo segunda y tercera: " + segundaytercera);
    System.out.println("e. Primera pregunta por lo menos: " + primeraalmenos);
    System.out.println("f. Segunda pregunta por lo menos: " + segundaalmenos);
    System.out.println("g. Tercera pregunta por lo menos: " + terceraalmenos);
    System.out.println("h. Ninguna correcta: " + ninguna);
}
}