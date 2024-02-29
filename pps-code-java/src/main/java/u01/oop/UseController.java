package u01.oop;

public class UseController {

    public static void main(String[] args) {

        final Controller controller = new ControllerImpl();
        controller.addDevice(new TV());
        controller.addDevice(new EternalTV());
        controller.addDevice(new TV());
        controller.setAllOff();
        System.out.println(controller);
        // ControllerImpl{devices=[TV{false}, eTV{on}, TV{false}]}
        System.out.println(controller.allOn());
        // false
    }
}