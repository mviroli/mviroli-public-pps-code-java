package u01.patterns.adapter.devices.done;

import java.util.List;

/**
 * Created by mirko on 3/5/17.
 */
public interface MyDeviceManager {

    void addSomeDevices(List<Device> device);

    void switchOn(int position);

    void switchOff(int position);

}
