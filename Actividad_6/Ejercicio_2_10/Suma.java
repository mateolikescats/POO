package Ejercicio_2_10;

public class Suma {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Suma suma = new Suma();
        System.out.println("Suma 2 ints (2+3): " + suma.sumar(2, 3));
        System.out.println("Suma 3 ints (2+3+4): " + suma.sumar(2, 3, 4));
        System.out.println("Suma 2 doubles (2.5+3.5): " + suma.sumar(2.5, 3.5));
        System.out.println("Suma 3 doubles (2.5+3.5+4.5): " + suma.sumar(2.5, 3.5, 4.5));
    }
}
