package aula.u01b.step4.devices;

public abstract class AbstractDevice implements Device {

    protected boolean on;

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
        if (this.canSwitchOn()){
            this.actualSwitchOn();
            this.onSwitch();
        }
    }

    protected abstract void onSwitch();

    protected abstract boolean canSwitchOn();
}
