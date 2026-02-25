
import java.util.Scanner;

public class Persona {
    String nombre; 
    String apellidos; 
    String numeroDocumentoIdentidad; 
    int anioNacimiento; 
    String paisNacimiento;
    char genero;

    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        String nombre, apellidos, numeroDocumentoIdentidad, paisNacimiento;
        int anioNacimiento;
        char genero;

        System.out.println("Ingrese los datos de la primera persona:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("Número de documento de identidad: ");
        numeroDocumentoIdentidad = scanner.nextLine();
        System.out.print("Año de nacimiento: ");
        anioNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        System.out.print("País de nacimiento: ");
        paisNacimiento = scanner.nextLine();
        System.out.print("Género (H/M): ");
        genero = scanner.next().charAt(0);
        scanner.nextLine(); // Consumir salto de línea

        Persona p1 = new Persona(nombre, apellidos, numeroDocumentoIdentidad, anioNacimiento, paisNacimiento, genero);

        System.out.println("\nIngrese los datos de la segunda persona:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("Número de documento de identidad: ");
        numeroDocumentoIdentidad = scanner.nextLine();
        System.out.print("Año de nacimiento: ");
        anioNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        System.out.print("País de nacimiento: ");
        paisNacimiento = scanner.nextLine();
        System.out.print("Género (H/M): ");
        genero = scanner.next().charAt(0);

        Persona p2 = new Persona(nombre, apellidos, numeroDocumentoIdentidad, anioNacimiento, paisNacimiento, genero);

        System.out.println("\nImprimiendo datos de las personas...");
        p1.imprimir();
        p2.imprimir();

        scanner.close();
    }
}
