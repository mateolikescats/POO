package Ejercicio_1;

public class Edades {
    public static int calcularEdadAlberto(int edadJuan) {
        return 2 * edadJuan / 3;
    }

    public static int calcularEdadAna(int edadJuan) {
        return 4 * edadJuan / 3;
    }

    public static int calcularEdadMama(int edadJuan, int edadAlberto, int edadAna) {
        return edadJuan + edadAlberto + edadAna;
    }
}
