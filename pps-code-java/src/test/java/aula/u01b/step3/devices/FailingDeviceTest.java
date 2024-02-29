package aula.u01b.step3.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailingDeviceTest extends DeviceTest {

    public static final int LIFETIME = 3;

    @BeforeEach
    void setUp() {
        this.device = new FailingDevice(LIFETIME);
    }

    @Test
    void testWorksUntilLifetime(){
        switchOnAndOff(LIFETIME - 1);
        this.device.switchOn();
        assertTrue(this.device.isOn());
    }

    private void switchOnAndOff(final int n) {
        for (int i = 0; i < n; i++) {
            this.device.switchOn();
            this.device.switchOff();
        }
    }

    @Test
    void testEventuallyStopsWorking(){
        switchOnAndOff(LIFETIME);
        this.device.switchOn();
        assertFalse(this.device.isOn());
    }
}