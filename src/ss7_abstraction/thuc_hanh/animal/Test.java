package ss7_abstraction.thuc_hanh.animal;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args) {
        Animal[] a = new Animal[2];
        a[0] = new Tiger();
        a[1] = new Chicken();
        for (Animal animal : a) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
            if (animal instanceof Tiger) {
                IEdible I = (Tiger) animal;
                System.out.println(I.howtoEat());
            }
        }
    }
}
