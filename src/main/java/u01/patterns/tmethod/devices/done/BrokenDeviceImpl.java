package u01.patterns.tmethod.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public class BrokenDeviceImpl extends AbstractDevice {
    public BrokenDeviceImpl(String name) {
        super(name);
    }

    @Override
    protected void doWhenOff() {
        if (this.isOn() && Math.random()>0.95){
            this.stopWorking();
        }
    }
}
