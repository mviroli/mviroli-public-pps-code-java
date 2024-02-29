package aula.u01.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    private Device device;

    @BeforeEach
    void setUp() {
        this.device = new DeviceImpl();
    }

    @Test
    void testIsInitiallyOff(){
        assertFalse(this.device.isOn());
    }

    @Test
    void testCanBeSwitchedOn(){
        this.device.switchOn();
        assertTrue(this.device.isOn());
    }

    @Test
    void testCanBeSwitchedOff(){
        this.device.switchOn();
        this.device.switchOff();
        assertFalse(this.device.isOn());
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

    @Test
    void testSwitchOnIfAlreadyOnFails(){
        this.device.switchOn();
        assertThrows(IllegalStateException.class, () -> this.device.switchOn());
    }

    @Test
    void testSwitchOffIfAlreadyOffDoesNothing(){
        this.device.switchOff();
        assertFalse(this.device.isOn());
    }
}