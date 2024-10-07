import java.util.Scanner;
import java.util.Random;

public class juegoPiePaTij {
/*
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.

 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int resultado;
        System.out.println("vamos a jugar: ");
        System.out.print("Ingrese:" +
                "\n1. si quiere elegir piedra " +
                "\n2. si quiere elegir papel" +
                "\n3. si quiere elegir tijeras ");
        resultado = sc.nextInt();

        int numeroAzar = random.nextInt(3) + 1;

        if (resultado == 1) {
            if (numeroAzar == 2) {
                System.out.println("usted pierde");
            }
            else if (numeroAzar == 1) {
                System.out.println("empate");
            }
            else
                System.out.println("usted gana");
            }
        else if (resultado == 2) {
            if (numeroAzar == 3) {
                System.out.println("usted pierde");
            }
            else if (numeroAzar == 2) {
                System.out.println("empate");
            }
            else  {
                System.out.println("usted gana");
            }

        }
    else if (resultado == 3) {
            if (numeroAzar == 1) {
                System.out.println("usted pierde");
            }
            else if (numeroAzar == 3) {
                System.out.println("empate");
            }
            else  {
                System.out.println("usted gana");
            }

        }
        }

    }
