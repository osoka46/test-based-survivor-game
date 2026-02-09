package locations;

import core.Player;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player,"Forest");
    }


    @Override
    boolean onLocation() {
        return false;
    }
}

