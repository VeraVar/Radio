package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void nextNumberRadioStation() {
        radio.nextNumberRadioStation(0);
        assertEquals(1, radio.getCurrentNumberRadioStation());

        radio.nextNumberRadioStation(4);
        assertEquals(5, radio.getCurrentNumberRadioStation());

        radio.nextNumberRadioStation(8);
        assertEquals(9, radio.getCurrentNumberRadioStation());

        radio.nextNumberRadioStation(9);
        assertEquals(0, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void prevNumberRadioStation() {
        radio.prevNumberRadioStation(9);
        assertEquals(8, radio.getCurrentNumberRadioStation());

        radio.prevNumberRadioStation(4);
        assertEquals(3, radio.getCurrentNumberRadioStation());

        radio.prevNumberRadioStation(1);
        assertEquals(0, radio.getCurrentNumberRadioStation());

        radio.prevNumberRadioStation(0);
        assertEquals(9, radio.getCurrentNumberRadioStation());
    }

    @Test
    public void increaseCurrentVolume() {
        radio.increaseCurrentVolume(0);
        assertEquals(1, radio.getCurrentVolume());

        radio.increaseCurrentVolume(5);
        assertEquals(6, radio.getCurrentVolume());

        radio.increaseCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume() {
        radio.decreaseCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());

        radio.decreaseCurrentVolume(5);
        assertEquals(4, radio.getCurrentVolume());

        radio.decreaseCurrentVolume(10);
        assertEquals(9, radio.getCurrentVolume());
    }
}