package application;

import java.util.Random;

/**
 *
 * @author micheal
 */
public class TemperatureSensor implements Sensor {

    private boolean on;

    public TemperatureSensor() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void setOn() {
        this.on = true;
    }

    @Override
    public void setOff() {
        this.on = false;
    }

    @Override
    public int read() {
        if (!this.on) {
            throw new IllegalStateException("Senser is off and cannot be read.");
        }

        return new Random().nextInt(61) - 30;
    }

}
