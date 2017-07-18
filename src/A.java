/**
 * Created by ashah on 11/7/17.
 */
public class A {

    A() {
        printHello();
        howAreYou();
    }

    public void printHello() throws NullPointerException {
        System.out.println("Hello in A class");
    }

    private static void howAreYou() {
        System.out.println("How are you in A class");
    }
}
