public class Main {
    public static void main(String[] args) {
        //Factory Method for Circle
        ShapeFactory circleFactory = new CircleFactory();   // factory method creates a Circle
        Shape circle = circleFactory.createShape(); // factory method returns Circle object
        circle.showShape();  // Circle object uses overriden method
        ShapeFactory squareFactory = new SquareFactory();
        Shape squareShape = squareFactory.createShape();
        squareShape.showShape();
        System.out.println("\n");

        //Composite for inventory
        Inventory inventory = new Inventory(); // creating inventory,which is a composite
        inventory.addItem(new Circle()); // Adding a Circle to inventory
        inventory.addItem(new Square());
        inventory.showShape(); // showing what shapes our inventory contains
        System.out.println("\n");

        //Decorator for Square
        Square square = new Square();
        Shape coloredSquare = new ColoredShape(square);
        coloredSquare.showShape();
        System.out.println("\n");

        //Observer for Rhombus
        Rhombus rhombus = new Rhombus();
        Observer rhombusObserver = new RhombusObserver();
        rhombus.addObserver(rhombusObserver);
        rhombus.showShape();
        System.out.println("\n");

        //Strategy for Rectangle
        Rectangle rectangle = new Rectangle(new colorInRed());
        rectangle.showShape();
        rectangle.setStrategy(new colorInBlue());
        rectangle.showShape();

    }
}