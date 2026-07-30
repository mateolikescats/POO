/**
 * Esta clase define objetos de tipo ArtículoCientífico con un título,
 * autor, tres palabras clave, año de publicación y un resumen.
 * @version 1.2/2020
 */
public class ArticuloCientifico {
    String título; // Atributo que define el título de un artículo científico
    String autor; // Atributo que define el autor de un artículo científico
    // Atributo que define las palabras clave de un artículo científico
    String[] palabrasClaves = new String[3];
    String publicación; /* Atributo que define la publicación que incluye
    el artículo científico */
    int año; /* Atributo que define el año de publicación de un artículo
    científico */
    String resumen; /* Atributo que define el resumen de un artículo
    científico */

    /**
     * Constructor de la clase ArtículoCientífico
     * @param título Parámetro que define el título del artículo científico
     * @param autor Parámetro que define el autor del artículo científico
     */
    public ArticuloCientifico(String título, String autor) {
        this.título = título;
        this.autor = autor;
    }

    /**
     * Constructor sobrecargado de la clase ArtículoCientífico
     * @param título Parámetro que define el título del artículo científico
     * @param autor Parámetro que define el autor del artículo científico
     * @param palabrasClaves Parámetro que define un listado de
     * palabras clave para el artículo científico
     * @param publicación Parámetro que define el nombre de la
     * publicación a la que pertenece el artículo científico
     * @param año Parámetro que define el año de publicación del
     * artículo científico
     */
    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
        this(título, autor); // Invoca al constructor sobrecargado
        this.palabrasClaves = palabrasClaves;
        this.publicación = publicación;
        this.año = año;
    }

    /**
     * Constructor sobrecargado de la clase ArtículoCientífico
     * @param título Parámetro que define el título del artículo científico
     * @param autor Parámetro que define el autor del artículo científico
     * @param palabrasClaves Parámetro que define un listado de
     * palabras clave para el artículo científico
     * @param publicación Parámetro que define el nombre de la
     * publicación a la que pertenece el artículo científico
     * @param año Parámetro que define el año de publicación del
     * artículo científico
     * @param resumen Parámetro que define el resumen del artículo
     * científico
     */
    public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año, String resumen) {
        this(título, autor, palabrasClaves, publicación, año); /* Invoca al
        constructor sobrecargado */
        this.resumen = resumen;
    }

    /**
     * Método que imprime en pantalla los datos de un artículo científico
     */
    public void imprimir() {
        System.out.println("Título del artículo = " + título);
        System.out.println("Autor del artículo = " + autor);
        System.out.println("Palabras clave = ");
        // Recorre el array para imprimir cada palabra clave
        for (int i = 0; i < palabrasClaves.length; i++) {
            System.out.println(palabrasClaves[i]);
        }
        System.out.println("Publicación = " + publicación);
        System.out.println("Año = " + año);
        System.out.println("Resumen = " + resumen);
    }

    /**
     * Método main que instancia un artículo científico y muestra sus
     * datos en pantalla
     */
    public static void main (String args[]) {
        String[] palabras = {"Física", "Espacio", "Tiempo"};
        ArticuloCientifico artículo = new ArticuloCientifico("La teoría especial de la relatividad", "Albert Einstein", palabras, "Anales de Física", 1913, "Las leyes de la física son las mismas en todos los sistemas de referencia inerciales.");
        artículo.imprimir();
    }
}
