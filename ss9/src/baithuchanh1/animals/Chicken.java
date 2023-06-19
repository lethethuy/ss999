package baithuchanh1.animals;

import baithuchanh1.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "fried";
    }
}
