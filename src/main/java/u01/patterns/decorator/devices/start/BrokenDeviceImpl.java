package u01.patterns.decorator.devices.start;

/**
 * Created by mirko on 11/6/16.
 */
public class BrokenDeviceImpl implements Device {

    private boolean on;
    private boolean working;
    private final String name;

    public BrokenDeviceImpl(String name) {
        this.on = false;
        this.working = true;
        this.name = name;
    }

    @Override
    public void on() {
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

    @Override
    public String getName() {
        return this.name;
    }
}
