package aula.u01b.step4.devices;

import java.util.Random;

public class RandomDevice extends AbstractDevice {

    private boolean switchedOnce;
    private Random random = new Random();

    @Override
    protected void onSwitch() {
        if (!switchedOnce){
            this.switchedOnce = true;
        } else {
            if (random.nextBoolean()){
                this.switchOff();
            }
        }
    }

    @Override
    protected boolean canSwitchOn() {
        return true;
    }
}
