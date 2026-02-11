package Ejercicio_3;

public class Ejercicio3 {
    public static void main(String[] args) {
        double horasTrabajadas = 48;
        double costoHora = 5000;
        double porcentajeRetencion = 12.5;
        
        double salarioBruto = Empleado.calcularSalarioBruto(horasTrabajadas, costoHora);
        double retencion = Empleado.calcularRetencion(salarioBruto, porcentajeRetencion);
        double salarioNeto = Empleado.calcularSalarioNeto(salarioBruto, retencion);

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retencion en la fuente: $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
