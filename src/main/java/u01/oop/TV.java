package u01.oop;

public class TV implements Device {

    private boolean flag = true;

    @Override
    public void on() {
        flag = true;
    }

    @Override
    public void off() {
        flag = false;
    }

    @Override
    public boolean isOn() {
        return flag;
    }

    @Override
    public String toString() {
        return "TV{" + flag + "}";
    }
}