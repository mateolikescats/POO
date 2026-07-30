package Ejercicio_4_7;

public class Fracción extends Numérica {
    private int numerador;
    private int denominador;

    public Fracción(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador != 0 ? denominador : 1; // Prevenir división por 0
    }

    public int getNumerador() { return numerador; }
    public int getDenominador() { return denominador; }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (ob instanceof Fracción) {
            Fracción f = (Fracción) ob;
            // Comparación de fracciones usando producto cruzado
            return this.numerador * f.denominador == this.denominador * f.numerador;
        }
        return false;
    }

    @Override
    public Numérica sumar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción f = (Fracción) número;
            int nuevoNumerador = this.numerador * f.denominador + f.numerador * this.denominador;
            int nuevoDenominador = this.denominador * f.denominador;
            return simplificar(new Fracción(nuevoNumerador, nuevoDenominador));
        }
        return null;
    }

    @Override
    public Numérica restar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción f = (Fracción) número;
            int nuevoNumerador = this.numerador * f.denominador - f.numerador * this.denominador;
            int nuevoDenominador = this.denominador * f.denominador;
            return simplificar(new Fracción(nuevoNumerador, nuevoDenominador));
        }
        return null;
    }

    @Override
    public Numérica multiplicar(Numérica número) {
        if (número instanceof Fracción) {
            Fracción f = (Fracción) número;
            int nuevoNumerador = this.numerador * f.numerador;
            int nuevoDenominador = this.denominador * f.denominador;
            return simplificar(new Fracción(nuevoNumerador, nuevoDenominador));
        }
        return null;
    }

    @Override
    public Numérica dividir(Numérica número) {
        if (número instanceof Fracción) {
            Fracción f = (Fracción) número;
            int nuevoNumerador = this.numerador * f.denominador;
            int nuevoDenominador = this.denominador * f.numerador;
            return simplificar(new Fracción(nuevoNumerador, nuevoDenominador));
        }
        return null;
    }

    private Fracción simplificar(Fracción f) {
        int mcd = mcd(Math.abs(f.getNumerador()), Math.abs(f.getDenominador()));
        return new Fracción(f.getNumerador() / mcd, f.getDenominador() / mcd);
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }
}
