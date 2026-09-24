/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio4;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio4 {

    public static double totalcondescuento(double totalcompra){
        double descuento = totalcompra * 0.15;
        double totalapagar = totalcompra - descuento;
        return totalapagar;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        double totalcompra = sc.nextDouble();
        
        double totalapagar = totalcondescuento(totalcompra);
        
        System.out.println("Total de la compra: " + totalcompra);
        System.out.println("Total a pagar con el descuento: " + totalapagar);
    }
}
