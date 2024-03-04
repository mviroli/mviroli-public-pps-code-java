package u01.devices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceImplTest {

    private static final int N_OF_ATTEMPTS = 10;
    private DeviceImpl device;

    @BeforeEach
    public void setUp() throws Exception {
        this.device = new DeviceImpl();
    }

    @Test
    public void isInitiallyOff() {
        assertFalse(this.device.isOn());
    }

    @Test
    public void canBeSwitchedOn() {
        this.device.on();
        assertTrue(this.device.isOn());
    }

    @Test
    public void canBeSwitchedOff() {
        this.device.on();
        this.device.off();
        assertFalse(this.device.isOn());
    }

    @Test
    public void canBeSwitchedOnTwice() {
        this.device.on();
        this.device.off();
        this.device.on();
        assertTrue(this.device.isOn());
    }

    @Test
    public void onIsIdempotent() {
        this.device.on();
        this.device.on();
        assertTrue(this.device.isOn());
    }

    @Test
    public void canBeSwitchedOffTwice() {
        this.device.on();
        this.device.off();
        this.device.on();
        this.device.off();
        assertFalse(this.device.isOn());
    }

    @Test
    public void canBeSwitchedMultipleTimes() {
        switchOnAndOffMultipleTimes();
        this.device.on();
        assertTrue(this.device.isOn());
    }

    private void switchOnAndOffMultipleTimes() {
        for (int i = 0; i < N_OF_ATTEMPTS; i++) {
            this.device.on();
            this.device.off();
        }
    }

    @Test
    public void initiallyWorks() {
        assertTrue(this.device.isWorking());
    }

    @Test
    public void typicallyWorks() {
        switchOnAndOffMultipleTimes();
        assertTrue(this.device.isWorking());
    }

    @Test
    public void canStopWorking() {
        switchOnAndOffMultipleTimes();
        this.device.stopWorking();
        assertFalse(this.device.isWorking());
        this.device.on();
        assertFalse(this.device.isWorking());
        assertFalse(this.device.isOn());
    }
}