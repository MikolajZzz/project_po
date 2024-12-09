import funkcje.*;

public class Main {
    public static void main(String[] args) {
        int choice=1;
        while(true) {
            choice = Menu.startMenu();
            if (choice==0){
                break;
            }
            switch (choice) {
                case 1:
                    choice = Menu.startMenu();
                    break;
                case 2:
                    System.out.println("Logowanie pracownika...");
                    break;
                case 3:
                    System.out.println("Tworzenie konta klienta...");
                    break;
                default:
                    System.out.println("Błąd: nieprawidłowy wybór.");
            }

        }
    }
}