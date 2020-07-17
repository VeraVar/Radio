package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setCurrentNumberRadioStationCheckMin() {
        radio.setCurrentNumberRadioStation(0);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckMiddle() {
        radio.setCurrentNumberRadioStation(4);
        assertEquals(4, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckMax() {
        radio.setCurrentNumberRadioStation(9);
        assertEquals(9, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckBelowMin() {
        radio.setCurrentNumberRadioStation(-1);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckOverMax() {
        radio.setCurrentNumberRadioStation(10);
        assertEquals(9, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationStart() {
        radio.setCurrentNumberRadioStation(0);
        radio.nextNumberRadioStation();
        assertEquals(1, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationNormal() {
        radio.setCurrentNumberRadioStation(4);
        radio.nextNumberRadioStation();
        assertEquals(5, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationSwitch() {
        radio.setCurrentNumberRadioStation(9);
        radio.nextNumberRadioStation();
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationStart() {
        radio.setCurrentNumberRadioStation(9);
        radio.prevNumberRadioStation();
        assertEquals(8, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationNormal() {
        radio.setCurrentNumberRadioStation(4);
        radio.prevNumberRadioStation();
        assertEquals(3, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationSwitch() {
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumberRadioStation();
        assertEquals(9, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void increaseCurrentVolumeNormal() {
        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeLimit() {
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeOverMax() {
        radio.setCurrentVolume(11);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeNormal() {
        radio.setCurrentVolume(5);
        radio.decreaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeLimit() {
        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeBelowMin() {
        radio.setCurrentVolume(-1);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}