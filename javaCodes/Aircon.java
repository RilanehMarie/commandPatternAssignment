public class Aircon implements Device {

    @Override
    public void turnOn() {
        System.out.println("Air Conditioner is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioner is OFF.");
    }

    public void increaseTemperature() {
        System.out.println("Air Conditioner temperature increased.");
    }

    public void decreaseTemperature() {
        System.out.println("Air Conditioner temperature decreased.");
    }
}