package figurasGeometricas;

public class Triangulo extends FiguraGeometrica {

    private double valor2;

    public Triangulo(final double valor1, final double valor2) {
        super(valor1);
        this.valor2 = valor2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(final double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public double getArea() {
        return (super.valor1 * this.valor2) / 2;
    }

    @Override
    public double getPerimetro() {
        return 2 * this.valor1 + this.valor2;
    }
}
