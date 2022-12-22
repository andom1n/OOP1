public class Radio {
    private int radioStation;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int countStation) {
        maxStation = countStation - 1;
    }
    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation > maxStation) {
            return;
        }
        if (radioStation < 0) {
            return;
        }
        this.radioStation = radioStation;
    }
    public int setToNextStation() {
        if (radioStation < maxStation) {
            radioStation = radioStation + 1;
        }
        if (radioStation == maxStation) {
            radioStation = 0;
        }
        return radioStation;
    }

    public int setToPrevStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        }
        if (radioStation == 0) {
            radioStation = maxStation;
        }
        return radioStation;
    }

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
