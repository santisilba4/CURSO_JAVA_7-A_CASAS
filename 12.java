import java.util.Scanner;

public class DeterminarDocena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        
        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número " + numero + " pertenece a la primera docena (1-12).");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número " + numero + " pertenece a la segunda docena (13-24).");
            } else {
                System.out.println("El número " + numero + " pertenece a la tercera docena (25-36).");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}