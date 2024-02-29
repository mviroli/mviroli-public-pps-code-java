package aula.u01b.step3.devices;

public class DeviceImpl implements Device {
    protected boolean on;

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }

    @Override
    public void switchOn() {
        if (this.on){
            throw new IllegalStateException();
        }
        this.on = true;
    }
}
