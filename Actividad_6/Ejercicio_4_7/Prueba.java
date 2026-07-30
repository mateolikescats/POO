package Ejercicio_4_7;

public class Prueba {
    public static void main(String[] args) {
        Fracción f1 = new Fracción(1, 2);
        Fracción f2 = new Fracción(3, 4);

        System.out.println("Fracción 1: " + f1.toString());
        System.out.println("Fracción 2: " + f2.toString());

        System.out.println("¿Son iguales? " + f1.equals(f2));

        Numérica suma = f1.sumar(f2);
        System.out.println("Suma (1/2 + 3/4): " + suma.toString());

        Numérica resta = f1.restar(f2);
        System.out.println("Resta (1/2 - 3/4): " + resta.toString());

        Numérica multiplicacion = f1.multiplicar(f2);
        System.out.println("Multiplicación (1/2 * 3/4): " + multiplicacion.toString());

        Numérica division = f1.dividir(f2);
        System.out.println("División (1/2 / 3/4): " + division.toString());
        
        // Otro caso de prueba (Fracciones iguales)
        Fracción f3 = new Fracción(2, 4);
        System.out.println("\n¿1/2 es igual a 2/4? " + f1.equals(f3));
    }
}
