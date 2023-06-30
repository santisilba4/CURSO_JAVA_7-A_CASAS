import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número del mes (1-12):");
        int mes = scanner.nextInt();
        
        String nombreMes = "";
        int cantidadDias = 0;
        
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                cantidadDias = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                cantidadDias = 28;
                break;
            case 3:
                nombreMes = "Marzo";
                cantidadDias = 31;
                break;
            case 4:
                nombreMes = "Abril";
                cantidadDias = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                cantidadDias = 31;
                break;
            case 6:
                nombreMes = "Junio";
                cantidadDias = 30;
                break;
            case 7:
                nombreMes = "Julio";
                cantidadDias = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                cantidadDias = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                cantidadDias = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                cantidadDias = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                cantidadDias = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                cantidadDias = 31;
                break;
            default:
                System.out.println("Número de mes inválido.");
                System.exit(0);
        }
        
        System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
    }
}
