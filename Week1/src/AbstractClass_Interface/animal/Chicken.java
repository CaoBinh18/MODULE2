package AbstractClass_Interface.animal;

import AbstractClass_Interface.edible.Edibla;

public class Chicken extends Animal implements Edibla {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
