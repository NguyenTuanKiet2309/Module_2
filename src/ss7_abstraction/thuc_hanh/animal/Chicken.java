package ss7_abstraction.thuc_hanh.animal;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Cục tác";
    }

    @Override
    public String howtoEat() {
        return "mổ mổ";
    }
}
