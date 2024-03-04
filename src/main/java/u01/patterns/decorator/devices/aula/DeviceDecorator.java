package u01.patterns.decorator.devices.aula;

public class DeviceDecorator implements Device {
    protected final Device device;

    public DeviceDecorator(Device device) {
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
