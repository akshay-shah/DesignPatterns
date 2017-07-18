package FactoryandAbstractFactoryPattern.Colors;

import FactoryandAbstractFactoryPattern.Factory.Color;

/**
 * Created by ashah on 14/7/17.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue color");
    }
}
