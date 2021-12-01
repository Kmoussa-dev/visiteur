package modele;

import visitor.CarElement;
import visitor.CarElementVisitor;

public class Engine implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
