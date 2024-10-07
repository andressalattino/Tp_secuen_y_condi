import java.util.Scanner;

public class DESCUENTOS {
/*
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double des, preTot;
        int categoria;
        System.out.println("ingrese el valor del total del producto: ");
        preTot = sc.nextDouble();
        System.out.println("ingrese segun corresponda:" +
                "\n1. estudiante" +
                "\n2. adultos" +
                "\n3. jubilados");
        categoria = sc.nextInt();
        if (categoria == 1) {
            des = preTot*0.05;
            preTot= preTot-des;
            System.out.println("El total del producto: " + preTot);
        }
        else if (categoria == 2) {
            des = preTot*0.10;
            preTot= preTot-des;
            System.out.println("El total del producto: " + preTot);
        } else if (categoria == 3) {
            des = preTot*0.15;
            preTot= preTot-des;
            System.out.println("El total del producto: " + preTot);
        }
        else
            System.out.println("El total del producto: " + preTot);
    }
}

