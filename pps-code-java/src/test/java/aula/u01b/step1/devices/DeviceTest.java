package aula.u01b.step1.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    protected Device device;

    @BeforeEach
    void setUp() {
        this.device = new DeviceImpl();
    }

    static class Specification extends DeviceTest {
        @Test
        void standardBehaviour(){
            assertFalse(device.isOn());
            device.switchOn();
            assertTrue(device.isOn());
            device.switchOff();
            assertFalse(device.isOn());
        }
    }

    static class EdgeCases extends DeviceTest {
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

    static class RegressionTests extends DeviceTest {
        @Test
        void testIsInitiallyOff() {
            assertFalse(this.device.isOn());
        }

        @Test
        void testCanBeSwitchedOn() {
            this.device.switchOn();
            assertTrue(this.device.isOn());
        }

        @Test
        void testCanBeSwitchedOff() {
            this.device.switchOn();
            this.device.switchOff();
            assertFalse(this.device.isOn());
        }

        @Test
        void testCanBeSwitchedOnMultipleTimes() {
            final int numberOfSwitchingAttempts = 100;
            for (int i = 0; i < numberOfSwitchingAttempts; i++) {
                this.device.switchOn();
                this.device.switchOff();
            }
            this.device.switchOn();
            assertTrue(this.device.isOn());
        }
    }
}