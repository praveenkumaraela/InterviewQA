package Jan20.Factory;

import javax.management.ListenerNotFoundException;

public abstract class ShapeFactory {

    public static GeomentricShape getShape(ShapesTypes name){
        GeomentricShape shape = null;
            switch (name){
                case LINE:
                    shape = new Line();
                    break;
                case SQUARE:
                    shape = new Square();
                    break;
                case RECTANGLE:
                    shape = new Rectangle();
                    break;
        }
        return shape;
    }
}
