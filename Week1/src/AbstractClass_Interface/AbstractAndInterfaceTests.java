package AbstractClass_Interface;

import AbstractClass_Interface.animal.Animal;
import AbstractClass_Interface.animal.Chicken;
import AbstractClass_Interface.animal.Tiger;
import AbstractClass_Interface.edible.Edibla;
import AbstractClass_Interface.fruit.Apple;
import AbstractClass_Interface.fruit.Fruit;
import AbstractClass_Interface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edibla edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
