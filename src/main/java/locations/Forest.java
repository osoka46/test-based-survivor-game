package locations;

import core.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player,"Forest");
    }


    @Override
    public boolean onLocation() {
        System.out.println("You are in forest.");
        return false;
    }
}

