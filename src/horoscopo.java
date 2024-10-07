import java.util.Scanner;
public class horoscopo {
  /*
Ejercicio 1: Generador de Horóscopo
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int dia, mes;
            System.out.print("Ingrese su mes de nacimiento: ");
            mes = sc.nextInt();

            System.out.print("Ingrese su día de nacimiento: ");
            dia = sc.nextInt();
            if ((dia >= 21 && dia <= 31 && mes == 3) || dia > 0 && dia <= 20 && mes == 4 ){
                System.out.println("Aries: Deje de entregar su afecto a quien no lo merece. Si su deseo es comenzar una relación que sea eterna, trate de buscar una persona que tenga los mismo deseos amorosos.");
            }
            else if ((dia >= 21 && dia <= 30 && mes == 4) || dia > 0 && dia <= 21 && mes == 5 ){
                System.out.println("Tauro: Después de tantas idas y vueltas, transitará una etapa de plena felicidad junto a la persona que ama. Valórela como ella se lo merece y demuéstreselo todos los días.");
            }
            else if ((dia >= 22 && dia <= 31 && mes == 5) || dia > 0 && dia <= 21 && mes == 6 ){
                System.out.println("Geminis: Preparase, ya que una discusión por celos sin sentido podría arruinar el día. Tenga fundamentos antes de hacerle algún reclamo a la persona que ama.");
            }
            else if ((dia >= 22 && dia <= 30 && mes == 6) || dia > 0 && dia <= 23 && mes == 7 ){
                System.out.println("Cancer: Vivirá un etapa profunda con esa persona que conoció hace poco tiempo. Prepare su corazón, ya existirá la posibilidad de enamorarse más de lo que piensa.");
            }
            else if ((dia >= 24 && dia <= 31 && mes == 7) || dia > 0 && dia <= 23 && mes == 8 ){
                System.out.println("Leo: Sepa que muchos de los conflictos amorosos continuarán. Tal vez sea la hora para reflexionar, si es que esa relación es grata para su vida amorosa." );
            }
            else if ((dia >= 24 && dia <= 31 && mes == 8) || dia > 0 && dia <= 23 && mes == 9 ){
                System.out.println("Virgo:  Sera un día, donde los requerimientos de su pareja lo asfixiarán. Trate de darle mensajes claros a su enamorado y su situación amorosa mejorará pronto." );
            }
            else if ((dia >= 24 && dia <= 30 && mes == 9) || dia > 0 && dia <= 23 && mes == 10 ){
                System.out.println("Libra: En caso que su pareja se encuentre deprimida, trate de animarla. No la obligue para que cambie de actitud, intente brindarle su apoyo incondicional." );
            }
            else if ((dia >= 24 && dia <= 31 && mes == 10) || dia > 0 && dia <= 22 && mes == 11 ){
                System.out.println("Escorpio: Florecerá un nuevo amor en su vida y que siempre ha buscado. Al fin, abandonará la soledad del pasado que lo atormentaba hace años.");
            }
            else if ((dia >= 23 && dia <= 30 && mes == 11) || dia > 0 && dia <= 22 && mes == 12 ){
                System.out.println("Sagitario: Procure ser más cuidadoso con las palabras que utiliza cuando intenta entablar una conversación con su enamorado. No ofenda la susceptibilidad de su pareja." );
            }
            else if ((dia >= 23 && dia <= 31 && mes == 12) || dia > 0 && dia <= 20 && mes == 1 ){
                System.out.println("Capricornio: Surgen algunas situaciones confusas en el plano afectivo. Trate de comunicarse con su familia con serenidad y pida las explicaciones que necesita.");
            }
            else if ((dia >= 21 && dia <= 31 && mes == 1) || dia > 0 && dia <= 19 && mes == 2 ){
                System.out.println("Acuario: Surgen algunas situaciones confusas en el plano afectivo. Trate de comunicarse con su familia con serenidad y pida las explicaciones que necesita." );
            }
            else if ((dia >= 20 && dia <= 28 && mes == 2) || dia > 0 && dia <= 20 && mes == 3 ){
                System.out.println("Piscis: Intente reflexionar y así podrá cambiar ciertas posturas que le impiden comunicarse correctamente con su pareja. Si no puede solo, busque ayuda profesional.");
            }
            else System.out.println("Fecha invalida.");
        }
        }

