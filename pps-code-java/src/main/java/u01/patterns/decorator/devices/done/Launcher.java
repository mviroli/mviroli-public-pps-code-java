package u01.patterns.decorator.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        Device d1 = new DeviceImpl("A");
        Device d2 = new DeviceWithIntensityImpl(new DeviceImpl("A"));
        Device d3 = new BrokenDeviceImpl(new DeviceImpl("A"));
        Device d4 = new DeviceWithIntensityImpl(
                            new BrokenDeviceImpl(
                                    new DeviceImpl("A")));
    }
}
