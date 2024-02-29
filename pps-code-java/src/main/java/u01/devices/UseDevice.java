package u01.devices;

public class UseDevice {

    public static void main(String[] args) {
        Device d = new DeviceImpl();
        System.out.println(d.isOn());
    }
}
