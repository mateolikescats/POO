import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        double numero = scanner.nextDouble();

        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        
        scanner.close();
    }
}
