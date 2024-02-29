package aula.u01b.step2.devices;

public class FailingDevice extends DeviceImpl {

    private int lifetime;

    public FailingDevice(final int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public void switchOn() {
        if (this.lifetime > 0){
            super.switchOn();
            this.lifetime--;
        }
    }
}
