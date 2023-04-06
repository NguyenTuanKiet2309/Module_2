package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.StaticProperty;

public class Car {
    private String name;
    private String engine;

    public static int NumberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        NumberOfCars++;
    }
    public void display() {
        System.out.println(this.name + " " + this.engine);
    }
}

