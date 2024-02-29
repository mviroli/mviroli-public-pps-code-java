package aula.u01b.step2.devices;

import aula.u01b.step2.devices.Device;
import aula.u01b.step2.devices.FailingDevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailingDeviceTest {

    public static final int LIFETIME = 3;
    private Device device;

    @BeforeEach
    void setUp() {
        this.device = new FailingDevice(LIFETIME);
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