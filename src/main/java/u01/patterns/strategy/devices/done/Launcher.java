package u01.patterns.strategy.devices.done;

public class Launcher {
    public static void main(String[] args) {
        DeviceManagerImpl manager = new DeviceManagerImpl();

        manager.addDevice(new DeviceImpl("A"));
        manager.addDevice(new DeviceImpl("B"));
        manager.addDevice(new DeviceImpl("B"));
        manager.addDevice(new DeviceImpl("A"));

        System.out.println(manager.filteredDevices((d)->d.getName().equals("A")));
    }
}
