package Ejercicio_3;

public class Empleado {
    public static double calcularSalarioBruto(double horasTrabajadas, double costoHora) {
        return horasTrabajadas * costoHora;
    }

    public static double calcularRetencion(double salarioBruto, double porcentajeRetencion) {
        return salarioBruto * (porcentajeRetencion / 100);
    }

    public static double calcularSalarioNeto(double salarioBruto, double retencion) {
        return salarioBruto - retencion;
    }
}
