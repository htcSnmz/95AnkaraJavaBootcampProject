import Concrate.GamerManager;
import Concrate.SalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n---------------------------");
        System.out.println("OYUN KANALINA HOŞGELDİNİZ");
        System.out.println("---------------------------");

        List<Gamer> gamerList = new ArrayList<>();
        List<Campaign> campaignList = new ArrayList<>();
        List<Game> gameList = new ArrayList<>();

        gameList.add(new Game("Sims", 50.0));
        gameList.add(new Game("Need for Spped", 100.4));
        gameList.add(new Game("Pubg", 250.4));
        gameList.add(new Game("League of Legends", 450.0));


        campaignList.add(new Campaign("Mortal Kombat", 150.0, 10.0));
        campaignList.add(new Campaign("Call of Duty", 255.5, 20));
        campaignList.add(new Campaign("NBA", 150.0, 15.0));

        Start start = new Start(new GamerManager(gamerList), new SalesManagement(), gameList,gamerList, campaignList);
        start.startProgram();


    }
}

