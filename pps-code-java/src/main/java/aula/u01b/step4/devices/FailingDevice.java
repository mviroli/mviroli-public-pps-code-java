package aula.u01b.step4.devices;

public class FailingDevice extends AbstractDevice {

    private int lifetime;

    public FailingDevice(final int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    protected void onSwitch() {
        this.lifetime--;
    }

    @Override
    protected boolean canSwitchOn() {
        return this.lifetime > 0;
    }
}
