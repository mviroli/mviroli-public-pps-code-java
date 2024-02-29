package aula.u01b.step5.devices;

public interface FailStrategy {

    void onSwitch(Device device);

    boolean canSwitchOn();
}
