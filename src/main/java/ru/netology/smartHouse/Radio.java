package ru.netology.smartHouse;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        setCurrentRadioStation(currentRadioStationNumber + 1);
    }

    public void prev() {
        setCurrentRadioStation(currentRadioStationNumber - 1);
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
