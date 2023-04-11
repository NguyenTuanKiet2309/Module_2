package ss7_abstraction.thuc_hanh.animal;

public class Tiger extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Grrrr";
    }

    @Override
    public String howtoEat() {
        return "nhoằm nhoằm";
    }
}
