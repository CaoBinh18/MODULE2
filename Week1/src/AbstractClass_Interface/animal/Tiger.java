package AbstractClass_Interface.animal;

import AbstractClass_Interface.edible.Edibla;

public class Tiger extends Animal implements Edibla {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
