import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LaptopStorage {

    static HashSet<Laptop> storage = new HashSet<>();
    static TreeSet<String> availableBrands = new TreeSet<>();
    static TreeSet<String> availableVideoCard = new TreeSet<>();
    static TreeSet<String> availableCPU = new TreeSet<>();
    static TreeSet<Integer> availableRam = new TreeSet<>();
    static TreeSet<Integer> availableHardDriveMemory = new TreeSet<>();
    static TreeSet<String> availableOS = new TreeSet<>();
    static TreeSet<String> availableColors = new TreeSet<>();
    static TreeSet<Double> availablePrices = new TreeSet<>();

    public void addLaptops(List<Laptop> laptopList) {
        storage.addAll(laptopList);
    }

    public static void addSpecs() {
        Views.printAvailable();
        for (Laptop laptop : storage) {
            availableBrands.add(laptop.getBrand());
            availableRam.add(laptop.getRamMemory());
            availableHardDriveMemory.add(laptop.getHardDriveCap());
            availableOS.add(laptop.getOS());
            availableColors.add(laptop.getColor());
            availablePrices.add(laptop.getPrice());
        }
    }
}



