package ss7_abstraction.bai_tap.interface_resizeable;

public class Square extends Shape implements IResizeable {
    private double size = 1.0;

    public Square() {

    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void resize(double percent) {
        this.size = size * percent + size;
    }

    @Override
    public String toString() {
        return "A Square with size=" + size;
    }
}
