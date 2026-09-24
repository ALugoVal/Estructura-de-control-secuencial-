/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio37;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio37 {

    public static boolean triangulos(double a, double b,double c){ 
          boolean lados = (a + b > c)&& (a + c > b) && ( b + c > a);
          return lados;
 }
      public static String tipodetriangulo(double a, double b,double c){
      String tipo;
      
      if( a == b && b == c){
         tipo = "equilatero";
      } else if (a == b || a == c || b == c) {
         tipo = "isosceles";
      }else{
         tipo = "Escaleno";
      }
      return tipo;
}
      public static double areatriangulo(double a,double b,double c){
          double s = (a + b + c)/2.0;
          double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
          return area;
      }
      public static void main(String[]args){
          Scanner SC = new Scanner(System.in);
          System.out.println("Ingrese el lado A: ");
          double a = SC.nextDouble();
          
           System.out.println("Ingrese el lado B: ");
          double b = SC.nextDouble();
          
           System.out.println("Ingrese el lado C: ");
          double c = SC.nextDouble();
          
         if(triangulos(a,b,c)){
             String tipodetriangulo = tipodetriangulo(a,b,c);
             double areatriangulo = areatriangulo(a,b,c);
             System.out.println("Tipo de triangulo: " + tipodetriangulo);
             System.out.println("Area de triangulo: " + areatriangulo);
         }else{
             System.out.println("Los valores no forman un triangulo.");
         }
      }
}
