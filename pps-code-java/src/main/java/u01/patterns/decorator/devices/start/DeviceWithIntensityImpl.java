package u01.patterns.decorator.devices.start;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceWithIntensityImpl implements Device {

    private boolean on;
    private boolean working;
    private final String name;
    private int intensity;

    public DeviceWithIntensityImpl(String name) {
        this.on = false;
        this.working = true;
        this.name = name;
        this.intensity = 0;
    }

    @Override
    public void on() {
        if (this.isWorking()) {
            this.on = true;
        }
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public boolean isWorking() {
        return this.working;
    }

    public void increaseIntensity(){
        this.intensity = this.getIntensity() + 1;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getIntensity() {
        return intensity;
    }
}
