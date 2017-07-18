/**
 * Created by ashah on 11/7/17.
 */
public class Hello {
    private static Hello ourInstance = new Hello();

    public static Hello getInstance() {
        if (ourInstance == null) {
            ourInstance = new Hello();
        }
        return ourInstance;
    }

    private Hello() {
    }
}


