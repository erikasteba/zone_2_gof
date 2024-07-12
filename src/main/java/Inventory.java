import java.util.ArrayList;
import java.util.List;

//Composite
class Inventory extends Shape {
    private List<Shape> items = new ArrayList<>();

    void addItem(Shape shape) {
        items.add(shape);
    }

    @Override
    void showShape() {
        System.out.println("Inventory has following items:");
        for (Shape shape : items) {
            shape.showShape();
        }
    }
}