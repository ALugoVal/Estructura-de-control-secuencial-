/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio10;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio10 {

   public static double chelinesaPesetas(double chelines) {
    double pesetas = chelines * 956.871 / 100;
    return pesetas;
}

public static double dracmasaFrancos(double dracmas) {
    double pesetas = dracmas * 88.607 / 100;
    double francos = pesetas / 20.110;
    return francos;
}

public static double pesetasaDolares(double pesetas) {
    double dolares = pesetas / 122.499;
    return dolares;
}

public static double pesetasaLiras(double pesetas) {
    double liras = pesetas * 100 / 9.289;
    return liras;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad en chelines austriacos: ");
    double chelines = sc.nextDouble();
    double pesetasachelines = chelinesaPesetas(chelines);
    System.out.println(chelines + " chelines equivalen a " + pesetasachelines + " pesetas");

    System.out.println("Ingrese la cantidad en dracmas griegos: ");
    double dracmas = sc.nextDouble();
    double francos = dracmasaFrancos(dracmas);
    System.out.println(dracmas + " dracmas equivalen a " + francos + " francos franceses");

    System.out.println("Ingrese la cantidad en pesetas: ");
    double pesetas = sc.nextDouble();
    double dolares = pesetasaDolares(pesetas);
    double liras = pesetasaLiras(pesetas);
    System.out.println(pesetas + " pesetas equivalen a " + dolares + " dolares");
    System.out.println(pesetas + " pesetas equivalen a " + liras + " liras italianas");
}
    }

