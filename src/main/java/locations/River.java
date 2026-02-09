package locations;

import core.Player;

public class River extends BattleLoc {
    public River(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return false;
    }
}
