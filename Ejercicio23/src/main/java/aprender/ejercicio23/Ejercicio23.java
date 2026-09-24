/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aprender.ejercicio23;
import java.util.Scanner;

/**
 *
 * @author srpet
 */
public class Ejercicio23 {

    public static int bultosdeharina(int kilosharina) {
    int bultos = kilosharina / 24;
    return bultos;
}
   public static int harinasobrante(int kilosharina, int bultos) {
    int kilossobrantes = kilosharina - bultos * 24;
    return kilossobrantes;
}
  public static int cajasdeaceite(int litrosdeaceite) {
    int cajas = litrosdeaceite / 15;
    return cajas;
}
   public static int aceitesobrante(int litrosdeaceite, int cajas) {
    int litrossobrante = litrosdeaceite - cajas * 15;
    return litrossobrante;
}
   public static double ingresototal(int bultos, int cajas, int kilossobrantes, int litrossobrantes,
                                  double b1, double b2, double b3, double b4) {
    double ingresobultos = bultos * b1;
    double ingresocajas = cajas * b2;
    double ingresoharinasuelta = kilossobrantes * b3;
    double ingresoaceitesuelto = litrossobrantes * b4;

    double total = ingresobultos + ingresocajas + ingresoharinasuelta + ingresoaceitesuelto;
    return total;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los kilogramos de harina (M): ");
    int kilosharina = sc.nextInt();
    System.out.println("Ingrese los litros de aceite (N): ");
    int litrosaceite = sc.nextInt();
    System.out.println("Ingrese el precio del bulto de harina (B1): ");
    double b1 = sc.nextDouble();
    System.out.println("Ingrese el precio de la caja de aceite (B2): ");
    double b2 = sc.nextDouble();
    System.out.println("Ingrese el precio del kilo de harina al detal (B3): ");
    double b3 = sc.nextDouble();
    System.out.println("Ingrese el precio del litro de aceite al detal (B4): ");
    double b4 = sc.nextDouble();

    int bultos = bultosdeharina(kilosharina);
    int sobranteharina = harinasobrante(kilosharina, bultos);
    int cajas = cajasdeaceite(litrosaceite);
    int sobranteaceite = aceitesobrante(litrosaceite, cajas);

    double total = ingresototal(bultos, cajas, sobranteharina, sobranteaceite, b1, b2, b3, b4);

    System.out.println("Ingreso total por tonelada de maiz: " + total);
}
}


