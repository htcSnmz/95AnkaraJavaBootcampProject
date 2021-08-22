package Abstract;

import Entities.Gamer;

public interface BaseGamerService {
    void save(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);
    void showGames(Gamer gamer);
    void showProfile(Gamer gamer);
    Gamer login();

}
