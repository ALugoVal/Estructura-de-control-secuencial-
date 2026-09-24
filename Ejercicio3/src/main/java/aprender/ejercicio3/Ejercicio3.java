/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio3;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio3 {

public static double comision(double v1, double v2, double v3){
    double totalventas = (v1 + v2 + v3);
    double comision = totalventas * 0.10;
    return comision;
    }
public static double totalrecibido(double sueldobase, double comision){
    double total = sueldobase + comision;
    return total;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el sueldo base: ");
    double sueldobase = sc.nextDouble();
    System.out.println("Ingrese la primera venta: ");
    double v1 = sc.nextDouble();
    System.out.println("Ingrese la segunda venta: ");
    double v2 = sc.nextDouble();
    System.out.println("Ingrese la tercera venta: ");
    double v3 = sc.nextDouble();
    double comision = comision(v1,v2,v3);
    double total = totalrecibido(sueldobase, comision);
    
    System.out.println("comision :" + comision);
    System.out.println("Sueldo final: " + total);
}
}
