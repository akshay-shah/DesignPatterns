package FactoryandAbstractFactoryPattern.Colors;

import FactoryandAbstractFactoryPattern.Factory.Color;

/**
 * Created by ashah on 14/7/17.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green color");
    }
}
