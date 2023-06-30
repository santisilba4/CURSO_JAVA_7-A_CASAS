import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        String parentesco;

        switch (categoria.toLowerCase()) {
            case "a":
                parentesco = "hijo";
                break;
            case "b":
                parentesco = "padres";
                break;
            case "c":
                parentesco = "abuelos";
                break;
            default:
                parentesco = "desconocido";
                break;
        }

        System.out.println("La categoría " + categoria + " corresponde a " + parentesco + ".");

        scanner.close();
    }
}
