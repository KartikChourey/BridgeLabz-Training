package gamebox;

import java.util.*;

class User {

    private List<Game> ownedGames = new ArrayList<>();

    public void buyGame(Game game) {
        ownedGames.add(game);
    }
}
