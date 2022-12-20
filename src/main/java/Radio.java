public class Radio {
    public int radioStation;

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

    public int getRadioStation() {
        return radioStation;
    }
    public void setRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            return;
        }
        radioStation = newRadioStation;
    }
}
