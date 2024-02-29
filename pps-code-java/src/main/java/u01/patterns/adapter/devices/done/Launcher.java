package u01.patterns.adapter.devices.done;

/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        DeviceManager manager = new DeviceManagerImpl();
        MyDeviceManager mymanager = new MyDeviceManagerAdapter(manager);
        Client client = new Client(mymanager); // what to put here?
        client.prepare();
    }
}
