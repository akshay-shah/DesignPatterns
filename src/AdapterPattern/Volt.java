package AdapterPattern;

/**
 * Created by ashah on 3/8/17.
 * Project : DesignPatterns.
 */
public class Volt {
    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public void setVolt(int v) {
        this.volts = v;
    }

    public int getVolt() {
        return this.volts;
    }
}

