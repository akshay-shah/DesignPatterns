package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class FactoryDemo {
    /**
     * Implementing factory pattern
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.onDraw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.onDraw();
        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.onDraw();
    }
}
