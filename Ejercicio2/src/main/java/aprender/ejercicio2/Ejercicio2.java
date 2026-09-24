/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio2;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio2 {

public static double gananciainversion(double capital){
    double tasamensual = 0.02;
    double ganancia = capital * tasamensual;
            return ganancia;
    }
public static void main(String[]args){
    double ganancia = gananciainversion(100000);
    System.out.println("Su ganancia de la inversion despues de un mes es: " + ganancia);
}
}
