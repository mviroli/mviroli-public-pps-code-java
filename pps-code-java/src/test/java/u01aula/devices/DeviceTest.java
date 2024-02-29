package u01aula.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    private static final int ATTEMPTS = 100;
    private Device device;

    @BeforeEach
    void setUp() {
        this.device = new DeviceImpl();
    }

    @Test
    void isInitiallyOff(){
        assertFalse(this.device.isOn());
    }

    @Test
    void canBeSwitchedOn(){
        this.device.switchOn();
        assertTrue(this.device.isOn());
    }

    @Test
    void canBeSwitchedOnMultipleTimes(){
        this.switchOnOffManyTimes();
        this.canBeSwitchedOn();
    }

    private void switchOnOffManyTimes() {
        for (int i = 0; i < ATTEMPTS; i++) {
            this.device.switchOn();
            this.device.switchOff();
        }
    }
}