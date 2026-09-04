public class Main {

    public static void main(String[] args) {

        CentralHub hub = new CentralHub();

        // LIGHT
        Device light = new Light();

        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);

        System.out.println("--- LIGHT ---");

        hub.setCommand(lightOn);
        hub.pressButton();

        hub.setCommand(lightOff);
        hub.pressButton();


        // MUSIC PLAYER
        MusicPlayer music = new MusicPlayer();

        Command musicOn = new TurnOnCommand(music);
        Command musicOff = new TurnOffCommand(music);
        Command playMusic = new PlayMusicCommand(music);
        Command increaseVolume = new IncreaseVolumeCommand(music);
        Command decreaseVolume = new DecreaseVolumeCommand(music);

        System.out.println("\n--- MUSIC PLAYER ---");

        hub.setCommand(musicOn);
        hub.pressButton();

        hub.setCommand(playMusic);
        hub.pressButton();

        hub.setCommand(increaseVolume);
        hub.pressButton();

        hub.setCommand(decreaseVolume);
        hub.pressButton();

        hub.setCommand(musicOff);
        hub.pressButton();


        // AIR CONDITIONER
        Aircon aircon = new Aircon();

        Command airconOn = new TurnOnCommand(aircon);
        Command airconOff = new TurnOffCommand(aircon);
        Command increaseTemperature =
                new IncreaseTemperatureCommand(aircon);
        Command decreaseTemperature =
                new DecreaseTemperatureCommand(aircon);

        System.out.println("\n--- AIR CONDITIONER ---");

        hub.setCommand(airconOn);
        hub.pressButton();

        hub.setCommand(increaseTemperature);
        hub.pressButton();

        hub.setCommand(decreaseTemperature);
        hub.pressButton();

        hub.setCommand(airconOff);
        hub.pressButton();
    }
}