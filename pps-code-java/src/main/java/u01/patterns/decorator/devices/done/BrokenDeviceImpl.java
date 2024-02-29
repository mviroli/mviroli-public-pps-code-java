package u01.patterns.decorator.devices.done;

/**
 * Created by mirko on 11/6/16.
 */
public class BrokenDeviceImpl implements Device {


    private final Device device;

    public BrokenDeviceImpl(Device device) {
        this.device = device;
    }

    public void on() {
        device.on();
    }

    public void off() {
        device.off();
    }

    public boolean isOn() {
        return device.isOn();
    }

    public boolean isWorking() {
        return device.isWorking();
    }

    public String getName() {
        return device.getName();
    }
}