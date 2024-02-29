package aula.u01b.step3.devices;

public class FailingDevice implements Device {

    private DeviceImpl base = new DeviceImpl();
    private int lifetime;

    public FailingDevice(final int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public void switchOn() {
        if (this.lifetime > 0){
            base.switchOn();
            this.lifetime--;
        }
    }

    @Override
    public boolean isOn() {
        return base.isOn();
    }

    @Override
    public void switchOff() {
        base.switchOff();
    }
}
