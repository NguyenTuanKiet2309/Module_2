package ss4_class_object.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }

    public double getc() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(getb(), 2)) - (4 * getA() * getc());
    }

    public double getRoot1() {
        return (-getb() + Math.sqrt(Math.pow(getb(), 2) - 4 * getA() * getc())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getb() - Math.sqrt(Math.pow(getb(), 2) - 4 * getA() * getc())) / (2 * getA());
    }

}


