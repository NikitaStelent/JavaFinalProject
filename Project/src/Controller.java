import java.util.Scanner;

public class Controller {
    static Scanner input = new Scanner(System.in);
    public static void menu() {
        boolean is_on = true;
        while (is_on) {
            Views.showMenu();
            String choice = input.nextLine().toLowerCase();
            switch (choice) {
                case "1" -> {
                    Views.showStorage();
                }
                case "2" -> {
                    filterMenu();
                }
                case "x" -> {
                    input.close();
                    is_on = false;
                }
            }
        }
    }

    public static void filterMenu() {
        Views.showFilterMenu();
        String choice = input.nextLine().toLowerCase();
        switch (choice) {
            case "1" -> {
                Views.showAvailableSpecs(LaptopStorage.availableBrands, choice);
                System.out.println("Выберете бренд: ");
                String brandChoice = input.nextLine();
                Views.filterBrand(brandChoice);
            }
            case "2" -> {
                Views.showAvailableSpecs(LaptopStorage.availableVideoCard, choice);
                System.out.println("Выберете производителя видеокарты: ");
                String videoCardChoice = input.nextLine().toLowerCase();
                Views.filterVideoCard(videoCardChoice);
            }
            case "3" -> {
                Views.showAvailableSpecs(LaptopStorage.availableCPU, choice);
                System.out.println("Выберете производителя процессора: ");
                String cpuChoice = input.nextLine().toLowerCase();
                Views.filterCPU(cpuChoice);
            }
            case "4" -> {
                Views.showAvailableSpecs2(LaptopStorage.availableRam, choice);
                System.out.println("Выберете количество оперативной памяти: ");
                int ramChoice = input.nextInt();
                Views.filterRAM(ramChoice);
            }
            case "5" -> {
                Views.showAvailableSpecs2(LaptopStorage.availableHardDriveMemory, choice);
                System.out.println("Выберете объем жесткого диска: ");
                int memoryChoice = input.nextInt();
                Views.filterMemory(memoryChoice);
            }
            case "6" -> {
                Views.showAvailableSpecs(LaptopStorage.availableOS, choice);
                System.out.println("Выберете операционную систему: ");
                String osChoice = input.nextLine().toLowerCase();
                Views.filterOS(osChoice);
            }
            case "7" -> {
                Views.showAvailableSpecs(LaptopStorage.availableColors, choice);
                System.out.println("Выберете цвет: ");
                String colorChoice = input.nextLine();
                Views.filterColor(colorChoice);
            }
            case "8" -> {
                Views.showPriceRange(LaptopStorage.availablePrices);
                System.out.print("Минимальный порог стоимости: ");
                Double priceChoice1 = input.nextDouble();
                System.out.print("Максимальный порог стоимости: ");
                Double priceChoice2 = input.nextDouble();
                Views.filterPrice(priceChoice1, priceChoice2);
            }
        }
    }
}
