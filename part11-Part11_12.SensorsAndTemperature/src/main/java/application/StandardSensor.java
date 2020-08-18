package application;

/**
 *
 * @author micheal
 */
public class StandardSensor implements Sensor {
    private int temperature;
    
    public StandardSensor(int temperature){
        this.temperature = temperature;
    }
    @Override
    public boolean isOn() {
        // A standard sensor is always on.
        return true;
    }

    @Override
    public void setOn() {
        // Calling the methods setOn and setOff have no effect.
    }

    @Override
    public void setOff() {
        // Calling the methods setOn and setOff have no effect. 
    }

    @Override
    public int read() {
        return this.temperature;
    }
    
}
