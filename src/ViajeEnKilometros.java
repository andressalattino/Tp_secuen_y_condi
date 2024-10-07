import java.util.Scanner;
import java.util.Locale;

public class ViajeEnKilometros {
/*
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        float costoComb, Kilometros, combustible;
        double total;
        System.out.print("ingrese cantidad de kilometros del viaje ");
        Kilometros = sc.nextFloat();
        System.out.print("ingrese cantidad de kilometros por litro de combustible ");
        combustible = sc.nextFloat();
        System.out.print("ingrese el precio del litro de combustible ");
        costoComb = sc.nextFloat();
        total = (Kilometros * combustible) * costoComb;
System.out.print("el costo total del viaje es: $ " + total);
    }
}

