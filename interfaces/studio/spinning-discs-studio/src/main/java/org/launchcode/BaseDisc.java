package org.launchcode;

public class BaseDisc {

    private int discCapacity;
    private  String discLabel;
    private int spinSpeed;
    private String title;

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    public String getDiscLabel() {
        return discLabel;
    }

    public void setDiscLabel(String discLabel) {
        this.discLabel = discLabel;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
    public String getTitle() {
        return title;
    }
    public void settitle(String title) {
        this.title =title;
    }
}
