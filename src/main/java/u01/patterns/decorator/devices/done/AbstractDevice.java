package u01.patterns.decorator.devices.done;

/**
 * Created by mirko on 11/6/16.
 */
public abstract class AbstractDevice implements Device {

    private boolean on;
    private boolean working;
    private final String name;

    public AbstractDevice(String name) {
        this.on = false;
        this.working = true;
        this.name = name;
    }

    @Override
    public void on() {
        if (this.isWorking()) {
            this.on = true;
            this.doAtOn();
        }
    }

    protected abstract void doAtOn();

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
        return this.working;
    }

    @Override
    public String getName() {
        return this.name;
    }

    void stopWorking(){ // non-public method
        this.working = false;
    }
}
