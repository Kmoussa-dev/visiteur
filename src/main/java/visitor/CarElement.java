package visitor;

import visitor.CarElementVisitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
