package visitor;

import modele.Body;
import modele.Car;
import modele.Engine;
import modele.Wheel;

public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Body body);
    void visit(Engine engine);
    void visit(Car car);
}
