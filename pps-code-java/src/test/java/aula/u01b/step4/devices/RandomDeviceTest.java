package aula.u01b.step4.devices;

import org.junit.jupiter.api.BeforeEach;

class RandomDeviceTest extends DeviceTest {

    @BeforeEach
    void setUp() {
        this.device = new RandomDevice();
    }
}