/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio51;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio51 {

    public static int calculartermino(int primertermino, int diferencia, int posicion) {
    int termino = primertermino;

    for (int i = 1; i < posicion; i++) {
        termino = termino + diferencia;
    }

    return termino;
}

public static int sumartermninos(int primertermino, int diferencia, int cantidad) {
    int suma = 0;
    int termino = primertermino;

    for (int i = 1; i <= cantidad; i++) {
        suma = suma + termino;
        termino = termino + diferencia;
    }

    return suma;
}

public static void main(String[] args) {
    int termino12 = calculartermino(6, 5, 12);
    int suma12 = sumartermninos(6, 5, 12);

    System.out.println("El termino doceavo es: " + termino12);
    System.out.println("La suma de los doce primeros terminos es: " + suma12);
}
}