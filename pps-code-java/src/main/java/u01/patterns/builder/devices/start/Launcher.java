package u01.patterns.builder.devices.start;


/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        Device d1 = new DeviceImpl("A", "a nice device");
        Device d2 = new DeviceImpl("A");
        Device d3 = new DeviceImpl();
    }
}
