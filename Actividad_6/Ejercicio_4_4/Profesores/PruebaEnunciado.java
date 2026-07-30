package Profesores;

/**
 * Esta clase prueba las clase Profesor y ProfesorTitular utilizando el
 * polimorfismo (Ejemplo del enunciado 4.4)
 * @version 1.2/2020
 */
public class PruebaEnunciado {
    /**
     * Método main que crea un Profesor pero instanciando la clase
     * ProfesorTitular.
     */
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimir();
    }
}
