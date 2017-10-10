package OverRideorOverLoad;

/**
 * Created by ashah on 10/10/17.
 * Project : DesignPatterns.
 */
public class B extends A {


    /**
     * Overridden method can have different return types.
     * Valid only to DIRECT superclass
     * Is still overriding
     *
     * @return
     */
    @Override
    B get() {
        return new B();
    }

    void message() {
        System.out.println("B message");
    }
}
