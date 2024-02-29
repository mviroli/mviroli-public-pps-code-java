package u01aula.devices;

import java.util.Set;

public interface DevicesManager {

    void addDevice(Device d1);

    Set<Device> getDevices();

    void switchOnAll();
}
