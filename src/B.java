/**
 * Created by ashah on 11/7/17.
 */
public class B extends A {

    /**
     * printHello throws NullPointerException in class A hence printHello in B cant throw any super class Exception
     *
     * @throws NullPointerException
     */
    @Override
    public void printHello() throws NullPointerException/*Exception*/ {
        System.out.println("Hello in B class");
    }

    private static void howAreYou() {
        System.out.println("How are you in B class");
    }
}
