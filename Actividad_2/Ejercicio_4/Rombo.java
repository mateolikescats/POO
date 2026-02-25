public class Rombo {
    int lado;
    int diagonalMayor;
    int diagonalMenor;

    public Rombo(int lado, int diagonalMayor, int diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    double calcularPerimetro() {
        return 4.0 * lado;
    }
}
