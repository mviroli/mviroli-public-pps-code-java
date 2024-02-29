package u01.devices;

public class DeviceImpl implements Device {

    private boolean on = false;
    private boolean works = true;

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
        return this.works;
    }

    public void stopWorking() {
        this.works = false;
        this.on = false;
    }
}
