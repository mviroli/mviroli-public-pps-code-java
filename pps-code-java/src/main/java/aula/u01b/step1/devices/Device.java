package aula.u01b.step1.devices;

/*
    A device can be on or off, and can be switched on and off

    Evolution scenarios:
    1) Reorganise tests
    2) Refactor by composition: Proxy pattern and SRP principle
    3) Refactor by inheritance, and refactor tests: LSP/ISP principle
    4) Refactor into abstract class: Template Method, OCP principle
    5) Refactor with twisted composition: Strategy, DIP principle!
 */
public interface Device {
    boolean isOn();

    void switchOn();

    void switchOff();
}
