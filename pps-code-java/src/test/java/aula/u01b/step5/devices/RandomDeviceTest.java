package aula.u01b.step5.devices;

import org.junit.jupiter.api.BeforeEach;

class RandomDeviceTest extends DeviceTest {

    @BeforeEach
    void setUp() {
        super.initFactory();
        this.device = this.deviceFactory.randomDevice();
    }
}