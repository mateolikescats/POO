package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de Juan:");
        int edJuan = scanner.nextInt();

        int edAlber = Edades.calcularEdadAlberto(edJuan);
        int edAna = Edades.calcularEdadAna(edJuan);
        int edMama = Edades.calcularEdadMama(edJuan, edAlber, edAna);

        System.out.println("LAS EDADES SON:");
        System.out.println("ALBERTO = " + edAlber);
        System.out.println("JUAN = " + edJuan);
        System.out.println("ANA = " + edAna);
        System.out.println("MAMA = " + edMama);
        
        scanner.close();
    }
}
