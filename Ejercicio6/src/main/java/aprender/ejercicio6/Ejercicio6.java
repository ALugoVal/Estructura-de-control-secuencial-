/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio6;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio6 {

    public static double porcentajedehombresymujeres(int porcentaje,int total){
        double resultado = porcentaje * 100.0 / total;
        return resultado;
    }
     public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de hombres: ");
         int hombres = sc.nextInt();
          System.out.println("Ingrese la cantidad de mujeres: ");
         int mujeres = sc.nextInt();
         
         int totalestudiantes = hombres + mujeres;
         
         double porcentajehombres = porcentajedehombresymujeres(hombres,totalestudiantes);
         double porcentajemujeres = porcentajedehombresymujeres(mujeres,totalestudiantes);
         
         System.out.println("Porcentaje de hombres: " + porcentajehombres + "%");
         System.out.println("Porcentaje de mujeres: " + porcentajemujeres + "%");
     }
}
