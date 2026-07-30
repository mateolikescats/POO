package Profesores;

/**
 * Esta clase prueba las clases Profesor y ProfesorTitular utilizando
 * métodos polimórficos
 * @version 1.2/2020
 */
public class Prueba3 {
    /**
     * Método main que crea un ProfesorTitular pero en un objeto tipo
     * Profesor.
     * En el texto original este código no compilaba intencionalmente,
     * pero se ha aplicado un casteo para corregirlo como solución.
     */
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        ((ProfesorTitular) profesor1).imprimirAños();
    }
}
