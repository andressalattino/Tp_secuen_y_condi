import java.util.Scanner;

public class estadoDeAnimo {
    /*
    Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
    recomiende una actividad basada en su estado de ánimo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int animo;
        System.out.println("¿ Cual es su estado de animo ?" +
                "\n1. Feliz" +
                "\n2 Triste" +
                "\n3 Energetico" +
                "\n4 Relajado ");
    animo = sc.nextInt();
    if (animo == 1) {
        System.out.println("Compartir tu alegría: Pasa tiempo con amigos o familiares, realiza llamadas o envía mensajes positivos a personas que aprecias.");
    } else if (animo == 2) {
        System.out.println("Hacer algo que disfrutes: Ver una película reconfortante, escuchar música que te levante el ánimo, o salir a tomar un poco de aire fresco.");
    }
    else if (animo == 3) {
        System.out.println("Trabajar en metas pendientes: Utiliza tu energía para avanzar en proyectos personales o tareas que has pospuesto.");
    }
    else if (animo == 4) {
        System.out.println("Desconectar de la tecnología: Aprovecha para descansar de las pantallas y disfrutar del momento presente.");
    }
    else {
        System.out.println("error");
    }
    }
}
