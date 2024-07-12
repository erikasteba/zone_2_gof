abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void showShape() {
        decoratedShape.showShape();
    }
}
