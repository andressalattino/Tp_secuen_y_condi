import java.util.Scanner;
/*
Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
 */


public class rutina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int nivel;

        System.out.print("Ingrese su nivel de condicion :" +
                "\n3 avanzado" +
                "\n2 intermedio" +
                "\n1 principiante");
        nivel = sc.nextInt();
        if (nivel == 1) {
        System.out.print("Rutina para Principiantes (3 días por semana):" +
                "\nDía 1: Pecho y Tríceps " +
                "\nPress de banca con barra: 3x10 " +
                "\nFondos en paralelas (asistidos si es necesario): 3x8-10" +
                "\nPress inclinado con mancuernas: 3x12 " +
                "\nExtensión de tríceps en polea: 3x12" +
                "\nFlexiones: 3xAMRAP (el máximo de repeticiones posibles)" +
                "\n" +
                "\nDía 2: Piernas " +
                "\nSentadilla en máquina Smith: 4x12 " +
                "\nPrensa de pierna: 3x10-12 " +
                "\nExtensiones de cuádriceps: 3x12 " +
                "\nCurl de piernas: 3x12 " +
                "\nElevación de talones en máquina: 4x15" +
                "\n" +
                "\nDía 3: Espalda y Bíceps " +
                "\nRemo en polea baja: 3x10 " +
                "\nDominadas (asistidas si es necesario): 3xAMRAP " +
                "\nPullover en polea alta: 3x12 " +
                "\nCurl con barra: 3x12 " +
                "\nCurl con mancuernas tipo martillo: 3x12");
        } else if (nivel == 2) {

            System.out.print("Rutina para intermedios (4 días por semana):" +
                    "\nDía 1: Pecho y Tríceps " +
                    "\nPress de banca con barra: 3x10 " +
                    "\nFondos en paralelas (asistidos si es necesario): 3x8-10" +
                    "\nPress inclinado con mancuernas: 3x12 " +
                    "\nExtensión de tríceps en polea: 3x12" +
                    "\nFlexiones: 3xAMRAP (el máximo de repeticiones posibles)" +
                    "\n" +
                    "\nDía 2: Piernas " +
                    "\nSentadilla en máquina Smith: 4x12 " +
                    "\nPrensa de pierna: 3x10-12 " +
                    "\nExtensiones de cuádriceps: 3x12 " +
                    "\nCurl de piernas: 3x12 " +
                    "\nElevación de talones en máquina: 4x15" +
                    "\n" +
                    "\nDía 3: Espalda y Bíceps " +
                    "\nRemo en polea baja: 3x10 " +
                    "\nDominadas (asistidas si es necesario): 3xAMRAP " +
                    "\nPullover en polea alta: 3x12 " +
                    "\nCurl con barra: 3x12 " +
                    "\nCurl con mancuernas tipo martillo: 3x12" +
                    "\n" +
                    "\n Día 4: Hombros y Abdomen" +
                    "\n Press militar con barra: 4x8-10" +
                    "\n Elevaciones laterales con mancuernas: 4x12" +
                    "\n Elevaciones frontales con disco: 4x12" +
                    "\n Face pull (tirón hacia la cara en polea): 3x15" +
                    "\n Plancha abdominal: 3x60 segundos" +
                    "\n Crunches: 3x20" +
                    "\n Ab wheel (rueda abdominal): 3x12");
        } else if (nivel == 3) {
            System.out.print("Rutina para avanzados (6 días por semana):" +
                    "\n Día 1: Pecho" +
                    "\n Press de banca con barra: 5x5 (fuerza)" +
                    "\n Press inclinado con mancuernas: 4x8-10" +
                    "\n Aperturas en banco inclinado con mancuernas: 4x12" +
                    "\n Press de banca en máquina Smith: 4x12" +
                    "\n Fondos en paralelas con peso: 4x10" +
                    "\n Crossover en polea: 3x15" +
                    "\n" +
                    "\n Día 2: Espalda" +
                    "\n Peso muerto: 5x5 (fuerza)" +
                    "\n Dominadas con peso: 4x8-10" +
                    "\n Remo con barra: 4x10" +
                    "\n Remo en máquina con agarre neutro: 4x12" +
                    "\n Pullover en polea alta: 4x12-15" +
                    "\n Face pull: 3x15" +
                    "\n" +
                    "\n Día 3: Piernas" +
                    "\n Sentadilla libre: 5x5" +
                    "\n Prensa de pierna: 4x8-10" +
                    "\n Peso muerto rumano: 4x10" +
                    "\n Zancadas con barra: 4x12 por pierna" +
                    "\n Extensión de cuádriceps: 4x12" +
                    "\n Curl de piernas acostado: 4x12" +
                    "\n" +
                    "\n Día 4: Hombros" +
                    "\n Press militar con barra: 5x5" +
                    "\n Elevaciones laterales con mancuernas: 4x12" +
                    "\n Elevaciones frontales con barra: 4x12" +
                    "\n Press Arnold: 4x10" +
                    "\n Encogimientos con mancuernas (trapecio): 4x12" +
                    "\n" +
                    "\n Día 5: Brazos (Bíceps y Tríceps)" +
                    "\n Curl con barra: 4x8-10" +
                    "\n Curl tipo martillo: 4x10-12" +
                    "\n Curl predicador: 4x12" +
                    "\n Press francés con barra: 4x8-10" +
                    "\n Extensión de tríceps en polea con cuerda: 4x10-12" +
                    "\n Patada de tríceps con mancuerna: 3x15" +
                    "\n" +
                    "\n Día 6: Core y Cardio" +
                    "\n Plancha abdominal: 3x60 segundos" +
                    "\n Elevación de piernas colgado: 3x15" +
                    "\n Crunches con peso: 3x20" +
                    "\n Russian twists con peso: 3x20 por lado" +
                    "\n Cardio: 20-30 minutos de HIIT o cardio moderado");

        }
        else
            System.out.println("ingrese un numero valido");
    }
}