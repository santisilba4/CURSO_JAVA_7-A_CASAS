import java.util.Scanner;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Juego de Piedra, Papel o Tijera");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        System.out.println();

        System.out.print("Competidor 1, ingrese su elección: ");
        int eleccion1 = scanner.nextInt();

        System.out.print("Competidor 2, ingrese su elección: ");
        int eleccion2 = scanner.nextInt();

        String ganador;

        if (eleccion1 == eleccion2) {
            ganador = "Empate";
        } else {
            if ((eleccion1 == 0 && eleccion2 == 2) || (eleccion1 == 1 && eleccion2 == 0) || (eleccion1 == 2 && eleccion2 == 1)) {
                ganador = "Competidor 1";
            } else {
                ganador = "Competidor 2";
            }
        }

        System.out.println("El ganador es: " + ganador);

        scanner.close();
    }
}