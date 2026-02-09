package locations;

import core.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player,"Safe house.");
    }

    @Override
    boolean onLocation() {
        System.out.println("You are home. Your health is now full.");
        return false;
    }
}
