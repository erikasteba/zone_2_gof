import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GofTests {

    @Test
    void factoryMethodForCircleTest() {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();

        assertTrue(circle instanceof Circle);
        assertEquals("A circle", normalizeOutput(getOutput(circle)));
    }

    @Test
    void factoryMethodForSquareTest() {
        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();

        assertTrue(square instanceof Square);
        assertEquals("A square", normalizeOutput(getOutput(square)));
    }

    @Test
    void compositeForInventoryTest() {
        Inventory inventory = new Inventory();
        inventory.addItem(new Circle());
        inventory.addItem(new Square());

        assertEquals("Inventory has following items:A circleA square", normalizeOutput(getOutput(inventory)));
    }

    @Test
    void decoratorToColorSquareTest() {
        Shape square = new Square();
        Shape coloredSquare = new ColoredShape(square);

        assertEquals("A squareShape was painted in green", normalizeOutput(getOutput(coloredSquare)));
    }

    @Test
    void observerForRhombusTest() {
        Rhombus rhombus = new Rhombus();
        RhombusObserver observer = new RhombusObserver();
        rhombus.addObserver(observer);

        assertEquals("A rhombusNew object Rhombus is created", normalizeOutput(getOutput(rhombus)));
    }

    @Test
    void strategyForRectangleTest() {
        Rectangle rectangle = new Rectangle(new colorInRed());
        assertEquals("Shape is red", normalizeOutput(getOutput(rectangle)));

        rectangle.setStrategy(new colorInBlue());
        assertEquals("Shape is blue", normalizeOutput(getOutput(rectangle)));
    }


    private String getOutput(Shape shape) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        PrintStream systemOut = System.out;
        System.setOut(printStream);

        shape.showShape();

        System.out.flush();
        System.setOut(systemOut);
        return output.toString();
    }

    // we need this method, because otherwise assertion fails due to line separators
    private String normalizeOutput(String output) {
        return output.replace(System.lineSeparator(), "").replace("\n", "").replace("\r", "");
    }
}
