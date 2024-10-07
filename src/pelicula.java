import java.util.Scanner;

public class pelicula {
/*
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gen;
        System.out.print("ingrese su genero de peliculas favorito:" +
                "\n1. accion " +
                "\n2. comedia" +
                "\n3. drama" +
                "\n4. ciencia ficcion ");
        gen = sc.nextInt();
        if (gen == 1) {
            System.out.print("Acción: Mad Max: Fury Road (2015)");
        } else if (gen == 2) {
            System.out.print("Comedia: Son como niños (2010)");
        }
        else if (gen == 3) {
            System.out.print("Drama: Fury Road (2015)");
        } else if (gen == 4) {
            System.out.print("Ciencia Ficción: Blade Runner 2049 (2017)");
        }
        else
            System.out.println("Error");
    }
}

