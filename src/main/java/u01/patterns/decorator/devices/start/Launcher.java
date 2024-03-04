package u01.patterns.decorator.devices.start;

/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        Device d1 = new DeviceImpl("A");
        Device d2 = new DeviceWithIntensityImpl("A");
        Device d3 = new BrokenDeviceImpl("A");
        // what about a device with intensity and with logging capabilities?
    }
}
