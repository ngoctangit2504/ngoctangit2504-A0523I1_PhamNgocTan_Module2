package ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal;

import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Apple;
import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Fruit;
import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
        }


        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
