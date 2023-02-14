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

    public TV(int channel, int volumeLevel, boolean on) {
        setChannel(channel);
        setVolume(volumeLevel);
        this.on = on;
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
                    "\033[31m!!!!! Input channel value is too large (" + newChannel + "), channel defaults to: "
                            + maxChannel + " !!!!!\033[0m");
        } else if (newChannel < minChannel) {
            channel = minChannel;
            System.out.println(
                    "\033[31m!!!!! Input channel value is too small (" + newChannel + "), channel defaults to: "
                            + minChannel + " !!!!!\033[0m");
        } else {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (newVolumeLevel > maxVolume) {
            volumeLevel = maxVolume;
            System.out.println(
                    "\033[31m!!!!! Input volume value is too large (" + newVolumeLevel + "), volume defaults to: "
                            + maxVolume + " !!!!!\033[0m");
        } else if (newVolumeLevel < minVolume) {
            volumeLevel = minVolume;
            System.out.println(
                    "\033[31m!!!!! Input volume value is too small (" + newVolumeLevel + "), volume defaults to: "
                            + minVolume + " !!!!!\033[0m");
        } else {
            volumeLevel = newVolumeLevel;
        }
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
        if (volumeLevel >= maxVolume)
            volumeLevel = maxVolume;
        else
            volumeLevel++;
    }

    public void volumeDown() {
        if (volumeLevel <= minVolume)
            volumeLevel = minVolume;
        else
            volumeLevel--;
    }
}
