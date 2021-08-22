package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.List;


public interface BaseSalesManagement {
   void buy(Gamer gamer, List<Game> gameList);
   void campaignBuy(Gamer gamer, List<Campaign> campaignList)  ;
}
