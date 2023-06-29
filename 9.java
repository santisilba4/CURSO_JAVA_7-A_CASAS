import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jugador 1: Elige una opción (0 para piedra, 1 para papel, 2 para tijera):");
        int jugador1 = scanner.nextInt();
        
        System.out.println("Jugador 2: Elige una opción (0 para piedra, 1 para papel, 2 para tijera):");
        int jugador2 = scanner.nextInt();
        
        if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("¡Jugador 1 gana!");
        } else if ((jugador2 == 0 && jugador1 == 2) || (jugador2 == 1 && jugador1 == 0) || (jugador2 == 2 && jugador1 == 1)) {
            System.out.println("¡Jugador 2 gana!");
        } else {
            System.out.println("Es un empate.");
        }
    }
}