public class Ejercicio3 {
    public static void main(String[] args) {

        double horasTrabajadas = 48;
        double costoHora = 5000;
        
        double salarioBruto = horasTrabajadas * costoHora;
        double retencion = salarioBruto * (12.5 / 100);
        double salarioNeto = salarioBruto - retencion;

        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Retencion en la fuente: $" + retencion);
        System.out.println("Salario Neto: $" + salarioNeto);
    }
}
