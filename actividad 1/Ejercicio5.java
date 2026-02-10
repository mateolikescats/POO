import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double longitudCircunferencia = 2 * Math.PI * radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        
        scanner.close();
    }
}
