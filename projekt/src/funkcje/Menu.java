package funkcje;

import java.util.Scanner;

public class Menu {

    public static int startMenu() {
        int wybor = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            drukStartMenu();

            boolean valid = false;
            while (!valid) {
                if (scanner.hasNextInt()) {
                    wybor = scanner.nextInt();
                    if (wybor >= 1 && wybor <= 3) {
                        valid = true;
                    } else if (wybor == 4) {
                        // Specjalny kod oznaczający wyjście
                        wybor = -1;
                        valid = true;
                    } else {
                        drukBleduWyboru();
                        drukStartMenu();
                    }
                } else {
                    drukBleduWyboru();
                    drukStartMenu();
                    scanner.next(); // Odrzucamy błędne wejście
                }
            }
        }

        return wybor;
    }

    private static void drukStartMenu() {
        System.out.println("==== MENU ====");
        System.out.println("1. Logowanie klienta");
        System.out.println("2. Logowanie pracownika");
        System.out.println("3. Utworzenie konta klienta");
        System.out.println("4. Wyjście");
    }

    private static void drukBleduWyboru() {
        System.out.println("Nieprawidłowy wybór.");
    }
}
