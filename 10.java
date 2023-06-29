import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        
        int mayor = num1;
        
        if (num2 > mayor && num2 > num3) {
            mayor = num2;
        }
        
        if (num3 > mayor && num3 > num2) {
            mayor = num3;
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}