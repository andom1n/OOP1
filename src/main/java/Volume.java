public class Volume {

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume > 100) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public void maxVolume(int maxVolume) {
        if (maxVolume >= 100) {
            currentVolume = 100;
        }
        return;
    }

    public void minVolume(int minVolume) {
        if (minVolume <= 0) {
            currentVolume = 0;
        }
        return;
    }
}
