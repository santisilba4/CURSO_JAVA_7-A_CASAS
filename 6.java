import java.util.Scanner;

public class PuestoTorneo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el puesto obtenido (0-12): ");
        int puesto = scanner.nextInt();

        String categoria;

        if (puesto == 0) {
            categoria = "jardín de infantes";
        } else {
            if (puesto >= 1 && puesto <= 6) {
                categoria = "primaria";
            } else {
                if (puesto >= 7 && puesto <= 12) {
                    categoria = "secundaria";
                } else {
                    categoria = "desconocido";
                }
            }
        }

        System.out.println("El puesto " + puesto + " corresponde a la categoría " + categoria + ".");

        scanner.close();
    }
}