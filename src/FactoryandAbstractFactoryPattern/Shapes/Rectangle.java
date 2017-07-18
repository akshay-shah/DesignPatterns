package FactoryandAbstractFactoryPattern.Shapes;

import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class Rectangle implements Shape {
    @Override
    public void onDraw() {
        System.out.println("Inside Rectangle onDraw()");
    }
}
