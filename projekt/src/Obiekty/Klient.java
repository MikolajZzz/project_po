package Obiekty;

public class Klient {
    private int id;
    private String login;
    private String haslo;

    // Konstruktor
    public Klient(int id, String login, String haslo) {
        this.id = id;
        this.login = login;
        this.haslo = haslo;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}