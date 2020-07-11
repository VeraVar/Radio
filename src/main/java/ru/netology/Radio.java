package ru.netology;

public class Radio {
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 9;
    private int currentNumberRadioStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getMinNumberRadioStation() {
        return minNumberRadioStation;
    }

    public void setMinNumberRadioStation(int minNumberRadioStation) {
        this.minNumberRadioStation = minNumberRadioStation;
    }

    public int getMaxNumberRadioStation() {
        return maxNumberRadioStation;
    }

    public void setMaxNumberRadioStation(int maxNumberRadioStation) {
        this.maxNumberRadioStation = maxNumberRadioStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void nextNumberRadioStation(int currentNumberRadioStation) {
        currentNumberRadioStation++;
        if (currentNumberRadioStation > maxNumberRadioStation) {
            currentNumberRadioStation = 0;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public void prevNumberRadioStation(int currentNumberRadioStation) {
        currentNumberRadioStation--;
        if (currentNumberRadioStation < minNumberRadioStation) {
            currentNumberRadioStation = 9;
        }
        this.currentNumberRadioStation = currentNumberRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseCurrentVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseCurrentVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        this.currentVolume = currentVolume;
    }
}