package u01.patterns.adapter.devices.done;

import java.util.List;

/**
 * Created by mirko on 3/5/17.
 */
public class MyDeviceManagerAdapter implements MyDeviceManager {

    final private DeviceManager manager;

    public MyDeviceManagerAdapter(DeviceManager manager) {
        this.manager = manager;
    }

    @Override
    public void addSomeDevices(List<Device> list) {
        for (Device dev: list){
            this.manager.addDevice(dev);
        }
    }

    @Override
    public void switchOn(int position) {
        this.manager.devices().get(position).on();
    }

    @Override
    public void switchOff(int position) {
        this.manager.devices().get(position).off();
    }
}
