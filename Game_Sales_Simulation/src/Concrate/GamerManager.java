package Concrate;

import Abstract.BaseGamerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;
import java.util.Scanner;

public class GamerManager implements BaseGamerService {

    Scanner scan = new Scanner(System.in);
    private List<Gamer> gamerList;

    public GamerManager(List<Gamer> gamerList) {
        this.gamerList = gamerList;
    }

    @Override
    public void save(Gamer gamer) {
        System.out.println("Adınızı girin:");
        gamer.setFirstName(scan.nextLine());
        System.out.println("Soyadınızı girin:");
        gamer.setLastName(scan.nextLine());
        System.out.println("E-posta adresinizi girin:");
        gamer.seteMail(scan.nextLine());
        System.out.println("Parolanızı oluşturun:");
        gamer.setPassword(scan.nextLine());
        gamerList.add(gamer);
        System.out.println(gamer.getFirstName() + " kaydınız gerçekleştirildi.");
    }

    @Override
    public void update(Gamer gamer) {
        int newVar;
        String strNewVar;
        System.out.println("Güncellemek istediğiniz bilgiyi seçin.\n1-AD  2-SOYAD   3-MAIL   4-PAROLA");
        int choose = scan.nextInt();
        if (choose == 1) {
            System.out.println("Yeni değeri girin:");
            strNewVar = scan.next();
            gamer.setFirstName(strNewVar);
        } else if (choose == 2) {
            System.out.println("Yeni değeri girin:");
            strNewVar = scan.next();
            gamer.setLastName(strNewVar);
        } else if (choose == 3) {
            System.out.println("Yeni değeri girin:");
            strNewVar = scan.next();
            gamer.seteMail(strNewVar);
        } else if (choose == 4) {
            System.out.println("Yeni değeri girin:");
            strNewVar = scan.next();
            gamer.setPassword(strNewVar);
        } else {
            System.out.println("Hatalı seçim yaptınız");
            update(gamer);
        }
        System.out.println("Bilgileriniz güncellendi.");
    }

    @Override
    public void delete(Gamer gamer) {
        gamerList.remove(gamer);
        System.out.println("Kayıt silindi.");
    }

    @Override
    public Gamer login() {
        System.out.println("Kayıtlı e-posta adresinizi girin:");
        String mail = scan.next();
        scan.nextLine();
        System.out.println("Parolanızı girin:");
        String password = scan.nextLine();
        for (Gamer gamers : gamerList) {
            if (gamers.getPassword().equals(password) && gamers.geteMail().equals(mail)) {
                return gamers;
            }
        }
        return null;
    }

    @Override
    public void showProfile(Gamer gamer) {
        String profile = gamer.toString();
        System.out.println(profile);
    }

    @Override
    public void showGames(Gamer gamer) {
        System.out.println("KAYDOLDUĞUNUZ OYUNLAR");
        System.out.println("------------------------");
        for (Game games : gamer.getGames()) {
            System.out.println(games.getName());
        }
        System.out.println("\n");
        System.out.println("KAYDOLDUĞUNUZ KAMPANYALI OYUNLAR");
        System.out.println("------------------------");
        for (Campaign campaigns : gamer.getCampaigns()) {
            System.out.println(campaigns.getName());
        }
    }
}

