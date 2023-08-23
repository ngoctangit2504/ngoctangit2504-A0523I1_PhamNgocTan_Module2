package ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal;


import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal.Animal;
import ss7_abstract_class_and_interface.practice.class_animal_and_interface_edible.animal.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : cluck - cluck !";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
