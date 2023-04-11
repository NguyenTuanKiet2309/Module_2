package ss7_abstraction.bai_tap.interface_colorable;

public class Square extends Shape implements IColorable {
    private double size = 1.0;

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public Square() {

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Square(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "A Square with size=" + size + " area=" + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println(getColor() + " all four sides");
    }

}
