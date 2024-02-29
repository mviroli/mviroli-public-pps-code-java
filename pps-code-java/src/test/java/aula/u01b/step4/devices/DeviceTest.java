package aula.u01b.step4.devices;

import aula.u01b.step4.devices.Device;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class DeviceTest {

    protected Device device;

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