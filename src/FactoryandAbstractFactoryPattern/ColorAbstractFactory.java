package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.AbstractFactory;
import FactoryandAbstractFactoryPattern.Colors.Blue;
import FactoryandAbstractFactoryPattern.Colors.Green;
import FactoryandAbstractFactoryPattern.Colors.Red;
import FactoryandAbstractFactoryPattern.Factory.Color;
import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class ColorAbstractFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        } else
            return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
