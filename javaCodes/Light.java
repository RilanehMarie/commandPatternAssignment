public class Light implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light is ON: Brightness set to 100%.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF.");
    }
}