package Jan20.Factory;

/*
 * Factory method pattern enables us to create an object without exposing the creation logic to the client and refer to the newly-created object using a common interface. It is one of the most widely used creational patterns.
 This pattern is also known as the Virtual Constructor.

 The intent of this pattern, according to Design Patterns by Gamma et al, is to:

 Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method allows a class to defer instantiation to subclasses.
 The Factory method is for creating objects. A superclass specifies all standard and generic behavior and then delegates the creation details to subclasses that are supplied by the client.

 The Factory method makes a design more customizable and only a little more complicated. Other design patterns require new classes, whereas Factory only requires a new operation.
 */
public class Applciation {

    //https://dzone.com/articles/factory-method-design-pattern
    public static void main(String[] args) {

        GeomentricShape line = ShapeFactory.getShape(ShapesTypes.LINE);
        printInfo(line);

        GeomentricShape rectangle = ShapeFactory.getShape(ShapesTypes.RECTANGLE);
        printInfo(rectangle);

        GeomentricShape circle = ShapeFactory.getShape(ShapesTypes.SQUARE);
        printInfo(circle);

    }


    public static void printInfo(GeomentricShape shape) {
        if (shape != null) {
            System.out.println("The factory for the " + shape.getClass() + " is called.");
        } else {
            System.out.println("The shape cannot be drawn.");
        }
    }
}
