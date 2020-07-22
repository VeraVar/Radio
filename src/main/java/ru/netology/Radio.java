package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private int minNumberRadioStation;
    private int maxNumberRadioStation;
    private int currentNumberRadioStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume;

    public void setCurrentNumberRadioStation(int currentNumberRadioStation) {
        if (currentNumberRadioStation > maxNumberRadioStation) {
            this.currentNumberRadioStation = maxNumberRadioStation;
            return;
        }
        if (currentNumberRadioStation < minNumberRadioStation) {
            this.currentNumberRadioStation = minNumberRadioStation;
            return;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public void nextNumberRadioStation() {
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation++;
        }
        if (currentNumberRadioStation >= maxNumberRadioStation) {
            currentNumberRadioStation = minNumberRadioStation;
        }
    }

    public void prevNumberRadioStation() {
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation--;
        }
        if (currentNumberRadioStation <= minNumberRadioStation) {
            currentNumberRadioStation = maxNumberRadioStation;
        }
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