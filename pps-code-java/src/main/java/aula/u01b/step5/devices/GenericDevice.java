package aula.u01b.step5.devices;

public class GenericDevice implements Device {

    protected boolean on;
    private final FailStrategy failStrategy;

    public GenericDevice(FailStrategy failStrategy){
        this.failStrategy = failStrategy;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void switchOff() {
        this.on = false;
    }

    private void actualSwitchOn() {
        if (this.on){
            throw new IllegalStateException();
        }
        this.on = true;
    }

    @Override
    public void switchOn() {
        if (this.failStrategy.canSwitchOn()){
            this.actualSwitchOn();
            this.failStrategy.onSwitch(this);
        }
    }

}
