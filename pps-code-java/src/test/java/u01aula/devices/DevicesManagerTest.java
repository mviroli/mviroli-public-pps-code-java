package u01aula.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class DevicesManagerTest {

    DevicesManager manager;

    @BeforeEach
    void setUp() {
        this.manager = new DevicesManagerImpl();
    }

    @Test
    void correctlyAddDevices(){
        Device d1 = new DeviceImpl();
        Device d2 = new DeviceImpl();
        Device d3 = new DeviceImpl();
        this.manager.addDevice(d1);
        this.manager.addDevice(d2);
        this.manager.addDevice(d3);
        assertEquals(Set.of(d1,d2,d3), this.manager.getDevices());
    }

    @Test
    void canSwitchOnAll(){
        Device d1 = new DeviceImpl();
        Device d2 = new DeviceImpl();
        Device d3 = new DeviceImpl();
        this.manager.addDevice(d1);
        this.manager.addDevice(d2);
        this.manager.addDevice(d3);
        this.manager.switchOnAll();
        assertTrue(this.manager.getDevices().stream().allMatch(d -> d.isOn()));

    }
}