/**
 * Esta clase define objetos de tipo Pedido de un restaurante que consta
 * de diferentes platos y que tiene un determinado valor.
 * @version 1.2/2020
 */
public class Pedido {
    /**
     * Método que tiene como parámetros los elementos que conforman
     * un pedido con un primer plato, su bebida y sus costos
     * correspondientes. El método calcula el costo total del pedido y
     * muestra en pantalla los datos del pedido y su costo total.
     * @param primerPlato Parámetro que define el nombre del primer
     * plato que conforma el pedido
     * @param costoPrimerPlato Parámetro que define el costo del
     * primer plato que conforma el pedido
     * @param bebida Parámetro que define el nombre de la bebida que
     * conforma el pedido
     * @param costoBebida Parámetro que define el costo de la bebida
     * que conforma el pedido
     */
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " y " + bebida + " es = $" + total);
    }

    /**
     * Método sobrecargado que tiene como parámetros los elementos
     * que conforman un pedido con un primer plato, un segundo plato,
     * su bebida y sus costos correspondientes. El método calcula el costo
     * total del pedido y muestra en pantalla los datos del pedido y su
     * costo total.
     * @param primerPlato Parámetro que define el nombre del primer
     * plato que conforma el pedido
     * @param costoPrimerPlato Parámetro que define el costo del
     * primer plato que conforma el pedido
     * @param segundoPlato Parámetro que define el nombre del
     * segundo plato que conforma el pedido
     * @param costoSegundoPlato Parámetro que define el costo del
     * segundo plato que conforma el pedido
     * @param bebida Parámetro que define el nombre de la bebida que
     * conforma el pedido
     * @param costoBebida Parámetro que define el costo de la bebida
     * que conforma el pedido
     */
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " + " + bebida + " es = $" + total);
    }

    /**
     * Método sobrecargado que tiene como parámetros los elementos
     * que conforman un pedido con un primer plato, segundo plato, su
     * bebida, postre y sus costos correspondientes. El método calcula el
     * costo total del pedido y muestra en pantalla los datos del pedido y
     * su costo total.
     * @param primerPlato Parámetro que define el nombre del primer
     * plato que conforma el pedido
     * @param costoPrimerPlato Parámetro que define el costo del
     * primer plato que conforma el pedido
     * @param segundoPlato Parámetro que define el nombre del
     * segundo plato que conforma el pedido
     * @param costoSegundoPlato Parámetro que define el costo del
     * segundo plato que conforma el pedido
     * @param postre Parámetro que define el nombre del postre que
     * conforma el pedido
     * @param costoPostre Parámetro que define el costo del postre que
     * conforma el pedido
     * @param bebida Parámetro que define el nombre de la bebida que
     * conforma el pedido
     * @param costoBebida Parámetro que define el costo de la bebida
     * que conforma el pedido
     */
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String postre, double costoPostre, String bebida, double costoBebida) {
        double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
        System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " + " + bebida + " + " + postre + " es = $" + total);
    }

    /**
     * Método main que crea tres diferentes tipos de pedidos en el
     * restaurante.
     */
    public static void main (String args[]) {
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sancocho", 5000, "Gaseosa", 2000);
        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Crema de verduras", 5000, "Churrasco", 6000, "Gaseosa", 2000);
        Pedido pedido3 = new Pedido();
        pedido3.calcularPedido("Crema de espinacas", 5000, "Salmón", 10000, "Tiramisú", 5000, "Gaseosa", 2000);
    }
}
