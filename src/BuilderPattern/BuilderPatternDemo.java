package BuilderPattern;

/**
 * Created by ashah on 18/7/17.
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
