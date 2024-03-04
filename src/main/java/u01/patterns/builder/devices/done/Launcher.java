package u01.patterns.builder.devices.done;


/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        Device d1 = new DeviceImplBuilder().setName("A")
                                           .setDescription("a nice device")
                                           .createDeviceImpl();
        Device d2 = new DeviceImplBuilder().setName("A").createDeviceImpl();
        Device d3 = new DeviceImplBuilder().createDeviceImpl();
    }
}
