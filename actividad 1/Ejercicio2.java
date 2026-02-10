public class Ejercicio2 {
    public static void main(String[] args) {
    
        double suma = 0;
        double x = 20;
     
        suma = suma + x;
        double y = 40;
        x = x + Math.pow(y, 2);
        suma = suma + (x / y);
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}
