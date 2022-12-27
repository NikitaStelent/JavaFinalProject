import java.util.Objects;

public class Laptop {
    private String brand;
    private String videoCard;
    private String cpu;
    private int ramMemory;
    private int hardDriveCap;
    private String opSystem;
    private String color;
    private double price;

    public Laptop(String brand, String videoCard, String cpu, int ramMemory, int hardDriveCap, String opSystem, String color, double price) {
        this.brand = brand;
        this.videoCard = videoCard;
        this.cpu = cpu;
        this.ramMemory = ramMemory;
        this.hardDriveCap = hardDriveCap;
        this.opSystem = opSystem;
        this.color = color;
        this.price = price;
    }

    public int getHardDriveCap() {
        return hardDriveCap;
    }

    public String getOS() {
        return opSystem;
    }

    public String getColor() {
        return color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public String getCpu() {
        return cpu;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamMemory() {
        return ramMemory;
    }
    public double getPrice() {
        return price;
    }
}

