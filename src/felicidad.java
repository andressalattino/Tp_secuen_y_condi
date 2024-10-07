import java.util.Scanner;

public class felicidad {
/*
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double estres, salud, satisfaccion;
        double total;
        System.out.println("Del 1 al 10 cual diaria que es su satisfacción con la vida ");
        satisfaccion = sc.nextInt();
        System.out.println("Del 1 al 10 cual diaria que es su nivel de estres siendo 10 muy poco estres y 1 mucho estres");
        estres = sc.nextInt();
        System.out.println("Del 1 al 10 cual diaria que es su nivel de salud siendo 10 muy mala salud y 1 muy buena salud");
        salud = sc.nextInt();
        total= (estres+salud+satisfaccion)/3;
        System.out.println("su nivel de felicidad es : " + total);
    }
}
