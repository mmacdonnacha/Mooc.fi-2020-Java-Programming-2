package application;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> readingsList;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        long amountOn = this.sensorList.stream()
                .filter(sensor -> sensor.isOn())
                .count();

        return amountOn == this.sensorList.size();
    }

    @Override
    public void setOn() {
        sensorList.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensorList.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.sensorList.isEmpty() || !isOn()) {
            throw new IllegalStateException("Illegal State: Sensor list is empty or sensors are off.");
        }

        int average = (int) this.sensorList.stream()
                .mapToInt(sensor -> sensor.read())
                .average()
                .getAsDouble();
        
        this.readingsList.add(average);

        return average;
    }

    public void addSensor(Sensor toAdd) {
        // that can be used to add a new sensor for the average sensor to control.
        this.sensorList.add(toAdd);
    }

    public List<Integer> readings() {
       return this.readingsList;
    }
}
