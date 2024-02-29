This document contains a description of the code in package u01b.patterns,
which includes illustrations of some pattern. Each subpackage has a "start"
subsubpackage with initial code, and one "done" with a solution obtained by
applying the pattern. Some of these examples may differ from the ones shown
during class.


Strategy
- DeviceManagerImpl has an additional devicesByName method, returning devices
with a given name
- to anticipare changes that can create many such methods in different versions
one applies Strategy to abstract from the actual selection of devices to return
- in the solution a method filteredDevices is used which takes a java.util.function.Predicate
as input, which is actually the Strategy interface

Template Method
- an additional BrokenDeviceImpl is created, very similar to DeviceImpl, just
changing off() method so as to crash the device after one use
- to follow DRY principle, and anticipate possible creation of new such Devices,
 TemplateMethod is applied
- DeviceImpl becomes AbstractDevice, in which off() calls a protected abstract method,
implemented in different ways by DeviceImpl and BrokeDeviceImpl

Decorator
- a simplified BrokenDeviceImpl is added: off() just does nothing!
- a DeviceWithIntensityImpl is added that provides also getIntensity and increaseIntensity
- how could we easily mix and match those two new behaviours into a new Device implementation
easily? Decorator does this
- first an AbstractDevice is created that factors the common properties of the two impls
- then the two classes decorate a Device: they both extend Device, and delegate a Device
- now a BrokenDeviceImpl can decorate a DeviceWithIntensityImpl that can decorate a DeviceImpl
- see the Launcher (and consider also how java.io.InputStream works)

Adapter
- DeviceManager is implemented in a DeviceManagerImpl
- Client happens to work against a different MyDeviceManager abstraction
- MyDeviceManagerAdapter implements MyDeviceManager but delegates a DeviceManager

Abstract Factory
- an additional BrokenDeviceImpl is created
- we do not like to use concrete names in Launcher: it is a rigid way of creating objects
- we create a DeviceFactory interface with various creation methods
- we implement it so as to use available classes, but in a hidden way

Builder
- DeviceImpl has now three constructs, managing default values: not really following KISS
- a builder can be easily created (e.g., with IntelliJ refactoring tool)
- a builder (like java.lang.StringBuffer) has setters for each needed argument
- a create object can check if everything is ok, and then create the proper Device
- a fluent interface (with setters returning 'this') can be used to simplify working
with the Builder