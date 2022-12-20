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
        Volume volume = new Volume();
        volume.setCurrentVolume(9);
        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNoSetCurrentVolumeAboveMax() {
        Volume volume = new Volume();
        volume.setCurrentVolume(11);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolume() {
        Volume volume =new Volume();
        volume.setCurrentVolume(9);
        int expected = 10;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToIncreaseVolumeMax() {
        Volume volume =new Volume();
        volume.setCurrentVolume(10);
        int expected = 10;
        int actual = volume.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolume(){
        Volume volume = new Volume();
        volume.setCurrentVolume(1);
        int expected = 0;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToDecreaseVolumeMin(){
        Volume volume = new Volume();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.decreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}
