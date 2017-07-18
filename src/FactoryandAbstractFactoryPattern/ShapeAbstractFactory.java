package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.AbstractFactory;
import FactoryandAbstractFactoryPattern.Shapes.Circle;
import FactoryandAbstractFactoryPattern.Shapes.Rectangle;
import FactoryandAbstractFactoryPattern.Shapes.Square;
import FactoryandAbstractFactoryPattern.Factory.Color;
import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class ShapeAbstractFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
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
