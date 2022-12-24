import java.util.List;
import java.util.Scanner;

public class Model {
    public static void init() {
        Laptop lap1 = new Laptop("Lenovo", 16, 1000, "Windows 11", "black");
        Laptop lap2 = new Laptop("Samsung", 32, 1000, "Windows 11", "silver");
        Laptop lap3 = new Laptop("Apple", 32, 2000, "macOS", "black");
        Laptop lap4 = new Laptop("Lenovo", 8, 512, "Windows 10", "black");
        Laptop lap5 = new Laptop("Lenovo", 8, 512, "Windows 10", "black");

        List<Laptop> laptops = List.of(lap1, lap2, lap3, lap4, lap5);

        LaptopStorage storage = new LaptopStorage();
        storage.addLaptops(laptops);
        storage.showStorage();
        storage.showBrand("Lenovo");
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean is_on = true;
        while (is_on) {
            System.out.println("""
                Введите цифру для выбора критерия поиска:\s
                1 - Бренд
                2 - ОЗУ
                3 - Объем ЖД
                4 - Операционная система
                5 - Цвет
                """);
            String choice = input.nextLine();
            switch (choice) {
                case "1" -> {
                }
            }

        }

    }

}
