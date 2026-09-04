public class DecreaseTemperatureCommand implements Command {

    private Aircon aircon;

    public DecreaseTemperatureCommand(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public void execute() {
        aircon.decreaseTemperature();
    }
}