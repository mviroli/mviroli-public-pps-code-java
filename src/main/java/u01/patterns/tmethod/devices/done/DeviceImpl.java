package u01.patterns.tmethod.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public class DeviceImpl extends AbstractDevice {
    public DeviceImpl(String name) {
        super(name);
    }

    @Override
    protected void doWhenOff() {
    }
}
