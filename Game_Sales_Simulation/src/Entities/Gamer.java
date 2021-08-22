package Entities;

import Abstract.Entity;

import java.util.ArrayList;
import java.util.List;

public class Gamer extends Entity {
    private String firstName;
    private String lastName;
    private String eMail;
    private String password;
    private List<Game> games;
    private List<Campaign> campaigns;

    public Gamer() {
        this.games = games = new ArrayList<>();
        this.campaigns = campaigns = new ArrayList<>();
    }

    public Gamer(String firstName, String lastName, String eMail, String password, List<Game> games, List<Campaign> campaigns) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public String toString() {
        return "Ad: " + this.getFirstName() +
                "\nSoyad: " + this.getLastName() +
                "\nE-posta: " + this.geteMail() +
                "\n Parola: " + this.getPassword();
    }
}
