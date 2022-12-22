import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio(10);
        radio.setRadioStation(9);
        int expected = 9;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation1() {
        Radio radio = new Radio(10);
        radio.setRadioStation(1);
        int expected = 1;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationMinus() {
        Radio radio = new Radio(10);
        radio.setRadioStation(-1);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation2() {
        Radio radio = new Radio(10);
        radio.setRadioStation(8);
        int expected = 8;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNull() {
        Radio radio = new Radio(10);
        radio.setRadioStation(0);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio(10);
        radio.setRadioStation(10);
         int expected = 0;
         int actual = radio.getRadioStation();
         Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationMax() {
        Radio radio = new Radio(10);
        radio.setRadioStation(9);
        int expected = 0;
        int actual = radio.setToNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio radio = new Radio(10);
        radio.setRadioStation(7);
        int expected = 8;
        int actual = radio.setToNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStation() {
        Radio radio = new Radio(10);
        radio.setRadioStation(3);
        int expected = 2;
        int actual = radio.setToPrevStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToPrevStationMin() {
        Radio radio = new Radio(10);
        radio.setRadioStation(0);
        int expected = 9;
        int actual = radio.setToPrevStation();
        Assertions.assertEquals(expected, actual);
    }

//    Громкость

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolumeMinus() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolume99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 100;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToDecreaseVolume100(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 99;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolume99(){
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 98;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolumeMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume100() {
        Radio radio = new Radio();
        radio.maxVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolume101() {
        Radio radio = new Radio();
        radio.maxVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume99() {
        Radio radio = new Radio();
        radio.maxVolume(99);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume0() {
        Radio radio = new Radio();
        radio.minVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume1() {
        Radio radio = new Radio();
        radio.minVolume(1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume2() {
        Radio radio = new Radio();
        radio.minVolume(2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolumeMinus() {
        Radio radio = new Radio();
        radio.minVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolumeMinus2() {
        Radio radio = new Radio();
        radio.minVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
