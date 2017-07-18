package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.Shapes.Circle;
import FactoryandAbstractFactoryPattern.Shapes.Rectangle;
import FactoryandAbstractFactoryPattern.Shapes.Square;
import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class ShapeFactory {
    /**
     * Returns object of Shape
     * @param shape
     * @return
     */
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else
            return null;
    }
}
