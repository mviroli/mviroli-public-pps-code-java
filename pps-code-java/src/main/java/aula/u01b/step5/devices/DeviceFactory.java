package aula.u01b.step5.devices;

public interface DeviceFactory {
    Device solidDevice();

    Device failingDevice(int lifetime);

    Device randomDevice();
}
