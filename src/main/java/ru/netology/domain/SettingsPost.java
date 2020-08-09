package ru.netology.domain;

public class SettingsPost {
    private boolean disableComments;
    private boolean addSugnature;
    private boolean disableNotifications;
    private boolean advertisement;

    public boolean isDisableComments() {
        return disableComments;
    }

    public void setDisableComments(boolean disableComments) {
        this.disableComments = disableComments;
    }

    public boolean isAddSugnature() {
        return addSugnature;
    }

    public void setAddSugnature(boolean addSugnature) {
        this.addSugnature = addSugnature;
    }

    public boolean isDisableNotifications() {
        return disableNotifications;
    }

    public void setDisableNotifications(boolean disableNotifications) {
        this.disableNotifications = disableNotifications;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }
}
