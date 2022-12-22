import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
         int expected = 0;
         int actual = radio.getRadioStation();
         Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationMax() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        int expected = 0;
        int actual = radio.setToNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStation() {
        Radio radio = new Radio();
        radio.setRadioStation(7);
        int expected = 8;
        int actual = radio.setToNextStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStation() {
        Radio radio = new Radio();
        radio.setRadioStation(3);
        int expected = 2;
        int actual = radio.setToPrevStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToPrevStationMin() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        int expected = 9;
        int actual = radio.setToPrevStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;
        int actual = radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.increaseVolume();
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
}
