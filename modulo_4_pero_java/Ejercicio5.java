import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();

        String mensaje;

        if (puesto == 1) {
            mensaje = "Medalla de oro";
        } else if (puesto == 2) {
            mensaje = "Medalla de plata";
        } else if (puesto == 3) {
            mensaje = "Medalla de bronce";
        } else {
            mensaje = "Participaron";
        }

        System.out.println("El puesto " + puesto + " corresponde a: " + mensaje);

        scanner.close();
    }
}
