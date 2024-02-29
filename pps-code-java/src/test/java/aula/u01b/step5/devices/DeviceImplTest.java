package aula.u01b.step5.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceImplTest extends DeviceTest {

    @BeforeEach
    void setUp() {
        super.initFactory();
        this.device = this.deviceFactory.solidDevice();
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