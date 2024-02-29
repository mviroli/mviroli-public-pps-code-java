package u01.patterns.tmethod.devices.start;

/**
 * Created by mirko on 11/6/16.
 */
public class BrokenDeviceImpl implements Device {

    private boolean on;
    private boolean working;
    private final String name;

    public BrokenDeviceImpl(String name) {
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
        if (this.on && Math.random()>0.95){
            this.stopWorking();
        }
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

    void stopWorking(){ // non-public method
        this.working = false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
