public class Parallelogram implements Figure {
    // Длина стороны
    private final double a;
    // Высота
    private final double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}