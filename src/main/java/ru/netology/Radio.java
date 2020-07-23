package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Radio {
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 10;
    private int currentNumberRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        if (currentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation >= maxNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
            return;
        }
        currentNumberRadioStation++;
    }

    public void prevNumberRadioStation() {
        if (currentNumberRadioStation <= minNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
            return;
        }
        currentNumberRadioStation--;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}