import java.util.List;


public class Model {

    public static void initStorage() {
        Laptop lap1 = new Laptop("Lenovo", "Nvidia", "Intel", 16, 1024, "Windows", "black", 35000);
        Laptop lap2 = new Laptop("Samsung", "Nvidia", "Intel", 32, 1024,"Windows", "gray", 48000);
        Laptop lap3 = new Laptop("Apple", "AMD RX", "M1", 32, 2048, "macOS", "silver", 130000);
        Laptop lap4 = new Laptop("Lenovo", "AMD Radeon", "AMD", 8, 512, "Windows", "black", 30000);
        Laptop lap5 = new Laptop("Lenovo", "AMD Radeon", "AMD", 8, 512, "Windows", "black", 30000);
        Laptop lap6 = new Laptop("Apple", "AMD RX", "M1 Max", 64, 4096, "macOS", "silver", 210000);
        Laptop lap7 = new Laptop("Irbis", "Intel HD", "Intel Celeron", 4, 128, "Linux", "gray", 19999);

        List<Laptop> laptops = List.of(lap1, lap2, lap3, lap4, lap5, lap6, lap7);

        LaptopStorage storage = new LaptopStorage();
        storage.addLaptops(laptops);
    }

    public void addLaptops(List<Laptop> laptopList) {
        LaptopStorage.storage.addAll(laptopList);
    }

    public static void addSpecs() {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            LaptopStorage.availableBrands.add(laptop.getBrand());
            LaptopStorage.availableVideoCard.add(laptop.getVideoCard());
            LaptopStorage.availableCPU.add(laptop.getCpu());
            LaptopStorage.availableRam.add(laptop.getRamMemory());
            LaptopStorage.availableHardDriveMemory.add(laptop.getHardDriveCap());
            LaptopStorage.availableOS.add(laptop.getOS());
            LaptopStorage.availableColors.add(laptop.getColor());
            LaptopStorage.availablePrices.add(laptop.getPrice());
        }
    }

    public static void run() {
        initStorage();
        addSpecs();
        Controller.menu();
    }
}
