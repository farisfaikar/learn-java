// Nama: Faris Faikar Razannafi
// NIM: 4611421092

public class TV {
    // property
    int channel;
    int volumeLevel;
    boolean on;

    // private property
    private int minChannel = 1;
    private int maxChannel = 120;
    private int minVolume = 1;
    private int maxVolume = 7;

    public TV() {
        this.channel = 1;
        this.volumeLevel = 1;
        this.on = false;
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void setChannel(int newChannel) {
        channel = newChannel;
    }

    void setVolume(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }

    void channelUp() {
        if (channel < maxChannel)
            channel += 1;
        else
            channel = minChannel;
    }

    void channelDown() {
        if (channel > minChannel)
            channel -= 1;
        else
            channel = maxChannel;
    }

    void volumeUp() {
        if (volumeLevel < maxVolume)
            volumeLevel += 1;
        else
            volumeLevel = minVolume;
    }

    void volumeDown() {
        if (volumeLevel > minVolume)
            volumeLevel -= 1;
        else
            volumeLevel = maxVolume;
    }
}