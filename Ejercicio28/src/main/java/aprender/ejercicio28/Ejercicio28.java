/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio28;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio28 {

    public static double fondosempresa(double monto) {
    double fondos;
    if (monto > 500000) {
        fondos = monto * 0.55;
    } else {
        fondos = monto * 0.70;
    }
    return fondos;
}

public static double prestamobanco(double monto) {
    double banco;
    if (monto > 500000) {
        banco = monto * 0.30;
    } else {
        banco = 0;
    }
    return banco;
}

public static double creditofabricante(double monto) {
    double credito;
    if (monto > 500000) {
        credito = monto * 0.15;
    } else {
        credito = monto * 0.30;
    }
    return credito;
}

public static double interesescredito(double credito) {
    double intereses = credito * 0.20;
    return intereses;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el monto total de la compra: ");
    double monto = sc.nextDouble();

    double fondos = fondosempresa(monto);
    double banco = prestamobanco(monto);
    double credito = creditofabricante(monto);
    double interes = interesescredito(credito);

    System.out.println("Cantidad a invertir de los fondos de la empresa: " + fondos);
    if (monto > 500000) {
        System.out.println("Cantidad prestada por el banco: " + banco);
    }
    System.out.println("Cantidad a pagar a credito al fabricante: " + credito);
    System.out.println("Intereses a pagar al fabricante: " + interes);
}
    }

