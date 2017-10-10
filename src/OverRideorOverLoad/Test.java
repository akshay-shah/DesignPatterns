package OverRideorOverLoad;

import static java.lang.System.exit;

/**
 * Created by ashah on 10/10/17.
 * Project : DesignPatterns.
 */
public class Test {
    /*
    Static block gets initialised before void main
     */
    static {
        System.out.println("Static INitialized");
    }

    public static void main(String[] args) {
        new B().get().message();
    }
}
