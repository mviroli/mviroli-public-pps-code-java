package u01.patterns.strategy.devices.done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceManagerImpl implements DeviceManager {

    private List<Device> devices = new ArrayList<>();

    @Override
    public void addDevice(Device device) {
        this.devices.add(device);
    }

    @Override
    public List<Device> devices() {
        return Collections.unmodifiableList(this.devices);
    }

    public List<Device> filteredDevices(Predicate<Device> predicate) {
        //return this.devices.stream().filter(predicate).collect(Collectors.toList());
        List<Device> list = new ArrayList<>();
        for (Device device: devices){
            if (predicate.test(device)){
                list.add(device);
            }
        }
        return Collections.unmodifiableList(list);
    }

    @Override
    public void switchAllOn() {
        this.devices.forEach(Device::on);
    }

    @Override
    public void switchAllOff() {
        this.devices.forEach(Device::off);
    }

    @Override
    public boolean allOn() {
        for (final Device device: this.devices()){
            if (!device.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean allWorking() {
        for (final Device device: this.devices()){
            if (!device.isWorking()){
                return false;
            }
        }
        return true;
    }
}
