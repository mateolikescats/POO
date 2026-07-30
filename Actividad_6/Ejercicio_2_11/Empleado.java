package Ejercicio_2_11;

public class Empleado {
    private int identificador;
    private String nombre;
    private String apellidos;
    private int edad;

    public Empleado() {
        this.identificador = 100;
        this.nombre = "Nuevo empleado";
        this.apellidos = "Nuevo empleado";
        this.edad = 18;
    }

    public Empleado(int identificador, String nombre, String apellidos, int edad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("ID: " + identificador + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado(101, "Juan", "Perez", 30);
        emp1.imprimir();
        emp2.imprimir();
    }
}
