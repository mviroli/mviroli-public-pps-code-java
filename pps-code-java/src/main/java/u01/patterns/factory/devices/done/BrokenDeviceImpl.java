package u01.patterns.factory.devices.done;

/**
 * Created by mirko on 11/6/16.
 */
public class BrokenDeviceImpl implements Device {

    private boolean on;
    private boolean working;
    private final String name;

    BrokenDeviceImpl(String name) {
        this.on = false;
        this.working = true;
        this.name = name;
    }

    @Override
    public void on() {
        if (this.isWorking()) {
            this.on = true;
        }
    }

    @Override
    public void off() {
        if (this.on){
            this.stopWorking();
        }
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
        this.on = false;
    }
}
