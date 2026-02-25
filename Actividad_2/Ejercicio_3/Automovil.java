
import java.util.Scanner;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;
    boolean esAutomatico;
    int multas = 0;

    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.esAutomatico = esAutomatico;
    }

    // ... (rest of the class remains the same until main)

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    int getMotor() {
        return motor;
    }

    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNúmeroPuertas() {
        return numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    tipoColor getColor() {
        return color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    boolean esAutomatico() {
        return esAutomatico;
    }

    int getValorMultas() {
        return multas;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    void setColor(tipoColor color) {
        this.color = color;
    }

    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
            multas++;
        }
    }

    void desacelerar(int decrementoVelocidad) {
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Es automático = " + (esAutomatico ? "Sí" : "No"));
        System.out.println("Valor total de las multas = " + multas);
    }

    boolean tieneMultas() {
        return multas > 0;
    }

    int totalMultas() {
        return multas;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del automóvil:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo (año): ");
        int modelo = scanner.nextInt();
        System.out.print("Motor (litros): ");
        int motor = scanner.nextInt();
        System.out.print("Tipo de combustible (GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL): ");
        tipoCom combustible = tipoCom.valueOf(scanner.next().toUpperCase());
        System.out.print("Tipo de automóvil (CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV): ");
        tipoA tipo = tipoA.valueOf(scanner.next().toUpperCase());
        System.out.print("Número de puertas: ");
        int puertas = scanner.nextInt();
        System.out.print("Cantidad de asientos: ");
        int asientos = scanner.nextInt();
        System.out.print("Velocidad máxima (km/h): ");
        int maxVel = scanner.nextInt();
        System.out.print("Color (BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA): ");
        tipoColor color = tipoColor.valueOf(scanner.next().toUpperCase());
        System.out.print("¿Es automático? (true/false): ");
        boolean esAuto = scanner.nextBoolean();

        Automovil auto1 = new Automovil(marca, modelo, motor, combustible, tipo, puertas, asientos, maxVel, color, esAuto);

        System.out.println("\n--- Automóvil creado exitosamente ---");
        auto1.setVelocidadActual(100); // Valor inicial según enunciado original
        System.out.println("Velocidad inicial establecida en 100 km/h");
        
        menu(auto1, scanner);
        scanner.close();
    }

    // Método recursivo para el menú
    public static void menu(Automovil auto, Scanner scanner) {
        System.out.println("\n--- Menú de Operaciones ---");
        System.out.println("1. Acelerar");
        System.out.println("2. Desacelerar");
        System.out.println("3. Frenar");
        System.out.println("4. Ver estado");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese velocidad a aumentar: ");
                int aumento = scanner.nextInt();
                auto.acelerar(aumento);
                System.out.println("Velocidad actual: " + auto.velocidadActual);
                menu(auto, scanner); // Llamada recursiva
                break;
            case 2:
                System.out.print("Ingrese velocidad a disminuir: ");
                int disminucion = scanner.nextInt();
                auto.desacelerar(disminucion);
                System.out.println("Velocidad actual: " + auto.velocidadActual);
                menu(auto, scanner); // Llamada recursiva
                break;
            case 3:
                auto.frenar();
                System.out.println("Automóvil frenado. Velocidad actual: " + auto.velocidadActual);
                menu(auto, scanner); // Llamada recursiva
                break;
            case 4:
                auto.imprimir();
                menu(auto, scanner); // Llamada recursiva
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break; // Caso base: no se llama a menu(), termina la recursión
            default:
                System.out.println("Opción no válida.");
                menu(auto, scanner); // Llamada recursiva
                break;
        }
    }
}
