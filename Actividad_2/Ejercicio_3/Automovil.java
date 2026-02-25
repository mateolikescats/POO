
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
        Automovil auto1 = new Automovil("Ford",2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO,5,6,250,tipoColor.NEGRO, false);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
    }
}
