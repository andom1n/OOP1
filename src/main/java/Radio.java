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


}
