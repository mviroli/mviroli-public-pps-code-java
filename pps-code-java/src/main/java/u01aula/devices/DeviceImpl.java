package u01aula.devices;

public class DeviceImpl implements Device {

    private boolean on = false;

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void switchOn() {
        this.on = true;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }
}
