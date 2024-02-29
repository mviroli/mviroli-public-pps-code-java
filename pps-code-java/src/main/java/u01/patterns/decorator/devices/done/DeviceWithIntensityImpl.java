package u01.patterns.decorator.devices.done;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceWithIntensityImpl implements Device {

    private final Device device;
    private int intensity;

    public DeviceWithIntensityImpl(Device device) {
        this.device = device;
    }

    public void increaseIntensity(){
        this.intensity = this.getIntensity() + 1;
    }

    public int getIntensity() {
        return intensity;
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
