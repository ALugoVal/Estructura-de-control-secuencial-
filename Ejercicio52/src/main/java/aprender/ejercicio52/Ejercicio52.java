/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio52;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio52 {

   public static void calcularpromedios() {
    Scanner sc = new Scanner(System.in);

    int contadorninos = 0;
    double sumaninos = 0;
    int contadorjovenes = 0;
    double sumajovenes = 0;
    int contadoradultos = 0;
    double sumaadultos = 0;
    int contadorviejos = 0;
    double sumaviejos = 0;

    for (int persona = 1; persona <= 100; persona++) {
        System.out.println("Persona " + persona + " - Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el peso: ");
        double peso = sc.nextDouble();

        if (edad <= 12) {
            contadorninos++;
            sumaninos = sumaninos + peso;
        } else if (edad <= 29) {
            contadorjovenes++;
            sumajovenes = sumajovenes + peso;
        } else if (edad <= 59) {
            contadoradultos++;
            sumaadultos = sumaadultos + peso;
        } else {
            contadorviejos++;
            sumaviejos = sumaviejos + peso;
        }
    }

    double promedioninos = sumaninos / contadorninos;
    double promediojovenes = sumajovenes / contadorjovenes;
    double promedioadultos = sumaadultos / contadoradultos;
    double promedioviejos = sumaviejos / contadorviejos;

    System.out.println("Promedio de peso de los niños: " + promedioninos);
    System.out.println("Promedio de peso de los jovenes: " + promediojovenes);
    System.out.println("Promedio de peso de los adultos: " + promedioadultos);
    System.out.println("Promedio de peso de los viejos: " + promedioviejos);
}

public static void main(String[] args) {
    calcularpromedios();
}
}
