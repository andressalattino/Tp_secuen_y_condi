import java.util.Scanner;
import java.util.Locale;
/*
Ejercicio 2: Calculadora de Calorías Quemadas
Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.
 */

public class calorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso , calorias, minutos, ejer;
        ejer=0;
        System.out.println("ingrese su peso en kilogramos: ");
        peso = sc.nextInt();
        System.out.println("ingrese la cantidad de minutos del ejercicio : ");
        minutos = sc.nextInt();
        System.out.println("ingrese el numuro segun corresponda:" +
                "\n1.correr " +
                "\n2 nadar " +
                "\n3 andar en bicicleta ");
        ejer=sc.nextInt();
        if (ejer == 1){
            calorias = 35*minutos;
            System.out.println("usted quemo "+calorias+" calorias");
        }
        else if (ejer == 2){
            calorias = 45*minutos;
            System.out.println("usted quemo "+calorias+" calorias");
        }
        else if (ejer == 3) {
            calorias = 15*minutos;
            System.out.println("usted quemo "+calorias+" calorias");
        }
        else {
        System.out.println("El numero ingresado no es correcto");
        }

    }
}
