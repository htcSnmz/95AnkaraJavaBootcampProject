package Concrate;

import Abstract.BaseSalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;
import java.util.Scanner;

public class SalesManagement implements BaseSalesManagement {
    Scanner scan = new Scanner(System.in);

    public void buy(Gamer gamer, List<Game> gameList) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        for (Game games : gameList) {
            System.out.println(i + "--> " + games.getName() + " " + games.getPrice() + " TL");
            i++;
        }
        System.out.println("\nTüm oyunlar listelendi. Bir seçim yapın.");
        int gameChoose = scan.nextInt();
        Game game = gameList.get(gameChoose -1);
        gamer.getGames().add(game);
        System.out.println(gamer.getFirstName() + " " + game.getName() + " oyununu satın aldınız.");

    }

    public void campaignBuy(Gamer gamer, List<Campaign> campaignList) {

        int i = 1;
        for (Campaign campaigns : campaignList) {
            System.out.println(i + "--> " + campaigns.getPrice() + " TL'lik " + campaigns.getName() + " oyunu % " + campaigns.getDiscountRate() + " indirimle " + campaigns.getDiscountedPrice() + " TL");
            i++;
        }
        System.out.println("\nTüm kampanyalı oyunlar listelendi. Bir seçim yapın.");
        int campaingChoose = scan.nextInt();
        Campaign campaign = campaignList.get(campaingChoose-1);
        gamer.getCampaigns().add(campaign);
        System.out.println("Tebrikler! " + gamer.getFirstName() + " " + campaign.getName() + " oyununu kampanyalı aldınız.");
    }


}
