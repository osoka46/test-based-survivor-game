package locations;

import core.Player;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Cave");
    }

    @Override
    boolean onLocation() {
        System.out.println("You are in cave.");
        return false;
    }
}
