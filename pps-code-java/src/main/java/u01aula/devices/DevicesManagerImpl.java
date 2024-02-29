package u01aula.devices;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DevicesManagerImpl implements DevicesManager {

    private final Set<Device> devices = new HashSet<>();

    @Override
    public void addDevice(Device d1) {
        this.devices.add(d1);
    }

    @Override
    public Set<Device> getDevices() {
        return Collections.unmodifiableSet(this.devices);
    }

    @Override
    public void switchOnAll() {
        for (Device device : this.devices) {
            device.switchOn();
        }
    }
}
