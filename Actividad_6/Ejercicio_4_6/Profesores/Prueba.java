package Profesores;
import java.util.*;

public class Prueba {
    Vector<Profesor> profesores;

    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.profesores = new Vector<Profesor>();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesor2 = new ProfesorTitular();
        
        prueba.profesores.add(profesor1);
        prueba.profesores.add(profesor2);
        
        for(int i = 0; i < prueba.profesores.size(); i++) {
            Profesor p = (Profesor) prueba.profesores.elementAt(i);
            p.imprimir();
        }
        
        // Resultado esperado:
        // Es un profesor.
        // Es un profesor titular.
        
        // Explicación:
        // El bucle recorre el vector que contiene elementos del tipo base `Profesor`.
        // En la primera iteración, `p` hace referencia a un objeto `Profesor`, llamando a su método original.
        // En la segunda iteración, `p` hace referencia a un objeto `ProfesorTitular`. Debido al polimorfismo,
        // al invocar `imprimir()` se ejecuta la versión redefinida en la subclase, a pesar de que la referencia
        // sea de tipo `Profesor`.
    }
}
