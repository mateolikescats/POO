import java.util.Scanner;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int numeroCuenta;
    enum tipo {AHORROS, CORRIENTE}
    tipo tipoCuenta;
    float saldo = 0;
    float porcentajeInteresMensual = 0; // Porcentaje de interés mensual

    CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + numeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
        System.out.println("Porcentaje de interés mensual = " + porcentajeInteresMensual + "%");
    }

    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }

    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }

    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    // Método propuesto: establecer el porcentaje de interés mensual
    void setPorcentajeInteresMensual(float porcentajeInteresMensual) {
        this.porcentajeInteresMensual = porcentajeInteresMensual;
    }

    // Método propuesto: calcular nuevo saldo aplicando interés
    void aplicarInteresMensual() {
        float interes = saldo * (porcentajeInteresMensual / 100);
        saldo += interes;
        System.out.println("Se ha aplicado un interés de $" + interes + ". El nuevo saldo es $" + saldo);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos de la cuenta bancaria:");
        System.out.print("Nombres del titular: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos del titular: ");
        String apellidos = scanner.nextLine();
        
        System.out.print("Número de cuenta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Tipo de cuenta (AHORROS o CORRIENTE): ");
        tipo tipoCta = tipo.valueOf(scanner.next().toUpperCase());

        CuentaBancaria cuenta = new CuentaBancaria(nombres, apellidos, numero, tipoCta);

        System.out.print("Ingrese el porcentaje de interés mensual: ");
        float interes = scanner.nextFloat();
        cuenta.setPorcentajeInteresMensual(interes);

        menu(cuenta, scanner);
        scanner.close();
    }

    public static void menu(CuentaBancaria cuenta, Scanner scanner) {
        System.out.println("\n--- Menú de Operaciones ---");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Consignar");
        System.out.println("3. Retirar");
        System.out.println("4. Aplicar interés mensual");
        System.out.println("5. Ver información completa");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1:
                cuenta.consultarSaldo();
                menu(cuenta, scanner);
                break;
            case 2:
                System.out.print("Ingrese valor a consignar: ");
                int vConsignar = scanner.nextInt();
                cuenta.consignar(vConsignar);
                menu(cuenta, scanner);
                break;
            case 3:
                System.out.print("Ingrese valor a retirar: ");
                int vRetirar = scanner.nextInt();
                cuenta.retirar(vRetirar);
                menu(cuenta, scanner);
                break;
            case 4:
                cuenta.aplicarInteresMensual();
                menu(cuenta, scanner);
                break;
            case 5:
                cuenta.imprimir();
                menu(cuenta, scanner);
                break;
            case 6:
                System.out.println("Saliendo del sistema bancario...");
                break;
            default:
                System.out.println("Opción no válida.");
                menu(cuenta, scanner);
        }
    }
}
