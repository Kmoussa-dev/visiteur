package modele;

import visitor.CarElement;
import visitor.CarElementVisitor;

public class Car implements CarElement {
    CarElement[] elements;

    public CarElement[] getElements() {
        return elements.clone(); // Retourne une copie du tableau de références
    }

    public Car() {
        this.elements = new CarElement[] {
                new Wheel("front left"),
                new Wheel("front right"),
                new Wheel("back left"),
                new Wheel("back right"),
                new Body(),
                new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
            visitor.visit(this);
    }
}
