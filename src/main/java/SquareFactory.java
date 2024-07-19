//Factory Method
class SquareFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Square();
    }
}