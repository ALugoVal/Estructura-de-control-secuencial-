/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio36;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio36 {

public static void cantidaddebilletes(int plata){
         int billetes = plata;
         
         int b50000 = billetes / 50000;
         billetes = billetes % 50000;
         int b20000 = billetes / 20000;
         billetes = billetes % 20000;
         int b10000 = billetes / 10000;
         billetes = billetes % 10000;
         int b5000 = billetes / 5000;
         billetes = billetes % 5000;
         int b2000 = billetes / 2000;
         billetes = billetes % 2000;
         int b1000 = billetes / 1000;
         billetes = billetes % 1000;
         int b500 = billetes / 500;
         billetes = billetes % 500;
         int b100 = billetes / 100;
         billetes = billetes % 100;
         int b50 = billetes / 50;
         billetes = billetes % 50;
         int b20 = billetes / 20;
         billetes = billetes % 20;
         int b10 = billetes / 10;
         billetes = billetes % 10;
         
         System.out.println("Billetes de 50000: " + b50000);
         System.out.println("Billetes de 20000: " + b20000);
         System.out.println("Billetes de 10000: " + b10000);
         System.out.println("Billetes de 5000: " + b5000);
         System.out.println("Billetes de 2000: " + b2000);
         System.out.println("Billetes de 1000: " + b1000);
         System.out.println("Billetes de 500: " + b500);
         System.out.println("Billetes de 100: " + b100);
         System.out.println("Billetes de 50: " + b50);
         System.out.println("Billetes de 20: " + b20);
         System.out.println("Billetes de 10: " + b10);
                  
    }
  public static void main(String[]args){
          Scanner SC = new Scanner(System.in);
          System.out.println("Ingrese la cantidad de billetes a desglosar: ");
          int billetes = SC.nextInt();
          cantidaddebilletes(billetes);
      }
}
