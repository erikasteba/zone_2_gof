Open file "Main.java".
Press "run".

1. FACTORY METHOD. 
ShapeFactory is an abstract class (creator), that has factory method "createShape", which is overridden 
by subclasses (concrete creators) "CircleFactory" and "SquareFactory" to create corresponding shapes (circle and square).
"Circle" and "Square" classes are concrete products, which implement "showShape()".

2. COMPOSITE
"Inventory" is composite class that contains different shapes. "Shape" class is a component, "Circle" and "Square" classes
are it`s leafs. Inventory class has method showShape(), which goes through the list of our shapes (List "items"contais
Shape objects, that were added by addItem() method) and calls this method for each object.

3. DECORATOR
Code shows this pattern by adding additional behavior to Shape object.
ColoredShape decorator wraps Square object to add new behavior.
Square is a concrete component here. ShapeDecorator is decorator which contains reference to a Shape object and calls it.
ColoredShape is a concrete decorator, which adds new behavior colorShapeInGreen() when we call showShape().

4. OBSERVER
Rhombus class notifies observers when its state changes.
Rhombus is a class, which has a list of observers, which it notifies about changes. "Observer" class is an abserver, that
has update() method, which is overriden by RhombusObserver (concrete observer) to tell about state change.
Rhombus calls showShape() method --> showShape() calls notifyObservers() --> notifyObservers() calls update() method on each registered observer.

5. STRATEGY
This pattern is showed by applying different behaviours for changing color for a Rectangle. 
"ChangeShapeColor" is interface with a method changeShapeColor(). "colorInBlue" and "colorInRed" classes implement it by
giving different behaviors. Rectangle class can change its color by switching between these 2 ChangeShapeColor strategies.


