package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        double numero = scanner.nextDouble();

        double cuadrado = CalculosNumericos.calcularCuadrado(numero);
        double cubo = CalculosNumericos.calcularCubo(numero);

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
        
        scanner.close();
    }
}
