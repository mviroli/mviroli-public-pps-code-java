package aula.u01b.step5.devices;

import java.util.Random;

public class DeviceFactoryImpl implements DeviceFactory {
    public Device randomDevice(){
        return new GenericDevice(new FailStrategy() {
            boolean switchedOnce;
            Random random = new Random();

            @Override
            public void onSwitch(Device device) {
                if (!switchedOnce){
                    this.switchedOnce = true;
                } else {
                    if (random.nextBoolean()){
                        device.switchOff();
                    }
                }
            }

            @Override
            public boolean canSwitchOn() {
                return true;
            }
        });
    }

    public Device solidDevice(){
        return new GenericDevice(new FailStrategy() {
            @Override
            public void onSwitch(final Device device) {
            }

            @Override
            public boolean canSwitchOn() {
                return true;
            }
        });
    }

    public Device failingDevice(final int lifetime){
        return new GenericDevice(new FailStrategy() {
            int lifeTime = lifetime;
            @Override
            public void onSwitch(final Device device) {
                lifeTime--;
            }

            @Override
            public boolean canSwitchOn() {
                return this.lifeTime > 0;
            }
        });
    }
}
