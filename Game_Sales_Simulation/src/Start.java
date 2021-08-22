import Abstract.BaseGamerService;
import Abstract.BaseSalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;
import java.util.Scanner;

public class Start {

    static Scanner scan = new Scanner(System.in);

    private BaseGamerService gamerService;
    private BaseSalesManagement salesManagement;
    private List<Game> gameList;
    private List<Campaign> campaignList;
    private List<Gamer> gamerList;

    public Start(BaseGamerService gamerService, BaseSalesManagement salesManagement, List<Game> gameList,
                 List<Gamer> gamerList, List<Campaign> campaignList) {
        this.gamerService = gamerService;
        this.salesManagement = salesManagement;
        this.gameList = gameList;
        this.gamerList = gamerList;
        this.campaignList = campaignList;
    }

    public void startProgram() {
        System.out.println("\n1-KAYIT OL     2-OTURUM AÇ     0-ÇIKIŞ");

        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        if (choose == 0) {
            System.out.println("Sistemden çıkılıyor...");
            return;
        } else if (choose == 1) {
            Gamer gamer = new Gamer();
            gamerService.save(gamer);
            showMenu(gamer);
        } else if (choose == 2) {
            Gamer gamer = gamerService.login();
            if (gamer != null) {
                System.out.println("Merhaba " + gamer.getFirstName());
                showMenu(gamer);
            } else {
                System.out.println("E-posta ya da şifre hatalı. Ya da sistemde kaydınız yok.");
                startProgram();
            }
        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyin.");
            startProgram();
        }
    }

    public void showMenu(Gamer gamer) {
        System.out.println("\n1- OYUN SATIN AL" +
                "\n2- KAMPANYALI OYUN SATIN AL" +
                "\n3- KAYITLI OYUNLARIMI GÖSTER     " +
                "\n4- BİLGİLERİMİ GÜNCELLE" +
                "\n5- KAYDIMI SİL" +
                "\n6- PROFİLİMİ GÖRÜNTÜLE" +
                "\n0- OTURUMU KAPAT");

        int choose = scan.nextInt();

        if (choose == 0) {
            System.out.println("Oturumunuz kapatıldı.\n");
            startProgram();
        } else if (choose == 1) {
            salesManagement.buy(gamer, gameList);
            showMenu(gamer);
        } else if (choose == 2) {
            salesManagement.campaignBuy(gamer, campaignList);
            showMenu(gamer);
        } else if (choose == 3) {
            gamerService.showGames(gamer);
            showMenu(gamer);
        } else if (choose == 4) {
            gamerService.update(gamer);
            gamerService.showProfile(gamer);
            showMenu(gamer);
        } else if (choose == 5) {
            gamerService.delete(gamer);
            startProgram();
        } else if (choose == 6) {
            gamerService.showProfile(gamer);
            showMenu(gamer);
        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyin.");
            showMenu(gamer);
        }
    }
}




