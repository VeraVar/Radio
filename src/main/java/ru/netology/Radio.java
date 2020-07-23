package ru.netology;

public class Radio {
    private int minNumberRadioStation = 0;
    private int maxNumberRadioStation = 10;
    private int currentNumberRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int minNumberRadioStation, int maxNumberRadioStation, int currentNumberRadioStation, int minVolume, int maxVolume, int currentVolume) {
        this.minNumberRadioStation = minNumberRadioStation;
        this.maxNumberRadioStation = maxNumberRadioStation;
        this.currentNumberRadioStation = currentNumberRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

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