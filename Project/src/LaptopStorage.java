import java.util.HashSet;
import java.util.List;

public class LaptopStorage {

    HashSet<Laptop> storage = new HashSet<>();

    public void addLaptops(List<Laptop> laptopList) {
        this.storage.addAll(laptopList);
    }

    public void showUserChoice(Laptop laptop) {
        System.out.println("Brand: " + laptop.getBrand() +
                ", RAM: " + laptop.getRamMemory() +
                " GB, Memory: " + laptop.getHardDriveCap() +
                " GB, OS: " + laptop.getOpSystem() +
                ", color: " + laptop.getColor());
    }
    public void showStorage() {
        System.out.println("Доступные ноутбуки: ");
        for (Laptop laptop : storage) {
            showUserChoice(laptop);
        }
    }

    public void showBrand(String brand) {
        System.out.println("Доступные ноутбуки: ");
        for (Laptop laptop : storage) {
            if (laptop.getBrand().equals(brand)) {
                showUserChoice(laptop);
            }
        }
    }

}
