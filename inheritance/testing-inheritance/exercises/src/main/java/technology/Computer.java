package technology;

public class Computer {
    private int ramSize;
    private String brand;
    private String colour;
    public Computer(){

    }

    public Computer(int ramSize, String brand, String colour) {
        this.ramSize = ramSize;
        this.brand = brand;
        this.colour = colour;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
