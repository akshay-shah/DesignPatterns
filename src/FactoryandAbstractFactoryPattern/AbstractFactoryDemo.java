package FactoryandAbstractFactoryPattern;

import FactoryandAbstractFactoryPattern.Factory.Color;
import FactoryandAbstractFactoryPattern.Factory.Shape;

/**
 * Created by ashah on 14/7/17.
 */
public class AbstractFactoryDemo {
    public static void main(String[] kyc) {
        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractFactory factory = producer.getFactory("shape");
        Shape s = factory.getShape("circle");
        s.onDraw();
        AbstractFactory factory2 = producer.getFactory("color");
        Color c = factory2.getColor("blue");
        c.fill();

    }
}
