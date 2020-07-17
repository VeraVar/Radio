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