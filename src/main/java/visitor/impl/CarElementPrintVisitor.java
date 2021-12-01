package visitor.impl;

import modele.Body;
import modele.Car;
import modele.Engine;
import modele.Wheel;
import visitor.CarElement;
import visitor.CarElementVisitor;

public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting "+ wheel.getName() + " wheel");
    }
    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }
    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("\nVisiting car");
        for(CarElement element : car.getElements()) {
            element.accept(this);
        }
        System.out.println("Visited car");
    }
}
