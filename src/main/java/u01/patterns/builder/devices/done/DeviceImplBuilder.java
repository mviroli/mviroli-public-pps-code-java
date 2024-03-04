package u01.patterns.builder.devices.done;

public class DeviceImplBuilder {
    private String name = "Device";
    private String description = "";

    public DeviceImplBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DeviceImplBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public DeviceImpl createDeviceImpl() {
        return new DeviceImpl(name, description);
    }
}