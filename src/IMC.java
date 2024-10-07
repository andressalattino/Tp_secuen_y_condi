import java.util.Scanner;

public class IMC {
/*
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).
 */

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float peso, altura, indMM;
System.out.print("ingrese su peso el kilogramos: ");
peso = sc.nextFloat();
System.out.print("ingrese su altura en metros (ej. 1,70): ");
altura = sc.nextFloat();
indMM = peso / (altura * altura);
            if(indMM < 18.5){
                System.out.println("su peso es bajo: Come varias veces al día alimentos ricos en calorías y proteínas para ganar peso de manera saludable.");
            }
            else if(18.5 <= indMM && indMM <= 24.9){
                System.out.println("su peso es normal: Mantén una dieta balanceada y realiza ejercicio regularmente para conservar un peso saludable. ");
            }
            else if(25 <= indMM && indMM <= 29.9){
                System.out.println("tiene sobrepeso : Aumenta la actividad física y consume una dieta equilibrada, rica en nutrientes y baja en azúcares.");
            }
            else if(indMM >= 30){
                System.out.println("tiene obesidad :Consulta a un profesional de la salud para diseñar un plan de pérdida de peso seguro que incluya dieta y ejercicio.");
            }
            else
                System.out.println("Error");
        }
    }
