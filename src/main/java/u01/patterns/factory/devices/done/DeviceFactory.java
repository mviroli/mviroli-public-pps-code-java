package u01.patterns.factory.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public interface DeviceFactory {

    Device createStandardDevice(String name);

    Device createBrokenDevice(String name);

    Device createRandomDevice(String name);

}
