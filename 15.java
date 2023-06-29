import java.util.Scanner;

public class CaracteristicasAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la clase del auto (a, b o c):");
        char clase = scanner.next().charAt(0);
        
        String caracteristicas = "";
        
        switch (clase) {
            case 'a':
                caracteristicas = "Clase A: 4 ruedas y un motor.";
                break;
            case 'b':
                caracteristicas = "Clase B: 4 ruedas, un motor, cierre centralizado y aire.";
                break;
            case 'c':
                caracteristicas = "Clase C: 4 ruedas, un motor, cierre centralizado, aire y airbag.";
                break;
            default:
                caracteristicas = "Clase no válida.";
                break;
        }
        
        System.out.println("Características del auto: " + caracteristicas);
    }
}