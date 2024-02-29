package aula.u01b.step2.devices;

public class DeviceImpl implements Device {

    private boolean on;

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void switchOn() {
        if (this.on){
            throw new IllegalStateException();
        }
        this.on = true;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }
}
