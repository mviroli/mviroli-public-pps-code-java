package u01.patterns.adapter.devices.start;

import java.util.List;

/**
 * An encapsulated manager of devices
 */
public interface DeviceManager {

    /**
     * Adds a device to be managed
     * @param device
     */
    void addDevice(Device device);

    /**
     * @return an immutable version of the list of added devices
     */
    List<Device> devices();

    /**
     * Switches on all the devices that are working
     */
    void switchAllOn();

    /**
     * Switches off all the devices
     */
    void switchAllOff();

    /**
     * @return whether all devices are switched on
     */
    boolean allOn();

    /**
     * @return whether all devices are working
     */
    boolean allWorking();

}