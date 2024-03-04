package u01.oop;

import java.util.*;

public class ControllerImpl implements Controller {

    private final List<Device> devices;

    public ControllerImpl(){
        devices = new LinkedList<>();
    }

    @Override
    public void addDevice(final Device device){
        devices.add(device);
    }

    @Override
    public void setAllOn(){
        for (final Device d: devices){
            d.on();
        }
    }

    @Override
    public void setAllOff(){
        for (final Device d: devices){
            d.off();
        }
    }

    @Override
    public boolean allOn() {
        for (final Device d: devices){
            if (!d.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "ControllerImpl{" +"devices=" + devices + '}';
    }
}