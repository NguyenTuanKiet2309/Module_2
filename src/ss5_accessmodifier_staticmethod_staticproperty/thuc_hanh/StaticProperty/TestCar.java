package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.StaticProperty;

import javax.sound.midi.Soundbank;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("RangeRover", "6 xi lanh");
        Car car2 = new Car("Poscher", "8 xi lanh");
        System.out.println(car1.NumberOfCars);
        System.out.println(car2.NumberOfCars);
        car1.display();
        car2.display();
    }
}
