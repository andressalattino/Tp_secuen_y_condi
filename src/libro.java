import java.util.Scanner;

public class libro {
/*
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen;
        System.out.print("ingrese su genero de peliculas favorito:" +
                "\n1. fantasia " +
                "\n2. misterio" +
                "\n3. romance" +
                "\n4. ciencia ficcion ");
        gen = sc.nextInt();
        if (gen == 1) {
            System.out.print("Fantasía: El nombre del viento de Patrick Rothfus");
        } else if (gen == 2) {
            System.out.print("Misterio: El código Da Vinci de Dan Brown");
        }
        else if (gen == 3) {
            System.out.print("Romance: Orgullo y prejuicio de Jane Austen");
        } else if (gen == 4) {
            System.out.print("Ciencia ficción: Dune de Frank Herbert");
        }
        else
            System.out.println("Error");
    }
}

