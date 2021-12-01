package visitor.impl;

import modele.Body;
import modele.Car;
import modele.Engine;
import modele.Wheel;
import visitor.CarElement;
import visitor.CarElementVisitor;

public class CarElementDoVisitor implements CarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my "+ wheel.getName());
    }
    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }
    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("\nStarting my car");
        for(CarElement carElement : car.getElements()) {
            carElement.accept(this);
        }
        System.out.println("Started car");
    }
}
