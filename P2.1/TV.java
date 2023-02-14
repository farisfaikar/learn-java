// Nama: Faris Faikar Razannafi
// NIM: 4611421092
// PBO: Kelompok 1

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

    // constructor
    public TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    // methods
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (newChannel > maxChannel) {
            channel = maxChannel;
            System.out.println(
                    "Input channel is too large (" + newChannel + "), channel defaults to: " + maxChannel);
        } else if (newChannel < minChannel) {
            channel = minChannel;
            System.out.println(
                    "Input channel is too small (" + newChannel + "), channel defaults to: " + minChannel);
        } else
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        if (newVolumeLevel > maxVolume) {
            volumeLevel = maxVolume;
            System.out.println(
                    "Input volume is too large (" + newVolumeLevel + "), volume defaults to: " + maxVolume);
        } else if (newVolumeLevel < minVolume) {
            volumeLevel = minVolume;
            System.out.println(
                    "Input volume is too small (" + newVolumeLevel + "), volume defaults to: " + minVolume);
        } else
            volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if (channel < maxChannel)
            channel++;
        else
            channel = minChannel;
    }

    public void channelDown() {
        if (channel > minChannel)
            channel--;
        else
            channel = maxChannel;
    }

    public void volumeUp() {
        if (volumeLevel < maxVolume)
            volumeLevel++;
        else
            volumeLevel = minVolume;
    }

    public void volumeDown() {
        if (volumeLevel > minVolume)
            volumeLevel--;
        else
            volumeLevel = maxVolume;
    }
}
