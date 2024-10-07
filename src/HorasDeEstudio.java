import java.util.Scanner;
import java.util.Locale;

public class HorasDeEstudio {
/*
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int horas, meterias, total;
        System.out.println("Ingrese la cantidad de horas disponibles para estudiar diariamente ");
        horas = sc.nextInt();
        System.out.println("Ingrese la cantidad de meterias ");
        meterias = sc.nextInt();
        total= horas / meterias;
        System.out.println("La cantidad de horas que tiene que estudiar diariamente por materia es: " + total);
    }
}
