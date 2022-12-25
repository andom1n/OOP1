public class Radio {
    private int radioStation;
    private int currentVolume;
        
    public int getCurrentVolume() {
        return currentVolume;
    }
    
    public int getRadioStation() {
        return radioStation;
    }

    public int setToNextStation() {
        if (radioStation < 9) {
            radioStation = radioStation + 1;
        }
        if (radioStation == 9) {
            radioStation = 0;
        }
        return radioStation;
    }

    public int setToPrevStation() {
        if (radioStation > 0) {
            radioStation = radioStation - 1;
        }
        if (radioStation == 0) {
            radioStation = 9;
        }
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }
    
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
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
}
