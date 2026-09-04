public class MusicPlayer implements Device {

    @Override
    public void turnOn() {
        System.out.println("Music Player is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Music Player is OFF.");
    }

    public void playMusic() {
        System.out.println("Music Player is playing the Rilaneh Maganda playlist.");
    }

    public void increaseVolume() {
        System.out.println("Music Player volume increased.");
    }

    public void decreaseVolume() {
        System.out.println("Music Player volume decreased.");
    }
}