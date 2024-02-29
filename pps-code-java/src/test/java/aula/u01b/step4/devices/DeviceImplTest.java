package aula.u01b.step4.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceImplTest extends DeviceTest {

    @BeforeEach
    void setUp() {
        this.device = new DeviceImpl();
    }

    @Test
    void testCanBeSwitchedOnMultipleTimes(){
        final int numberOfSwitchingAttempts = 100;
        for (int i = 0; i < numberOfSwitchingAttempts; i++){
            this.device.switchOn();
            this.device.switchOff();
        }
        this.device.switchOn();
        assertTrue(this.device.isOn());
    }

}