import java.util.Scanner;

public class canciones {
/*
EEscribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen;
        System.out.print("ingrese su estado de ánimo:" +
                "\n1. feliz " +
                "\n2. triste" +
                "\n3. enérgico" +
                "\n4. relajado");
        gen = sc.nextInt();
        if (gen == 1) {
            System.out.print("Happy – Pharrell Williams");
        } else if (gen == 2) {
            System.out.print("Creep– Radiohead");
        }
        else if (gen == 3) {
            System.out.print("  Born to Run – Bruce Springsteen");
        } else if (gen == 4) {
            System.out.print("I Wish It Would Rain Down Phil Collins");
        }
        else
            System.out.println("Error");
    }
}

