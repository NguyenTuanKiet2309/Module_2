package ss6_inheritance.bai_tap.triangle;

import java.lang.ref.PhantomReference;

public class Shape {
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + '}';
    }
}
