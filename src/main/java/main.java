import modele.Car;
import visitor.CarElementVisitor;
import visitor.impl.CarElementDoVisitor;
import visitor.impl.CarElementPrintVisitor;

public class main {
    public static void main(String[] args) {
        Car car = new Car();

        CarElementVisitor printVisitor = new CarElementPrintVisitor();
        CarElementVisitor doVisitor = new CarElementDoVisitor();

        printVisitor.visit(car);
        doVisitor.visit(car);
    }
}
