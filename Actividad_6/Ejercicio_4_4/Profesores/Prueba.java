package Profesores;

public class Prueba {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        Profesor profesor2 = (Profesor) profesor1;
        profesor2.imprimir();

        // El resultado de la ejecución es "Es un profesor titular." debido al polimorfismo, 
        // ya que el objeto subyacente instanciado en memoria es un ProfesorTitular. 
        // A pesar del casting, en tiempo de ejecución se invoca el método sobreescrito de la subclase.
    }
}
