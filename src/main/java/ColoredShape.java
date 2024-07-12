//Decorator
class ColoredShape extends ShapeDecorator {
    public ColoredShape(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void showShape() {
        decoratedShape.showShape();
        colorShapeInGreen();
    }

    private void colorShapeInGreen() {
        System.out.println("Shape was painted in green");
    }
}