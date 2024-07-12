//Strategy
class Rectangle extends Shape {
    private ChangeShapeColor strategy;

    Rectangle(ChangeShapeColor strategy) {
        this.strategy = strategy;
    }

    void setStrategy(ChangeShapeColor strategy) {
        this.strategy = strategy;
    }

    @Override
    void showShape() {
        strategy.changeShapeColor();
    }
}