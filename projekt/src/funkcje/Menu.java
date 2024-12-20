package funkcje;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {

    public static int startMenu() {
        int wybor = 0;

        Scanner scanner = new Scanner(System.in);
            drukStartMenu();

            boolean valid = false;
            while (!valid) {
                if (scanner.hasNextInt()) {
                    wybor = scanner.nextInt();
                    scanner.nextLine();
                    if (wybor >= 1 && wybor <= 3) {
                        valid = true;
                    } else if (wybor == 4) {

                        wybor = -1;
                        valid = true;
                    } else {
                        drukBleduWyboru();
                        drukStartMenu();
                    }
                } else {
                    drukBleduWyboru();
                    drukStartMenu();
                    scanner.next();
                }
            }


        return wybor;
    }
    public static int logowanie_klienta(){ //działa chyba
        boolean logged = false;
        Scanner scanner = new Scanner(System.in); // Tworzymy obiekt Scanner do wczytywania danych z terminala

        System.out.println("Podaj login: ");
        String login = scanner.nextLine();

        System.out.println("Podaj hasło: ");
        String haslo = scanner.nextLine();
        String filePath = "projekt/src/Bazy_danych/klienci.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Pomijamy nagłówek pliku
            br.readLine();

            while ((line = br.readLine()) != null) {
                // Dzielimy linie pliku na części: ID, Login, Hasło

                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String id = parts[0];
                    String fileLogin = parts[1];
                    String fileHasło = parts[2];


                    // Sprawdzamy, czy login i hasło się zgadzają
                    if (login.equals(fileLogin) && haslo.equals(fileHasło)) {
                        System.out.println("Zalogowano pomyślnie!");
                        return Integer.parseInt(id); // Zwracamy ID klienta

                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku: " + e.getMessage());
        }

        System.out.println("Błedny login lub hasło");
        return -1;


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
