import java.util.Scanner;

public class Habitos {
/*
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hDurm, hEjer, comidas;
        double total;
        System.out.println("¿ cuantas horas duerme por dia ?");
        hDurm = sc.nextInt();
        if (hDurm <=7 || hDurm >= 9 ) {
            System.out.println("usted deberia dormir entre 7 y 9 horas");
        }
        else {
            System.out.println("su horario de sueño es normal y saludable");
        }
        System.out.println("¿ cuantas horas se ejercita por dia ?");
        hEjer = sc.nextInt();
        if (hEjer<2 ) {
            System.out.println("Deberias entrenar mas ");
        }
        else {
            System.out.println("Usted se entrena lo suficiente ");
        }
        System.out.println("¿ cuantas comidas saludables hace por dia ?");
        comidas = sc.nextInt();
        if (comidas != 4) {
            System.out.println("Deberias comer 4 comidas saludables por dia ");
        }
        else {
            System.out.println("su dieta es saludable ");
        }


    }
}
