package u01.patterns.builder.devices.start;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceImpl implements Device {

    private boolean on;
    private boolean working;
    private final String name;
    private final String description;

    public DeviceImpl() {
        this("Device");
    }

    public DeviceImpl(String name) {
        this(name,"");
    }

    public DeviceImpl(String name, String description) {
        this.description = description;
        this.on = false;
        this.working = true;
        this.name = name;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    void stopWorking(){ // non-public method
        this.working = false;
        this.off();
    }
}
