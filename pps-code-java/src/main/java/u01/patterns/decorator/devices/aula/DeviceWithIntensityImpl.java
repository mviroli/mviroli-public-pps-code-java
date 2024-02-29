package u01.patterns.decorator.devices.aula;

/**
 * Created by mirko on 11/6/16.
 */
public class DeviceWithIntensityImpl extends DeviceDecorator {

    private int intensity;

    public DeviceWithIntensityImpl(Device device) {
        super(device);
    }

    public void increaseIntensity(){
        this.intensity = this.getIntensity() + 1;
    }

    public int getIntensity() {
        return intensity;
    }

}
