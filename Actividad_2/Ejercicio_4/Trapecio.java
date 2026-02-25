public class Trapecio {
    int lado1;
    int lado2;
    int baseMayor;
    int baseMenor;
    int altura;

    public Trapecio(int lado1, int lado2, int baseMayor, int baseMenor, int altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) / 2.0) * altura;
    }

    double calcularPerimetro() {
        return lado1 + lado2 + baseMayor + baseMenor;
    }
}
