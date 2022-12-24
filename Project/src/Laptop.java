import java.util.Objects;

public class Laptop {
    private String brand;
    private int ramMemory;
    private int hardDriveCap;
    private String opSystem;
    private String color;

    public Laptop(String brand, int ramMemory, int hardDriveCap, String opSystem, String color) {
        this.brand = brand;
        this.ramMemory = ramMemory;
        this.hardDriveCap = hardDriveCap;
        this.opSystem = opSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ramMemory == laptop.ramMemory && hardDriveCap == laptop.hardDriveCap && Objects.equals(brand, laptop.brand) && Objects.equals(opSystem, laptop.opSystem) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ramMemory, hardDriveCap, opSystem, color);
    }

    public int getHardDriveCap() {
        return hardDriveCap;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public String getColor() {
        return color;
    }
}

