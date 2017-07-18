package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.Factory.Color;
import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
