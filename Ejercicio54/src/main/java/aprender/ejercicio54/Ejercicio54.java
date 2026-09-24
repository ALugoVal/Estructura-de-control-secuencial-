/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio54;
import java.util.Scanner;
/**
 *
 * @author srpet
 */
public class Ejercicio54 {

  public static int sumarpuntos(Scanner sc, int cuestionario, int preguntasporcuestionario) {
    int pt = 0;

    for (int pregunta = 1; pregunta <= preguntasporcuestionario; pregunta++) {
        System.out.println("Cuestionario " + cuestionario + ", pregunta " + pregunta + " (1 a 5): ");
        int respuesta = sc.nextInt();
        pt = pt + respuesta;
    }

    return pt;
}

public static double calcularpromedio(int pt, int preguntasporcuestionario) {
    double promedio = (double) pt / preguntasporcuestionario;
    return promedio;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cantidadcuestionarios = 64;
    int preguntasporcuestionario = 23;

    double sumapromedios = 0;
    double promediomasalto = 0;
    int instrumentomasalto = 0;
    double promediomasbajo = 6;
    int instrumentomasbajo = 0;
    int menorque3 = 0;
    int mayorque4 = 0;
    int entre45y5 = 0;

    for (int cuestionario = 1; cuestionario <= cantidadcuestionarios; cuestionario++) {
        int pt = sumarpuntos(sc, cuestionario, preguntasporcuestionario);
        double promedio = calcularpromedio(pt, preguntasporcuestionario);

        sumapromedios = sumapromedios + promedio;

        if (promedio > promediomasalto) {
            promediomasalto = promedio;
            instrumentomasalto = cuestionario;
        }
        if (promedio < promediomasbajo) {
            promediomasbajo = promedio;
            instrumentomasbajo = cuestionario;
        }
        if (promedio < 3) {
            menorque3++;
        }
        if (promedio > 4) {
            mayorque4++;
        }
        if (promedio >= 4.5 && promedio <= 5) {
            entre45y5++;
        }

        System.out.println("Promedio del cuestionario " + cuestionario + ": " + promedio);
    }

    double promediogeneral = sumapromedios / cantidadcuestionarios;
    double porcentajemenorque3 = menorque3 * 100.0 / cantidadcuestionarios;
    double porcentajemayorque4 = mayorque4 * 100.0 / cantidadcuestionarios;
    double porcentajeentre45y5 = entre45y5 * 100.0 / cantidadcuestionarios;

    System.out.println("a. Promedio general de todos los cuestionarios: " + promediogeneral);
    System.out.println("b. Promedio mas alto: " + promediomasalto + " (cuestionario " + instrumentomasalto + ")");
    System.out.println("c. Promedio mas bajo: " + promediomasbajo + " (cuestionario " + instrumentomasbajo + ")");
    System.out.println("d. Porcentaje con promedio menor a 3: " + porcentajemenorque3 + "%");
    System.out.println("d. Porcentaje con promedio superior a 4: " + porcentajemayorque4 + "%");
    System.out.println("e. Porcentaje con promedio entre 4.5 y 5: " + porcentajeentre45y5 + "%");
}
}
