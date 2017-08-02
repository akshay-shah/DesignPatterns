package BuilderPattern;

/**
 * Created by ashah on 18/7/17.
 * This pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when
 * the Object contains a lot of attributes. Builder pattern solves the issue with large number of optional
 * parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will
 * actually return the final Object.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("4gb", "4gb")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(" HDD " + computer.isBluetoothEnabled());
    }
}
