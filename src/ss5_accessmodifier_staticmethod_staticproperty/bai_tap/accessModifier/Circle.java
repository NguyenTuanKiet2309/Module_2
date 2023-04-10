package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.accessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(double radius) {
        this.radius = radius;
    }
    Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + ", Area = " + getArea() + '}';
    }
}
