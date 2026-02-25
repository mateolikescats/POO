import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
        scanner.close();
    }

    public static void menu(Scanner scanner) {
        System.out.println("\n--- Menú de Figuras Geométricas ---");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Cuadrado");
        System.out.println("4. Triángulo Rectángulo");
        System.out.println("5. Rombo");
        System.out.println("6. Trapecio");
        System.out.println("7. Salir");
        System.out.print("Seleccione una figura para calcular: ");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.print("Ingresa el radio del círculo: ");
                int radio = scanner.nextInt();
                Circulo circulo = new Circulo(radio);
                System.out.println("El área del círculo es = " + circulo.calcularArea());
                System.out.println("El perímetro del círculo es = " + circulo.calcularPerimetro());
                menu(scanner);
                break;
            case 2:
                System.out.print("Ingresa la base del rectángulo: ");
                int baseRect = scanner.nextInt();
                System.out.print("Ingresa la altura del rectángulo: ");
                int alturaRect = scanner.nextInt();
                Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                System.out.println("El área del rectángulo es = " + rectangulo.calcularArea());
                System.out.println("El perímetro del rectángulo es = " + rectangulo.calcularPerimetro());
                menu(scanner);
                break;
            case 3:
                System.out.print("Ingresa el lado del cuadrado: ");
                int ladoCuad = scanner.nextInt();
                Cuadrado cuadrado = new Cuadrado(ladoCuad);
                System.out.println("El área del cuadrado es = " + cuadrado.calcularArea());
                System.out.println("El perímetro del cuadrado es = " + cuadrado.calcularPerimetro());
                menu(scanner);
                break;
            case 4:
                System.out.print("Ingresa la base del triángulo rectángulo: ");
                int baseTri = scanner.nextInt();
                System.out.print("Ingresa la altura del triángulo rectángulo: ");
                int alturaTri = scanner.nextInt();
                TrianguloRectangulo triangulo = new TrianguloRectangulo(baseTri, alturaTri);
                System.out.println("El área del triángulo es = " + triangulo.calcularArea());
                System.out.println("El perímetro del triángulo es = " + triangulo.calcularPerimetro());
                triangulo.determinarTipoTriangulo();
                menu(scanner);
                break;
            case 5:
                System.out.print("Ingresa el lado del rombo: ");
                int ladoRombo = scanner.nextInt();
                System.out.print("Ingresa la diagonal mayor del rombo: ");
                int dMayor = scanner.nextInt();
                System.out.print("Ingresa la diagonal menor del rombo: ");
                int dMenor = scanner.nextInt();
                Rombo rombo = new Rombo(ladoRombo, dMayor, dMenor);
                System.out.println("El área del rombo es = " + rombo.calcularArea());
                System.out.println("El perímetro del rombo es = " + rombo.calcularPerimetro());
                menu(scanner);
                break;
            case 6:
                System.out.print("Ingresa el lado 1 del trapecio: ");
                int lado1Trap = scanner.nextInt();
                System.out.print("Ingresa el lado 2 del trapecio: ");
                int lado2Trap = scanner.nextInt();
                System.out.print("Ingresa la base mayor del trapecio: ");
                int bMayorTrap = scanner.nextInt();
                System.out.print("Ingresa la base menor del trapecio: ");
                int bMenorTrap = scanner.nextInt();
                System.out.print("Ingresa la altura del trapecio: ");
                int alturaTrap = scanner.nextInt();
                Trapecio trapecio = new Trapecio(lado1Trap, lado2Trap, bMayorTrap, bMenorTrap, alturaTrap);
                System.out.println("El área del trapecio es = " + trapecio.calcularArea());
                System.out.println("El perímetro del trapecio es = " + trapecio.calcularPerimetro());
                menu(scanner);
                break;
            case 7:
                System.out.println("Saliendo del programa de figuras...");
                break; // Termina la recursión
            default:
                System.out.println("Opción no válida.");
                menu(scanner); // Llamada recursiva
                break;
        }
    }
}
