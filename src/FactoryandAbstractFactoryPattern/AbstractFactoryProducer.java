package FactoryandAbstractFactoryPattern;

/**
 * Created by ashah on 14/7/17.
 */
public class AbstractFactoryProducer {


    public AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Shape"))
            return new ShapeAbstractFactory();
        else if (choice.equalsIgnoreCase("color"))
            return new ColorAbstractFactory();
        return null;
    }
}
