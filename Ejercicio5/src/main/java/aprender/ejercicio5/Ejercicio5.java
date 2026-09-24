/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio5;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio5 {

    public static double calificacionfinal(double parcial1,double parcial2,double parcial3,double examenfinal,double trabajofinal){
        double promedioparciales = (parcial1 + parcial2 + parcial3)/3;
        double calificacion = promedioparciales * 0.55 + examenfinal * 0.30 + trabajofinal * 0.15;
        return calificacion;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota del primer parcial: ");
        double parcial1 = sc.nextDouble();
        System.out.println("Ingrese la nota del segundo parcial: ");
        double parcial2 = sc.nextDouble();
        System.out.println("Ingrese la nota del tercer parcial: ");
        double parcial3 = sc.nextDouble();
        System.out.println("Ingrese la nota del examen final: ");
        double examenfinal = sc.nextDouble();
        System.out.println("Ingrese la nota del trabajo final: ");
        double trabajofinal = sc.nextDouble();
        
        double calificacion = calificacionfinal(parcial1 ,parcial2 ,parcial3 ,examenfinal ,trabajofinal);
        
        System.out.println("La calificacion final es: " + calificacion);
    }
}
