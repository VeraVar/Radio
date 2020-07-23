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
        radio.setCurrentNumberRadioStation(5);
        assertEquals(5, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckMax() {
        radio.setCurrentNumberRadioStation(10);
        assertEquals(10, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckBelowMin() {
        radio.setCurrentNumberRadioStation(-1);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void setCurrentNumberRadioStationCheckOverMax() {
        radio.setCurrentNumberRadioStation(11);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationStart() {
        radio.setCurrentNumberRadioStation(0);
        radio.nextNumberRadioStation();
        assertEquals(1, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationNormal() {
        radio.setCurrentNumberRadioStation(5);
        radio.nextNumberRadioStation();
        assertEquals(6, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void nextNumberRadioStationSwitch() {
        radio.setCurrentNumberRadioStation(10);
        radio.nextNumberRadioStation();
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationStart() {
        radio.setCurrentNumberRadioStation(10);
        radio.prevNumberRadioStation();
        assertEquals(9, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationNormal() {
        radio.setCurrentNumberRadioStation(5);
        radio.prevNumberRadioStation();
        assertEquals(4, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStationSwitch() {
        radio.setCurrentNumberRadioStation(0);
        radio.prevNumberRadioStation();
        assertEquals(10, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void increaseCurrentVolumeNormal() {
        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeLimit() {
        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeOverMax() {
        radio.setCurrentVolume(101);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeNormal() {
        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
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