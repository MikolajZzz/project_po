import funkcje.*;


public class Main {
    public static void main(String[] args) {
        int choice;
        while (true) {
            choice = Menu.startMenu();
            if (choice == -1) { // Exit condition
                System.out.println("Dziękujemy za skorzystanie z programu. Do widzenia!");
                break;
            }

            switch (choice) {
                case 1:
                    int id=Menu.logowanie_klienta();
                    if (id == -1) {
                        choice=0;
                    }
                    System.out.println(id);
                    break;
                case 2:
                    System.out.println("Logowanie pracownika...");
                    break;
                case 3:
                    System.out.println("Tworzenie konta klienta...");
                    break;
                default:
                    System.out.println("Błąd: nieprawidłowy wybór."); // Should not occur
            }
        }
    }
}
