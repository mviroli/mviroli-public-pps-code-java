package u01.patterns.decorator.devices.aula;

/**
 * An interface modelling a Device, which can be on/off.
 * It can also be non-working, meaning it is off and cannot be switched one.
 */
public interface Device {

    /**
     * Switches the device on
     */
    void on();

    /**
     * Switches the device off
     */
    void off();

    /**
     * @return whether the device is on
     */
    boolean isOn();

    /**
     * @return whether the device is actually working
     */
    boolean isWorking();

    /**
     *
     * @return the name of this device
     */
    String getName();
}