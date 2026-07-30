package Ejercicio_2_11;

public class Caja {
    private double base;
    private double anchura;
    private double altura;
    private String tipo;

    public Caja(double base, double anchura, double altura) {
        this.base = base;
        this.anchura = anchura;
        this.altura = altura;
        this.tipo = "Desconocido";
    }

    public Caja() {
        this.base = 0;
        this.anchura = 0;
        this.altura = 0;
        this.tipo = "Desconocido";
    }

    public Caja(double longitud) {
        this.base = longitud;
        this.anchura = longitud;
        this.altura = longitud;
        this.tipo = "Desconocido";
    }

    public Caja(double base, double anchura, double altura, String tipo) {
        this(base, anchura, altura);
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("Base: " + base + ", Anchura: " + anchura + ", Altura: " + altura + ", Tipo: " + tipo);
    }

    public static void main(String[] args) {
        Caja caja1 = new Caja(10.5, 20.0, 15.5);
        Caja caja2 = new Caja();
        Caja caja3 = new Caja(12.0);
        Caja caja4 = new Caja(10.0, 10.0, 10.0, "Cubo");

        caja1.imprimir();
        caja2.imprimir();
        caja3.imprimir();
        caja4.imprimir();
    }
}
