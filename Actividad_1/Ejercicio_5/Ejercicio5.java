package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo:");
        double radio = scanner.nextDouble();

        double area = Circulo.calcularArea(radio);
        double longitudCircunferencia = Circulo.calcularLongitudCircunferencia(radio);

        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        
        scanner.close();
    }
}
