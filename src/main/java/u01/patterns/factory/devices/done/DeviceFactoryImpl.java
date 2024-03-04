package u01.patterns.factory.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public final class DeviceFactoryImpl implements DeviceFactory {

    @Override
    public Device createStandardDevice(String name) {
        return new DeviceImpl(name);
    }

    @Override
    public Device createBrokenDevice(String name) {
        return new BrokenDeviceImpl(name);
    }

    @Override
    public Device createRandomDevice(String name) {
        return Math.random()>0.5 ? createStandardDevice(name) : createBrokenDevice(name);
    }
}
