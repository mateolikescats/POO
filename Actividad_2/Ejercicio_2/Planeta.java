import java.util.Scanner;

public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipo;
    boolean esObservable = false;
    double periodoOrbital; // En años
    double periodoRotacion; // En días

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // ... (rest of methods unchanged)

    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
        System.out.println("Periodo orbital = " + periodoOrbital + " años");
        System.out.println("Periodo de rotación = " + periodoRotacion + " días");
    }

    double calcularDensidad() {
        return masa/volumen;
    }

    boolean esPlanetaExterior(){
        float limite = (float) (149597870 * 3.4);
        if (distanciaSol > limite) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creación del Planeta 1:");
        System.out.print("Nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Cantidad de satélites: ");
        int 
        satelites1 = scanner.nextInt();
        System.out.print("Masa (kg): ");
        double masa1 = scanner.nextDouble();
        System.out.print("Volumen (km^3): ");
        double volumen1 = scanner.nextDouble();
        System.out.print("Diámetro (km): ");
        int diametro1 = scanner.nextInt();
        System.out.print("Distancia al sol (km): ");
        int distancia1 = scanner.nextInt();
        System.out.print("Tipo de planeta (GASEOSO, TERRESTRE, ENANO): ");
        tipoPlaneta tipo1 = tipoPlaneta.valueOf(scanner.next().toUpperCase());
        System.out.print("¿Es observable? (true/false): ");
        boolean observable1 = scanner.nextBoolean();
        System.out.print("Periodo orbital (años): ");
        double orbital1 = scanner.nextDouble();
        System.out.print("Periodo de rotación (días): ");
        double rotacion1 = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea

        Planeta p1 = new Planeta(nombre1, satelites1, masa1, volumen1, diametro1, distancia1, tipo1, observable1, orbital1, rotacion1);
        
        System.out.println("\n--- Datos del Planeta 1 ---");
        p1.imprimir();
        System.out.println("Densidad del planeta = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());
        System.out.println();
        
        System.out.println("Creación del Planeta 2:");
        System.out.print("Nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.print("Cantidad de satélites: ");
        int satelites2 = scanner.nextInt();
        System.out.print("Masa (kg): ");
        double masa2 = scanner.nextDouble();
        System.out.print("Volumen (km^3): ");
        double volumen2 = scanner.nextDouble();
        System.out.print("Diámetro (km): ");
        int diametro2 = scanner.nextInt();
        System.out.print("Distancia al sol (km): ");
        int distancia2 = scanner.nextInt();
        System.out.print("Tipo de planeta (GASEOSO, TERRESTRE, ENANO): ");
        tipoPlaneta tipo2 = tipoPlaneta.valueOf(scanner.next().toUpperCase());
        System.out.print("¿Es observable? (true/false): ");
        boolean observable2 = scanner.nextBoolean();
        System.out.print("Periodo orbital (años): ");
        double orbital2 = scanner.nextDouble();
        System.out.print("Periodo de rotación (días): ");
        double rotacion2 = scanner.nextDouble();        scanner.nextLine(); // Consumir salto de línea pendiente antes de leer nombre2
        Planeta p2 = new Planeta(nombre2, satelites2, masa2, volumen2, diametro2, distancia2, tipo2, observable2, orbital2, rotacion2);
        
        System.out.println("\n--- Datos del Planeta 2 ---");
        p2.imprimir();
        System.out.println("Densidad del planeta = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());

        menu(p1, p2, scanner);
        scanner.close();
    }

    public static void menu(Planeta p1, Planeta p2, Scanner scanner) {
        System.out.println("\n--- Menú de Planetas ---");
        System.out.println("1. Consultar Planeta 1 (" + p1.nombre + ")");
        System.out.println("2. Consultar Planeta 2 (" + p2.nombre + ")");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        if (opcion == 3) {
            System.out.println("Saliendo...");
            return;
        }

        Planeta seleccionado = (opcion == 1) ? p1 : (opcion == 2) ? p2 : null;
        if (seleccionado != null) {
            subMenu(seleccionado, p1, p2, scanner);
        } else {
            System.out.println("Opción inválida.");
            menu(p1, p2, scanner);
        }
    }

    public static void subMenu(Planeta p, Planeta p1, Planeta p2, Scanner scanner) {
        System.out.println("\n--- Operaciones sobre " + p.nombre + " ---");
        System.out.println("1. Calcular Densidad");
        System.out.println("2. Determinar si es Planeta Exterior");
        System.out.println("3. Imprimir información");
        System.out.println("4. Volver al menú principal");
        System.out.print("Seleccione una opción: ");
        
        int op = scanner.nextInt();
        switch(op) {
            case 1:
                System.out.println("Densidad: " + p.calcularDensidad());
                subMenu(p, p1, p2, scanner);
                break;
            case 2:
                System.out.println("Es planeta exterior: " + p.esPlanetaExterior());
                subMenu(p, p1, p2, scanner);
                break;
            case 3:
                p.imprimir();
                subMenu(p, p1, p2, scanner);
                break;
            case 4:
                menu(p1, p2, scanner);
                break;
            default:
                System.out.println("Opción inválida");
                subMenu(p, p1, p2, scanner);
        }
    }
}
