import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Views {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    static public void showMenu() {
        System.out.print("""
                
                Введите цифру для выбора критерия поиска:\s
                1 - Вывести весь ассортимент
                2 - Отфильтровать по комплектующим
                X - Выход из программы
                :\s""");
    }
    static public void showFilterMenu() {
        System.out.print("""
                
                Введите критерий поиска:\s
                1 - Бренд
                2 - Производитель видеокарты
                3 - Производитель процессора
                4 - ОЗУ
                5 - Объем ЖД
                6 - Операционная система
                7 - Цвет
                8 - Цена
                :\s""");
    }

    public static void showUserChoice(Laptop laptop) {
        System.out.println(ANSI_GREEN + "Brand: " + ANSI_RESET + laptop.getBrand() +
                ", " + ANSI_GREEN + "VCard: " + ANSI_RESET + laptop.getVideoCard() +
                ", " + ANSI_GREEN + "CPU: " + ANSI_RESET + laptop.getCpu() +
                ", " + ANSI_GREEN + "RAM: " + ANSI_RESET + laptop.getRamMemory() +
                " GB, " + ANSI_GREEN + "Memory: " + ANSI_RESET + laptop.getHardDriveCap() +
                " GB, " + ANSI_GREEN + "OS: " + ANSI_RESET + laptop.getOS() +
                ", " + ANSI_GREEN + "color: " + ANSI_RESET + laptop.getColor() +
                ", " + ANSI_GREEN + "price: " + ANSI_RESET + laptop.getPrice() + " ₽");
    }

    public static void showStorage() {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            showUserChoice(laptop);
        }
    }

    public static void filterBrand(String brand) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getBrand().equalsIgnoreCase(brand)) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterVideoCard(String videoCard) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getVideoCard().equalsIgnoreCase(videoCard) || laptop.getVideoCard().toLowerCase().contains(videoCard)) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterCPU(String cpu) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getCpu().equalsIgnoreCase(cpu) || laptop.getCpu().toLowerCase().contains(cpu)) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterRAM(int ram) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getRamMemory() == ram) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterMemory(int hardDriveMemory) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getHardDriveCap() == hardDriveMemory) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterOS(String os) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getOS().equalsIgnoreCase(os) || laptop.getOS().toLowerCase().contains(os)) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterColor(String color) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            if (laptop.getColor().equalsIgnoreCase(color) || laptop.getColor().contains(color)) {
                showUserChoice(laptop);
            }
        }
    }

    public static void filterPrice(Double price1, Double price2) {
        Views.printAvailable();
        for (Laptop laptop : LaptopStorage.storage) {
            double price = laptop.getPrice();
            if (price >= price1 && price <= price2) {
                showUserChoice(laptop);
            }
        }
    }


    public static void showPriceRange(TreeSet<Double> priceSet) {
        printPriceRange();
        List<Double> priceList = new ArrayList<>(priceSet);
        System.out.println(priceList.get(0) + " - " + priceList.get(priceList.size() - 1));
    }

    public static void showAvailableSpecs(TreeSet<String> specs, String choice) {
        switch (choice) {
            case "1" -> Views.printBrands();
            case "2" -> Views.printVideoCard();
            case "3" -> Views.printCPU();
            case "6" -> Views.printOS();
            case "7" -> Views.printColor();
        }
        System.out.println(specs);
        System.out.println();
    }

    public static void showAvailableSpecs2(TreeSet<Integer> specs, String choice) {
        switch (choice) {
            case "4" -> Views.printRam();
            case "5" -> Views.printHardMemory();
        }
        System.out.println(specs);
        System.out.println();
    }


    static public void printAvailable() {
        System.out.println(ANSI_YELLOW + "Доступные ноутбуки: " + ANSI_RESET);
    }

    static public void printBrands() {
        System.out.println(ANSI_YELLOW + "Доступные бренды: " + ANSI_RESET);
    }
    static public void printVideoCard() {
        System.out.println(ANSI_YELLOW + "Доступные видеокарты: " + ANSI_RESET);
    }

    static public void printCPU() {
        System.out.println(ANSI_YELLOW + "Доступные процессоры: " + ANSI_RESET);
    }
    static public void printRam() {
        System.out.println(ANSI_YELLOW + "Доступные объемы ОЗУ: " + ANSI_RESET);
    }

    static public void printHardMemory() {
        System.out.println(ANSI_YELLOW + "Доступные объемы памяти: " + ANSI_RESET);
    }

    static public void printOS() {
        System.out.println(ANSI_YELLOW + "Доступные операционные системы: " + ANSI_RESET);
    }
    static public void printColor() {
        System.out.println(ANSI_YELLOW + "Доступные цвета: " + ANSI_RESET);
    }
    static public void printPriceRange() {
        System.out.println(ANSI_YELLOW + "Доступный ценовой диапазон: " + ANSI_RESET);
    }
}
