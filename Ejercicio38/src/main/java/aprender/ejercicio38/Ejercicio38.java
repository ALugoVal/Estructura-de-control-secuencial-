/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio38;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio38 {

    public static String signozodiaco(int dia, int mes) {
        int mmdd = mes * 100 + dia;
        String signo;

        if (mmdd >= 1222 || mmdd <= 120) {
            signo = "Capricornio";
        } else if (mmdd <= 219) {
            signo = "Acuario";
        } else if (mmdd <= 319) {
            signo = "Piscis";
        } else if (mmdd <= 420) {
            signo = "Aries";
        } else if (mmdd <= 521) {
            signo = "Tauro";
        } else if (mmdd <= 621) {
            signo = "Géminis";
        } else if (mmdd <= 722) {
            signo = "Cáncer";
        } else if (mmdd <= 823) {
            signo = "Leo";
        } else if (mmdd <= 922) {
            signo = "Virgo";
        } else if (mmdd <= 1022) {
            signo = "Libra";
        } else if (mmdd <= 1121) {
            signo = "Escorpión";
        } else {
            signo = "Sagitario";
        }

        return signo;
    }

   public static int calcularedad(int dianac, int mesnac, int añonac, int diahoy, int meshoy, int añohoy) {
    int edad = añohoy - añonac;

    boolean yaCumplioEsteAnio = (meshoy > mesnac) || (meshoy == mesnac && diahoy >= dianac);
    if (!yaCumplioEsteAnio) {
        edad = edad - 1;
    }

    return edad;
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el dia de nacimiento: ");
    int dia = sc.nextInt();
    System.out.println("Ingrese el mes de nacimiento: ");
    int mes = sc.nextInt();
    System.out.println("Ingrese el año de nacimiento: ");
    int año = sc.nextInt();

    System.out.println("Ingrese el dia de hoy: ");
    int diahoy = sc.nextInt();
    System.out.println("Ingrese el mes de hoy: ");
    int meshoy = sc.nextInt();
    System.out.println("Ingrese el año de hoy: ");
    int añohoy = sc.nextInt();

    String signo = signozodiaco(dia, mes);
    int edad = calcularedad(dia, mes, año, diahoy, meshoy, añohoy);

    System.out.println("Signo del zodiaco: " + signo);
    System.out.println("Edad: " + edad + " años");
}
}
