package u01.patterns.factory.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        DeviceFactory factory = new DeviceFactoryImpl();
        Device d1 = factory.createStandardDevice("A");
        Device d2 = factory.createBrokenDevice("A");
    }
}
